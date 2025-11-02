package ch3;
public class isAbecedarian{
    public static boolean isAbecedarian(String a){
        a = a.toLowerCase();
        for (int i = 0; i<a.length()-1; i++){
           char first = a.charAt(i);
           char second = a.charAt(i+1);
           if ( first > second){
            return false;
            }
        }
        return true;
    }
        public static void main (String [] args){
        String abecedarian = "abdest";
        String notabecedarian = "java";
        
        System.out.println(isAbecedarian(abecedarian));
        System.out.println(isAbecedarian(notabecedarian));
    }
}