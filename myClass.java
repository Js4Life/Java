class MyClassConstructor {
    int x;

    // MyClassConstructor() {
    //     x = 10;
    // }

    // parameterized constructor

        MyClassConstructor(int i) {
        x = i;
    }
}

public class myClass {
    public static void main (String args[]) {
        MyClassConstructor t1 = new MyClassConstructor(10);
        MyClassConstructor t2 = new MyClassConstructor(20);

        System.out.println(t1.x + " " + t2.x);
    }
}
