import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        // Sort the folder paths lexicographically
        Arrays.sort(folder);
        
        List<String> result = new ArrayList<>();
        // Initialize the first folder as the top-level folder
        String prev = folder[0];
        result.add(prev);
        
        for (int i = 1; i < folder.length; i++) {
            // Check if the current folder is a subfolder of the previous one
            if (!folder[i].startsWith(prev + "/")) {
                // If it's not a subfolder, add it to the result and update prev
                prev = folder[i];
                result.add(prev);
            }
        }
        
        return result;
    }
}
