public class LEC13arraypq {
    public static void main(String[] args) {
        int arr[]={11,-1,-3,88,66,22,34,54,99,6,999};
        int n=arr.length;
        int max=arr[0];
        for (int i=0;i<=n-1;i++){
            if (arr[i]>=max){
                max=arr[i];

            }
        }
        System.out.println(max);
    }
}
