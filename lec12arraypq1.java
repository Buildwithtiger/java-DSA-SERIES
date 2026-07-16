public class lec12arraypq1 {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66};
        int n=arr.length;
        int sum=0;
        for (int i=0;i<=n-1;i++){
            int val=arr[i];
            sum=sum+val;
        }
        System.out.println(sum);
    }
}
