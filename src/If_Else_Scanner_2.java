import java.util.Scanner;

public class If_Else_Scanner_2 {
    public static void main(String[] args) {

        Scanner A = new Scanner(System.in);

        System.out.println("Enter Your AGE");

        int age = A.nextInt();



        if (age > 18) {
            System.out.println("You can Vote");
        } else{
            System.out.println("Not Allowed TO Vote");
        }
    }
}
