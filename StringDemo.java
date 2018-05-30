public class StringDemo {
    public static void main(String args[]) {
        char[] helloArray = {'h','e','l','l','o'};

        String helloString = new String(helloArray);

        System.out.println("the length of the string " + helloString.length() + " which is nice");
    }
}