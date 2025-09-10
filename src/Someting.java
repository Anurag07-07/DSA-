class  Student{
    String name;
    int id;
    Student(String name,int id){
        this.name = name;
        this.id = id;
    }

    void Change_name(String name){
        this.name = name;
        System.out.println("The New Name is "+ (this.name));
    }
    void Change_id(int id){
        this.id = id;
        System.out.println("The New Name is "+ (this.id));
    }

    static void Show(String name,int age){
        System.out.println("The Name is "+ name);
        System.out.println("The Age is "+ age);
    }
}


public class Someting {
    public static void main(String[] args) {
//        Student a = new Student("Anurag",20);
//        System.out.println(a.name);
//        System.out.println(a.id);
//        a.Change_name("Aniket");
//        a.Change_id(50);
        Student.Show("Anurag",21);
    }
}
