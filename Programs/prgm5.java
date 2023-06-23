package Programs;
import java.util.*;

class prgm5{
    public static void main(String args[]) {
        String s="abcabcbb";
        int rs=0;
        for(int i=0;i<s.length();i++){
            ArrayList<Character>st=new ArrayList<>();
            for(int j=i;j<s.length();j++){
                if(st.contains(s.charAt(j))){
                    break;
                }
                else{
                    st.add(s.charAt(j));
                }
            }
            if(st.size()>rs){
                rs=st.size();
            }
        }
        System.out.println(rs);
    }
}
