class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        String res = "";
        for(int i=0; i< s.length();i++){
            if((int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122 || ((int)s.charAt(i) >= 48 && (int)s.charAt(i)<=57)){
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