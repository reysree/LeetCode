class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int len = s1.length();

        ArrayList<Integer> alist = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                alist.add(i);
            }
            if(alist.size() > 2){
                return false;
            }
        }
        if(alist.size() == 1){
            return false;
        }

        int id1 = alist.get(0);
        int id2 = alist.get(1);
        if(s1.charAt(id1) == s2.charAt(id2) && s1.charAt(id2) == s2.charAt(id1) ){
            return true;
        }
        return false;
        }
    }