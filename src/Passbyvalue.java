public class Passbyvalue {
    public static void main(String args[]){
       String name= "prateek";
       ChangeName(name);
       System.out.println(name);


    }
    static String ChangeName( String naam){
        naam="sumit";
        return naam;

    }
}
