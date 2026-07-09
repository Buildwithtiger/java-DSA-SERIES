public class LEC11Q6 {
    public static void main(String[] args) {
        int n=4;
        for (int row =1;row<=n;row++){
            for(int col=1;col<=row-1;col++){
                System.out.print(" ");
            }
            for (int i=1;i<=2*n-2*row+1;i++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
