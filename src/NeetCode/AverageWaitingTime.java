package NeetCode;

public class AverageWaitingTime {
    public static void main(String[] args) {
        int[][] customers = {{1,2},{2,5},{5,3}};

        int sum = 0,s=0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i][0]>s){
                int sum1 = customers[i][0]+customers[i][1];
                s = sum1;
                int sum2 = sum1-customers[i][0];
                sum+=sum2;
            }else {
                int sum1 = s+customers[i][1];
                int sum2 = sum1-customers[i][0];
                sum+=sum2;
                s = sum1;
            }
        }
    }
}
