public class reverseStr{
    public static void main(String args[]){
        StringBuilder str=new StringBuilder("vikram");

        int start=0;
        int end=5;
        while(start<end){
                // method 1
                // char fchar=str.charAt(start);
                // char bchar=str.charAt(end);

                // str.setCharAt(start,bchar);
                // str.setCharAt(end,fchar);

                
                // method 2
                char temp=str.charAt(start);
                str.setCharAt(start,str.charAt(end));
                str.setCharAt(end,temp);
                start++;
                end--;
        }
        System.out.println(str);
    }
}