class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        StringBuilder st = new StringBuilder();
        for(int i=0; i< s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || (s.charAt(i) >= '0' && s.charAt(i)<='9')){
                st.append(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(st);
        sb.reverse();
        if(st.toString().equals(sb.toString())){
            return true;
        }else{
            return false;
        }
    }
}