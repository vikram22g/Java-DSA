public class setbit{
    public static void main(String args[]){
        int n=5; // it is (0101)₂ in binary
        int pos=1;
        int bitmask=1<<pos;
        int newN=bitmask | n;
        System.out.println(newN);  // in binary it will be (0111)₂
    }
}