class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        if (arr.length == 1 && arr[0].charAt(0) == arr[0].charAt(arr[0].length() - 1)) {
            System.out.println(arr[0].charAt(0) + "    " + arr[0].charAt(arr[0].length() - 1));
            return true;
        } else if (arr.length > 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].charAt(arr[i].length() - 1) == arr[i + 1].charAt(0)) {
                    continue;
                } else {
                    return false;
                }
            }
            if (arr[0].charAt(0) == arr[arr.length - 1].charAt(arr[arr.length - 1].length() - 1)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}