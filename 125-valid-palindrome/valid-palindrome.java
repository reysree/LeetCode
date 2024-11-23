class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        String res = "";
        for(int i=0; i< s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || (s.charAt(i) >= '0' && s.charAt(i)<='9')){
                res=res+s.charAt(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(res);
        sb.reverse();
        if(res.equals(sb.toString())){
            return true;
        }else{
            return false;
        }
    }
}