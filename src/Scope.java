public class Scope {
    public static void main(String[] args){
        int a=10;
        int b=20;
        String name= "prateek";
        {
            a=22;  //we can reassign the value but not reinitilize the varible
            System.out.println(a);
            int c=19; //value initialize in this block will remain in this block
            System.out.println(c);
            name="sumit";
            System.out.println(name);


        }
        System.out.println(a);
         //System.out.println(c); c doesn't exist outside the block .. cannot  use outside the block
        System.out.println(name);
        for(int i=0;i<4;i++){
           // System.out.println(i);
            int num=99;
            a=100;
            //System.out.println(a);
        }
        System.out.println(a);

    }




}
