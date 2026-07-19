public class Lec13array2d {
    public static void main(String[] args) {
        int [] [] arr;
        arr = new int   [3][4];
        int [][] brr ={

                {22,44},
                {33,66},
                {44,88},
                {55,100}


        };
        System.out.println(brr[0][1]);
        System.out.println(brr[3][1]);
        int rowlength = brr.length;
        int collength = brr[0].length;
        for (int row=0; row<=rowlength-1;row++){
            for (int col=0;col<=collength-1;col++){
                System.out.print(brr[row][col]);
            }
            System.out.println();
        }

    }
}
