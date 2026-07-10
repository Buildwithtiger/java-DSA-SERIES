public class nestedwhileloop {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            int j=1;
            while (j<=10){
                System.out.print("* ");
                j++;
            }
           i++;
            System.out.println();
        }
    }
}
