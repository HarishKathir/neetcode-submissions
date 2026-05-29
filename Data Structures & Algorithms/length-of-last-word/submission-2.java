class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;
        int i = s.length()-1;
        int count = 0;
        while(i>=0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }
}