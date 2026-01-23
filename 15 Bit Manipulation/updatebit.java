public class updatebit{
    public static void main(String args[]){
        int n=5; // (0101)₂
        int pos= 2;
        int bitmask=1<<pos; // creating bitmask
        int operation=0; // updating at position 2 value into 0
        int newnumber=0;
        if(operation==0){
            int Notbitmask= ~(bitmask);
            newnumber=Notbitmask & n; // (0001)₂
        }
        else{
            newnumber=bitmask | n; // (0101)₂
        }
        System.out.println(newnumber); 
    }
}