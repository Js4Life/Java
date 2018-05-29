public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        // create a constructor with one parameter , name

    System.out.println("Passed Name is :" + name);

    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;
    }
    // Place above constructor in PSV Main
    public static void main(String []args) {
        // create an Object myPuppy

        Puppy myPuppy = new Puppy("Ashwin");

        myPuppy.setAge(2);
        myPuppy.getAge();

        System.out.println("Variable value :" +myPuppy.puppyAge);

    }


}