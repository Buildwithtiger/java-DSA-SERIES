public class LEC11Q3 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){// //part 1 this is for number vof row
            for (int col=1;col<=n-row;col++){//this is for spaces
                System.out.print(" ");
             }
            //part 2for star
            for(int i=1;i<=n;i++){
                    System.out.print(" * ");
                  }
                  //move to next row
                  System.out.println();
        }
    }
}

