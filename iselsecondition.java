import java.util.Scanner;

public class iselsecondition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("entyer the marks");
        int marks=sc.nextInt();
        if (marks>=35){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        System.out.println("entter age");
       int age=sc.nextInt();
       if (age>=18){
           System.out.println("you are elegable for vote");
       }else {
           System.out.println("you are not elegable for vote");
       }
       sc.close();
    }
}
