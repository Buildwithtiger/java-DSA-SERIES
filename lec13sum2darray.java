public class lec13sum2darray {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{1,2,3}};
        int sum=0;
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                int value=arr[row][col];
                sum=sum+value;
            }
            System.out.println(sum);
        }
    }
}
