package String;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder s = new java.lang.StringBuilder("Hello");
        s.append("world");
        System.out.println(s);
        s.insert(1,"iiiii");
        System.out.println(s);

    }
}
