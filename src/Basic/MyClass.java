package Basic;

class ObJ{
    public String name;
    ObJ(String name){
       this.name = name;
    }

    void greet(){
        System.out.println("Hello "+(this.name));
    }

    boolean isPrime(int n){
        for (int i = 2; i*i <= n ; i++) {
            if (n%i==0) return false;
        }
        return  true;
    }

    boolean isArmstrong(int n){
        int count = 0;
        while(n!=0){
            int last = n%10;
            count++;
            n/=10;
        }

        //Find the sum
        double sum = 0;
        while(n!=0){
            int last = n%10;
            sum = sum + Math.pow(last,count);
            n/=10;
        }

        if (sum == n){
            return  true;
        }

        return  false;
    }
}

public class MyClass {
    public static void main(String[] args) {
        ObJ b = new ObJ("Anurag");
//        System.out.println(b.name);
//        b.greet();
//        if (b.isPrime(3)){
//            System.out.println("prime");
//        }else {
//            System.out.println("No Prime");
//        }

        if (b.isArmstrong(153)){
            System.out.println("Armstrong");
        }else {
            System.out.println("not Armstrong");
        }
    }
}
