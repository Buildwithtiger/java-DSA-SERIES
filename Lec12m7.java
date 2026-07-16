public class Lec12m7 {
    static int add(int a,int b){
        int ans =a+b;
        return ans ;
    }
    static int add(int a,int b,int c){
        int ans1 =a+b+c;
        return ans1;
    }

    public static void main(String[] args) {
        int ans1= add(22,33);
        int ans2= add(22,33,44);
        System.out.println(ans1);
        System.out.println(ans2);
    }
}
