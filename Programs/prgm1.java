package Programs;
class prgm1 {
    public static void main(String args[]) {
        String s="III";
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                sum+=1;
                if(i+1<s.length() && s.charAt(i+1)=='V'){
                    sum+=3;
                    i++;
                }
                if(i+1<s.length() && s.charAt(i+1)=='X'){
                    sum+=8;
                    i++;
                }
            }
            else if(s.charAt(i)=='V'){
                sum+=5;
            }
            else if(s.charAt(i)=='X'){
                sum+=10;
                if(i+1<s.length() && s.charAt(i+1)=='C'){
                    sum+=80;
                    i++;
                }
                if(i+1<s.length() && s.charAt(i+1)=='L'){
                    sum+=30;
                    i++;
                }
            }
            else if(s.charAt(i)=='L'){
                sum+=50;
            }
            else if(s.charAt(i)=='C'){
                sum+=100;
                if(i+1<s.length() && s.charAt(i+1)=='M'){
                    sum+=800;
                    i++;
                }
                if(i+1<s.length() && s.charAt(i+1)=='D'){
                    sum+=300;
                    i++;
                }
            }
            else if(s.charAt(i)=='D'){
                sum+=500;
            }
            else{
                sum+=1000;
            }
        }
        System.out.println(sum);
    }
}