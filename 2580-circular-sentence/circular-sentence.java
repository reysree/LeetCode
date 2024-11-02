class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int n = words.length;
        
        // Check if sentence is circular
        for (int i = 0; i < n; i++) {
            // Get last character of current word and first character of next word (circularly)
            char lastChar = words[i].charAt(words[i].length() - 1);
            char firstChar = words[(i + 1) % n].charAt(0);
            if (lastChar != firstChar) {
                return false;
            }
        }
        
        return true;
    }
}
