class Solution {
    public boolean isPalindrome(int x) {
        int r,original,rev=0;
        original=x;

        boolean ans;
        while(x!=0){
            r=x%10;
            rev=rev*10+r;
            x=x/10;

        }
        if((original==rev)&&(original>=0)){
            System.out.println("true");
            ans=true;
    
        }
        else{
            ans=false;
        }
        return ans;
    }
}