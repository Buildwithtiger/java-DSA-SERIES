import java.math.BigInteger;
import java.util.Scanner;

public class takingIP {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int num1 =sc.nextInt();
        System.out.println("enter the secound num");
        int num2 =sc.nextInt();
       int ans = num1 + num2;
        System.out.println("answerv is ="+ans);



       BigInteger bg= sc.nextBigInteger();
        System.out.println("big interger is"+bg);
        System.out.println("enter floating value ");
        float fl=sc.nextFloat();
        System.out.println(fl);
        System.out.println("enter short value");
        short sh= sc.nextShort();
        System.out.println(sh);
        sc.close();



//        char ch = sc.hasNext("d");
//        System.out.println("char is");

    }
}
