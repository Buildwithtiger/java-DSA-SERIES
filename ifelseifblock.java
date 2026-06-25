import java.util.Scanner;

public class ifelseifblock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur accurecy");
        int accurecy=sc.nextInt();
        if (accurecy>=90){
            System.out.println("execlent");
        }
        else if (accurecy>=75) {
            System.out.println("good");
        }
        else if (accurecy >=60) {
            System.out.println("good");
        }
        else {// default case its a optional case
            System.out.println("better next time");
        }
        sc.close();
    }
}
