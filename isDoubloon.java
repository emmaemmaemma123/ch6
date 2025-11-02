package ch3;
public class isDoubloon{
    public static String isDoubloon(String a){
        a = a.toLowerCase();
        for (int i=0; i<a.length(); i++){
            char b = a.charAt(i);
            int count = 0;
                for (int c=0; c<a.length(); c++){
                if(a.charAt(c) == b){
                    count += 1;
                }
            }
            if (count != 2){
                return a+ " is not a doubloon!";
            }
            if(count == 2){
                return a + " is a doubloon!";
            }
        }
        return "";
    }
    public static void main (String [] args){
        System.out.println(isDoubloon("Anna"));
        System.out.println(isDoubloon("Table"));
    }
}