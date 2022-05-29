public class Solution {

	public static String reverseEachWord(String str) {
        String[] ArrStr=str.split(" ");
        String mynewStr=new String("");
        for (String s : ArrStr) {
           
         
            mynewStr +=(reverse(s)+" ");
            
        }
        return mynewStr;
	}
    
    public static String reverse(String s){
        int n=s.length()-1;
        String rev="";
        while(n>=0){
            rev+=s.charAt(n);
            n--;
        }
        return rev;
        
        }
    
    
    

}
