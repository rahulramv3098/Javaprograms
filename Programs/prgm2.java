package Programs;
import java.util.*;

class prgm2 {
    public static void main(String args[]) {
        String[] strs={"flower","flight","flow"};
        if(strs==null || strs.length==0){
            System.out.println();
        }
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int c=0;
        String b="";
        while(c<first.length()){
            if(first.charAt(c)==last.charAt(c)){
                b+=first.charAt(c);
                c++;
            }
            else{
                break;
            }
        }
        System.out.println(b);
        
    }
}
