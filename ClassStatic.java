import java.io.*;

public class ClassStatic {

    private static double salary;

    public static final String DEPARTMENT = "Programming";

    public static void main(String args[]) {
        salary = 2000;
        System.out.println(DEPARTMENT + "average salary :" +salary);
    }
}