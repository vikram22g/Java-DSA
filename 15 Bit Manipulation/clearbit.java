public class clearbit{
    public static void main(String args[]){
        int n = 5; // (0101)₂
        int pos = 2;
        int bitmask = 1<<pos;
        int NOTbitmask = ~bitmask;
        int clearbitNumber = NOTbitmask & n;
        System.out.println(clearbitNumber); // (0001)₂
    }
}