package Array;

import java.util.Scanner;

public class RunsInMatch {

    public static void Brute(int[] arr ,int query) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1 ; i<=query;i++){
            System.out.println("Enter The Starting Over Start from 0 to "+(arr.length-1));
            int left = sc.nextInt();
            System.out.println("Enter The Ending Over Start from 0 to "+(arr.length-1));
            int right = sc.nextInt();

            int sum = 0;
            for (int j = left; j <= right ; j++) {
                sum += arr[j];
            }

            System.out.println("The Run from "+left+" to "+right+" is "+sum);
        }
    }

    public static void Better(int[] arr , int query) {
        Scanner sc = new Scanner(System.in);
        //Prefix Sum
        //What i will do is I will create an array and store the run after each over
        int[] psum = new int[arr.length];

        psum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            psum[i] = arr[i]+psum[i-1];
        }


        //Now We will find the Run
        for (int i = 1 ;i <= query; i++){
            System.out.println("Enter The Starting Over Start from 0 to "+(arr.length-1));
            int left = sc.nextInt();
            System.out.println("Enter The Ending Over Start from 0 to "+(arr.length-1));
            int right = sc.nextInt();
            int sum = 0;
            if (left==0){
                sum = psum[right];
            }else {
                sum = psum[right]-psum[left-1];
            }

            System.out.println("The Run from "+left+" to "+right+" is "+sum);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Runs in Each Over
        int[] runs = {8,5,3,2,6,20,12,9,4,11};

        System.out.println("Enter the Query");
        int query = sc.nextInt();

        Brute(runs,query);
        Better(runs,query);
    }
}
