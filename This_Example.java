public class This_Example {
    int num = 10;

    This_Example() {
        System.out.println("this is an Example program on keyword this");
    }

    This_Example(int num) {
        this(); // invoke the default constructor
        this.num = num; // assigning local variable num to the instance variable num
    }

    public void greet() {
        System.out.println("Hi Welcome to Tutorialspoint");
    }

    public void print() {
        int num = 20;

        System.out.println("value of local variable num is : " +num);
        System.out.println("value of local variable num is : " +this.num);

        this.greet();    
    }

public static void main(String[] args) {
    This_Example obj1 = new This_Example();

    obj1.print();

    This_Example obj2 = new This_Example(30);

    obj2.print();
}

}