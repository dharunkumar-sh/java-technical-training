class Solution {
    public String reverseWords(String s) {
        // ["the", "Sky", "is", "Blue"]
        String[] str = s.trim().split("\\s+");
        String result = "";

        for (int i = str.length - 1; i >= 0; i--) {
            result += str[i];
            if (i != 0) {
                result += " ";
            }
        }

        return result;
}
}