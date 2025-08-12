package String;

import java.util.Scanner;
import java.util.SortedMap;

public class StringClasses {

    public static void Occurance() {
        String doc = "this is a very large document on java, java can handle large numbers which are used for very large.....";
        String word = "large";
        //For One Index
//        System.out.println(doc.indexOf(word));

        //For all the index
        int idx = doc.indexOf(word);
        while(idx!=-1){
            System.out.print(idx+" ");
            idx = doc.indexOf(word,idx+1);
        }
    }

    public static void BasicOperation() {
        String s = new String("hello");
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.replace("h","B"));

        //Filter File
        String[] file = {"a.jpg","b.png","c.jpeg","d.sys","e.pdf"};

        for (String f:file){
            if (f.endsWith(".pdf")){
                System.out.println(f);
            }
        }
    }

    public static void LargestString() {

        Scanner sc = new Scanner(System.in);

        int largest_length = 0;
        String largest_String = "";

        System.out.println("Enter The Number of String to Compare");
        int n = sc.nextInt();

        //Consume First Enter
        sc.nextLine();

        for (int i = 1; i <=n; i++) {
            System.out.println("Enter the String");
            String s = sc.nextLine();

            if (s.length()>largest_length){
                largest_String = s;
            }
        }

        System.out.println("The Laregst String is "+largest_String);
    }

    public static void StringPrac() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Consume first enter
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        //Both s1 and s2 points to  same value in string pool as string pool contains unique string
//        String s1 = "Hello";
//        String s2 = "Hello";
//        System.out.println(s1 == s2);
//
//        //String is immutable
//        String s3 = new String("Hello");
//        String s4 = new String("Hello");
//        //== check value and reference both
//        System.out.println(s3==s4);
//        //It check only value
//        System.out.println(s3.equals(s4));
//        //To get access of particular char in string
//        System.out.println(s2.charAt(0));
//
//        //Convert String into char array
//        char[] arr = s2.toCharArray(); //This is new array with different Reference
//
//        //Convert the char array into String
//        String s5 = new String(arr);
//
//        //To Get length
//        System.out.println(arr.length);
//        System.out.println(s1.length());

//        StringPrac();
//        LargestString();
//        BasicOperation();
        Occurance();
    }
}
