class Vehicle {}

public class OperatorsClass extends Vehicle {
    public static void main(String args[]) {
        int a , b;
        String name = "Ashwin";

        Vehicle Car = new OperatorsClass();

        a = 10;
        b = (a == 1) ? 20 : 30;

        System.out.println("Value of b is " + b);

        b = (a == 10) ? 20 : 30;

        System.out.println("Value of b is " + b);

        boolean result = name instanceof String;
        System.out.println(result);

        boolean resultOne = Car instanceof OperatorsClass;

        System.out.println(resultOne);
    }
}