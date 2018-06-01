public class MinOfTwo {

    public static int minFunc(int n1,int n2) {
        int min;
        if(n1 > n2)
        min =  n2;
        else
        min = n1;

        return min;

    }

    public static double minFunc(double n1,double n2) {
        double min;
        if(n1 > n2)
        min =  n2;
        else
        min = n1;

        return min;

    }


    public static void Distinction(double marks) {
        if(marks >= 85) {
            System.out.println("Distinction");
        } else if(marks >= 68) {
             System.out.println("First Class");
        } else {
             System.out.println("Just Pass");
        }
    }

    public static void swapFunction(int a , int b) {
         System.out.println("Before swapping (Inside), a = " + a + " b = " + b);
         int c = a;
            a = b;
            b = c;
         System.out.println("After swapping(Inside), a = " + a + " b = " + b);
               
    }

    public static void main(String args[]) {
        int a =11;
        int b =6;
        double c = 100;
        double d = 200;
        int result=minFunc(a,b);  // Method Overloading with int and double for minFunction
        double result1 = minFunc(c,d);
        System.out.println("Min Value = " + result);
        System.out.println("Min Value = " + result1);

        Distinction(37);

        // pass by value
        swapFunction(a , b);
         System.out.println("\n**Now,before the after swapping values will be same here**:");

         System.out.println("before and after swapping, a = " + a + " value of b " + b);
        
    }
}