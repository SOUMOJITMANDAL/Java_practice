public class CopyCons {
    public static void main(String[] args) {
        Demo d1 = new Demo(1,"IBM");
        Demo d2 = new Demo(d1); //
        d1.Display();
        d2.Display();
    }
}
class Demo{
    int i;
    String j;

    Demo(int a, String b){ // Constructor to initialize i and j
        i = a;
        j = b;
    }
    Demo(Demo d){ // constructor to initialize another object
        i = d.i;
        j = d.j;
    }
    void Display(){
        System.out.println( j + " is number "+ i );
    }
}