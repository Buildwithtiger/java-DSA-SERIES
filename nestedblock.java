import java.util.*;
public class nestedblock {
    public static void main(String[] args) {
        int age=20;
        char gender='F';
        if (gender=='M'){
            System.out.println("you are Male");
            if (age>=19){
                System.out.println("you are elegable fot vote");
            }else{
                System.out.println("you are not elegable");
            }

        }else{
            System.out.println("you are not Male");
            if (age>=19){
                System.out.println("you are  elegable fot vote");
            }else{
                System.out.println("you are not elegable");
            }
        }

    }
}
