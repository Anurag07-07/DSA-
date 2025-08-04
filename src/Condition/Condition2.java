package Condition;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int cost = 0;
        if (bill>=0 && bill<=100){
            int money = bill*5;
            cost = cost+money;
        } else if (bill>=101 && bill<=200) {
            int intialBill = 100*5;
            int secondBill = (bill-100)*7;
            int money = intialBill+secondBill;
            cost = cost+money;
        } else if (bill>=201 && bill<=300) {
            int intialBill = 100*5;
            int secondBill = 100*7;
            int thirdBill = (bill-200)*10;
            int money = intialBill+secondBill+thirdBill;
            cost = cost+money;
        }else {
            int intialBill = 100*5;
            int secondBill = 100*7;
            int thirdBill = 100*10;
            int finalBill = (bill-300)*12;
            int money = intialBill+secondBill+thirdBill+finalBill;
            cost = cost+money;
        }

        System.out.println("Total Bill is "+cost);
    }
}
