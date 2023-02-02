public class ThisKeyword {

    int id;
    String name;

    ThisKeyword(int id, String name){
        this.id = id;
        this.name = name;
    }

    void idAndName(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword(1, "John");
        thisKeyword.idAndName();
    }

}

//*** If parameters (formal arguments) and instance variables are samethen we use "this" keyword to distinguish local variable and instance variable.
//** If local variables(formal arguments) and instance variables are different, there is no need to use "this" keyword like in the above program:
