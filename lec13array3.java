import java.util.Scanner;

public class lec13array3 {
    public static void main(String[] args) {
        int arr[]=new int[4];
        Scanner sc= new Scanner(System.in);
        int n=arr.length;
        for(int index=0;index<=n-1;index++){
            arr[index]=sc.nextInt();
        }
        System.out.println(arr);
        for (int i=0;i<=n-1;i++){
            System.out.println(arr[i]);
        }
    }
}
