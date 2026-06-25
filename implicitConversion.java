public class implicitConversion {
    public static void main(String[] args) {

        //this is call implicit conversion
        byte n = 12;
        short newnum =n;
        int newn =n;
        long newne=n;
        System.out.println(newn);
        System.out.println(newne);
        System.out.println(newnum);

        //this is call explicit conversion
        long number= 1234567896;
        System.out.println(number);
        int newnumber= (int)number;
        System.out.println(newnumber);


//
//        // byte num =500;
//        System.out.println(n);
//        // System.o ut.println(num);
//        //  System.out.println(num); syntax error bcoz the byte range is -128 to 127
//        short num2 = 500;
//        System.out.println(num2); //short range is  -32,768 to 32,767
//        int  num3 = 123421323;
//        System.out.println(num3);//range is
//        long num4 = 232234567;
//        System.out.println(num4);// range is
//
//
//        // floating data types
//
//
//        float num5= 12.22f;  // f is mondaratory after assiging value  eg=  12.22f there is f is important to create float data types
//        System.out.println(num5);//6 to 7 digit prisition allow hai digit ke baad 6 to 7  number hi  alow hai
//        double num6 = 12.123719369273; //rane is 14-15 decimal tk hi allow hai
//        System.out.println(num6);
//
//        // other data types
//        boolean num7=true; // it is inn true or false only
//        System.out.println(num7);
//
//        String name =  "tiger";
//        System.out.println("my anem is  "+ name);
////        char a ="s";
////        System.out.println(a);

    }
}
