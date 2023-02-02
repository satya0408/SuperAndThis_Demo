
//Parent Class
class Parent {

    Parent(){
        System.out.println("I am parent class constructor");
    }

    static String parent = "I am parent class";
    static String weekday = "Monday";

    void print_color(){
        System.out.println("I am blue");
    }

}


//Child class
public class SuperKeyword extends Parent{

    SuperKeyword(){
        System.out.println("I am child class constructor");
    }

    static String child = "I am child class";
    static String weekday = "Tuesday";

    void print_weekday(){
        System.out.println(super.weekday); // to refer immediate parent class instance variable
    }

    void print_color(){
        super.print_color(); // to invoke immediate parent class method
        System.out.println("I am red");

    }

    public static void main(String[] args) {
        SuperKeyword superKeyword = new SuperKeyword(); //super keyword where super() is provided by the compiler implicitly.
//        superKeyword.print_weekday();

//        superKeyword.print_color();


    }


    // to invoke immediate parent class constructor


}
