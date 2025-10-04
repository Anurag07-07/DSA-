package ClassProblem;

import java.util.Scanner;

public class Runs {
    public static void Brute(int[] nums,int query) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= query; i++) {
            System.out.println("The Left Over");
            int left = sc.nextInt();
            System.out.println("Right Over");
            int right = sc.nextInt();
            int sum = 0;
            for (int j = left; j <=right ; j++) {
                sum+=nums[j];
            }

            System.out.println("The run is "+sum);
//            Time Complexity = O(query*n)
        }
    }

    public static void Better(int[] nums,int query) {
        int[] psum = new int[nums.length];
        psum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            psum[i] = psum[i-1]+nums[i];
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= query; i++) {
            System.out.println("The Left Over");
            int left = sc.nextInt();
            System.out.println("Right Over");
            int right = sc.nextInt();
            int sum = 0;
            if (left==0){
                sum = psum[right];
            }else {
                sum = psum[right]-psum[left-1];
            }

            System.out.println(sum);
//            Time Complexity = O(query+n)
        }
    }

    public static void main(String[] args) {
        int[] runs = {8,5,3,2,6,20,12,9,4,11};
//            psum    8 13 16 18 24 44 56 65 69 80
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Query");
        int query = sc.nextInt();
//        Brute(runs,query);
        Better(runs,query);
    }
}
