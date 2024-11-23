class Solution {
    public String reverseVowels(String s) {
        
        int i = 0;
        int j = s.length()-1;
        char[] res = s.toCharArray();
        ArrayList<Character> alist = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        for(i=0; i<j;){
            if(alist.contains(res[i]) && alist.contains(res[j])){
                if(res[i]!= res[j]){
                    char temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
                    j--;
                    i++;
            }else if(alist.contains(res[i]) && !alist.contains(res[j])){
                j--;
            }else if(!alist.contains(res[i]) && alist.contains(res[j])){
               i++; 
            }
            else{
                j--;
                i++;
            }
        }
        return new String(res);
    }
}