import java.util.LinkedHashMap;

class Solution {
    public String compressedString(String word) {

        String res = "";
        char first = word.charAt(0);
        int count = 1;
        for(int i=1;i<word.length();i++){
            char c = word.charAt(i);
            if(c != first || (c == first && count == 9)){
                res = res+count+first;
                first = c;
                count = 1;
            }else{
                    count++;
            }
        }
        return res+count+first;
    }
}
