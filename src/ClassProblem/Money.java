package ClassProblem;

public class Money {

    public static void MoneyChange(int[] coins,int money) {
        if (money==0){
            return;
        }

        int i;
        for (i = coins.length-1; i >=0 ; i--) {
            if (coins[i]<=money){
                break;
            }
        }

        int Change = coins[i];
        System.out.println("The Change is "+Change);
        int left_money = money-Change;
        MoneyChange(coins,left_money);
    }

//    2402
//    1 2 5 10 20 50 100 200 500 1000
//    2402 - 1000 = 1402
//    The First Change is 1000
//    1402-1000 = 402
//    The Second Change is 1000
//    402-200 = 202
//    The Third Change is 200
//    202-200
//    The Fourth Change = 200
//    2-2 = 0
//    The Fifthe Change is 2
//    0
//

    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,100,200,500,1000};
        int money = 10056;
        MoneyChange(coins,money);
    }
}