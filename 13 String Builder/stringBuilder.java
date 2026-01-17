public class stringBuilder{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("vikram");
        System.out.println(sb);

        // charAt at index 1
        System.out.println(sb.charAt(1));

        // set char at
        sb.setCharAt(0,'B');
        System.out.println(sb);
        sb.setCharAt(0,'V');

        // insert
        sb.insert(0,'s');
        System.out.println(sb);

        // delete
        sb.delete(0,1);
        System.out.println(sb);

        // append
        sb.append(" ");
        sb.append("M");
        sb.append("e");
        sb.append("h");
        sb.append("r");
        sb.append("a");
        System.out.println(sb);

        // length 
        System.out.println(sb.length);

    }
}