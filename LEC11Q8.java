public class LEC11Q8 {
    public static void main(String[] args) {
        int n=10;
        for (int row =1;row<=n;row++){
// for each row variable colm
            if (row==1 || row==2||row==n){
                for (int col=1;col<=row;col++){
                    System.out.print("* ");
                }

            }else{
                //middle row
                //1*
                System.out.print("* ");
                //row - 2 spaces
                for (int col=1;col<=(row-2);col++){
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
