public class constructor {
    public static void main(String[] args) {
        // just declaring
        // Student s1;
        // s1 = new Student(); // creating object

        Student s1 = new Student(15, "Roshan", 85.4f);
//      Student rahul = new Student(18, "Rahul Rana", 90.3f);

        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        s1.greeting();// calling the greeting method from the class
//        s1.changeName("Karthik");
//        System.out.println(s1.name);

        // calling constructor from another constructor
        Student random2 = new Student();
        System.out.println(random2.name);

        // constructor that takes value from another constructor
        Student random = new Student(s1);
        System.out.println(random.name); // here this is referred to random, and other is referred to s1

        // Memory allocation for new keyword
        Student one = new Student(13,"IBM",100.0f);
        Student two = one;
//        one.name = "Something something";
        System.out.println(two.name);

    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    Student (int r, String name, float marks) {
        rno = r;
        this.name = name; // since instance variable of the class is assigned value through a variable of same name this keyword is used. this decreases need of new naming convention
        this.marks = marks;
    }

    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
          this  (13, "default person", 100.0f);
    }

}

