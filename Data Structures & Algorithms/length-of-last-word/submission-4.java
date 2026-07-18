class Solution {
    
    public int lengthOfLastWord(String s) {
        int x = 0;
        String t = s.trim();
        for(int i = t.length() - 1; i >= 0; i--){
            if(t.charAt(i) != ' ') x++;
            else{
                break;
            }
        }
        return x;
    }
}