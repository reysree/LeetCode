class Solution {
    public int strStr(String haystack, String needle) {

        if(needle.length() == 0){
            return -1;
        }

        int haylength = haystack.length();
        int needlelength = needle.length();

        for(int i=0; i<= (haylength-needlelength); i++){
            int j=0;
            while(j < needlelength && haystack.charAt(j+i) == needle.charAt(j)){
                j++;
            }
            if(j == needlelength){
                return i;
            }
        }
        return -1;
        
    }
}