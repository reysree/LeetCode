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
        // LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();
        // for (int i = 0; i < word.length(); i++) {
        //     char c = word.charAt(i);
        //     hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        // }

        // String res = "";
        // for (Character key : hmap.keySet()) {
        //     int temp = hmap.get(key);
        //     while (temp > 9) {
        //         res += "9" + key;
        //         temp -= 9;
        //     }
        //     res += temp + "" + key;
        // }
        return res+count+first;
    }
}
