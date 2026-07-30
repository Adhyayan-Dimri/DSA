class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        boolean ans = true;
        String s = "";
        char[] r = ransomNote.toCharArray(); 

        for (int i = 0; i < magazine.length(); i++) {
            for (int j = 0; j < r.length; j++) {

                if (r[j] == magazine.charAt(i)) {
                    s = magazine.charAt(i) + s;
                    r[j] = '#';          
                    break;               
                }
            }
        }

        if (s.length() == ransomNote.length()) {
            ans = true;
        } else {
            ans = false;
        }

        return ans;
    }
}

               
            
