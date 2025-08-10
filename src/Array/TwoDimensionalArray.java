package Array;
import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        //Declare The Array
        ArrayList<Integer> arr = new ArrayList<>();

        //Extent the capacity
        arr.ensureCapacity(1000);
        //Reduce the capacity
        arr.trimToSize();

        //Insert the Element
        arr.add(45);

        //Insert in the Middle
        arr.add(0,5);

        //update
        arr.set(1,12);

        //Get The Element
        System.out.println(arr.get(0));

        for (Integer x:arr){
            System.out.print(x+" ");
        }

        int x = 5;
        Integer y = 5; //more powerful as it contains behaviour
        y.toString(); //Convert into string

        //Arrayslist only understand daat interms of objects
        arr.add(x); //Autoboxing automatically convert int to Integer

        arr.remove(5); //Here 5 is index
        arr.remove(Integer.valueOf(5)); //Remove the 5 integer value

        //Remove all the 5
        while (arr.contains(Integer.valueOf(5))){
            arr.remove(Integer.valueOf(5));
        }
        */

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(6);

        while (arr.contains(Integer.valueOf(5))){
            arr.remove(Integer.valueOf(5));
        }

        for (Integer x:arr){
            System.out.print(x+" ");
        }
    }
}
