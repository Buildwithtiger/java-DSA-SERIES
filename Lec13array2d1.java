public class Lec13array2d1 {
    public static void main(String[] args) {
        int [] [] arr;
        arr = new int   [3][4];
        int [][] brr ={

                {22,44,22,33,44,55},
                {33,66,87,65,43,12,45,32,11,23},
                {44,8,22,33,5,8},
                {55,1}


        };
        System.out.println(brr[0][1]);
        System.out.println(brr[3][1]);
//        int rowlength = brr.length;
////        int collength = brr[0].length; this is use for semetric col length
//        for (int row=0; row<=rowlength-1;row++){
//            int collength = brr[row].length;// this is use for a simitric col length
//            for (int col=0;col<=collength-1;col++){
//                System.out.print(brr[row][col]);
//            }
//            System.out.println();
//        }
        for (int row=0;row<=brr.length-1;row++){
            for (int col=0;col<=brr[row].length-1;col++){// this is for all type of semetric or non-semitric arry
                System.out.print(brr[row][col]+" ");
            }
            System.out.println();
        }

    }
}
