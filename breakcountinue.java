public class breakcountinue {
    public static void main(String[] args) {
//        breakkk
        for (int i=1;i<=55;i++){
            if(i==3 )
                break;
            System.out.println("this is 32 "+i);
        }
//countinue
        for (int i=1;i<=55;i++){
            if(i==3 || i==6) {
                continue;
            }
            System.out.println("this is 32 "+i);
        }


    }
}
