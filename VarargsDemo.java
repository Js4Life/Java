public class VarargsDemo {

    public static void main(String args[]) {
        printMax(34,1,9,77);
        printMax(new double[]{1,2,3,4,5});

    }

    public static void printMax(double... numbers) {

           if(numbers.length == 0) {
                System.out.println("No Argument passed");
                return;
           } 

           double result = numbers[0];

           for(int i=1;i<numbers.length;i++) 
           if(numbers[i] > result)
           result = numbers[i];
             System.out.println("the max value is : " +result);
    }
}