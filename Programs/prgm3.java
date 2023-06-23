package Programs;

class prgm3{
    public static void main(String[] args) {
        int x=121;
        String xi=Integer.toString(x);
        String a="";
        int lv=0,rem=0;
        for(int i=0;i<xi.length();i++){//3<3
            lv=x % 10;//1
            a+=lv;//121
            x=x/10;//0
        }
        if(a.equals(xi)){//121 ==121
            System.out.println("true");
        }
        else{
            System.out.println("false");;
        }
    }
}
