public class Shadowing {

    static int x=39; // this will be shadowed by line 6
    public static void main(String[] args){
        System.out.println(x);
        int x=22; //the class variable at line 3 is shadowed by this
        System.out.println(x); //this will print the value of x given in this scope
        fun();
    }
    static void fun() {
        System.out.println(x);
    }
}
