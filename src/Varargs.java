import java.util.Arrays;

public class Varargs {          // VARIABLE LENGTH ARGUMENTS ALWYS COMES AT THE END...
    public static void main(String[] args){
       // fun(20,69,07,79);
        Multiple (29,39,"prateek,kunal,sumit");
    }
    static void Multiple(int a, int b, String...v){
        System.out.println(Arrays.toString(v));

    }
}
