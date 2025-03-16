class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        String res = "";
        for(int i=0; i< s.length();i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i)<='9')){
                res = res+s.charAt(i);
            }
        }
        for(int i=0,j=res.length()-1;i<=j;){
            char start = res.charAt(i);
            char end = res.charAt(j);
            if(start == end){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}