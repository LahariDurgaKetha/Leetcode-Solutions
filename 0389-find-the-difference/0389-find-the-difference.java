class Solution {
    public char findTheDifference(String s, String t) {
        int i = s.length();
        char a = t.charAt(i--);
        for(; i>-1; i--)
            a ^= (s.charAt(i) ^ t.charAt(i));
        return a;
    }
}