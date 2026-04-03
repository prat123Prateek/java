public class LCM {
    static void main(String[] args){
        int a=20 ,b=25;
        System.out.println(lcm( a, b ,hcf(a,b)));;

    }
    static int hcf(int a, int b){
        if(a==0){
            return b;
        }
        return hcf((b%a),a);
    }
    static int lcm(int a, int b, int hcf){
        return a * b / hcf(a,b) ;
    }
}
