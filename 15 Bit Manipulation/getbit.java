public class getbit{
    public static void main(String args[]){
        int number=4;
        int pos=1;
        int bitmask=1<<pos;
        if((bitmask & number)==0){
            System.out.println("bit is zero;");
        }
        else{
            System.out.println("bit is one;");
        }
    }
}