import java.util.Scanner;

public class User_Defined {
    // Without Argument and return
    public static void main(String[] args) {


        main();
        greet();

        String S = testing2();
        System.out.println(S);


        Return_Name("AUTOMATION ENGINEER PRATICK DAS");
        //Return_Details("Pratick",30, 100000);



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter Age");
        int age = sc.nextInt();
        System.out.println("Enter Salary");
        double salary = sc.nextDouble();
        Return_Details(name,age,salary);
    }


    static void main() {
        System.out.println("Test Print");

    }

    static void greet() {
        System.out.println("Test Print 2 Pratick Das");
    }

    //without parameter but with return type

    static String testing2() {
        return "How are you";
    }

    //WITH PARAMETER AND WITHOUT RETURN TYPE(VOID)

    static void Return_Name(String name) {
        System.out.println("Hi your name is --> " + name);
    }

    static void Return_Details(String name, int age, double salary) {
        System.out.println("Hi, your name is --> " + name + ", Your age is --> " + age + ", Your salary is --> " + salary);


    }

}

