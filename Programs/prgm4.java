package Programs;

class prgm4 {
    public static void main(String args[]) {
        int nums[]={2,7,11,15};
        int target=9;
        int[] a=new int[2];//[2,7,11,15,2]
        for(int i=0;i<nums.length;i++){//4;4<4
            for(int j=i+1;j<nums.length;j++){//4;4<4

                if(nums[i] + nums[j] == target){//11+15==9
                    a[0]=i;//0
                    a[1]=j;//1
                    break;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
