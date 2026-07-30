class Solution {
    public boolean isValid(String s) {
        boolean ans=true;
        while (ans){
            ans=false;
            for(int i=0;i<s.length()-1;i++){
                char a= s.charAt(i);
                char b= s.charAt(i+1);
                if ((a == '(' && b == ')') ||(a == '{' && b == '}') ||(a == '[' && b == ']')) {
                    s=s.substring(0,i)+s.substring(i+2);
                    ans=true;
                    break;

            }
        }
     }
        return s.length()==0;
    }
}