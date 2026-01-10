class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        int[] data = new int[125];

        for(int i =0; i<s.length();i++){
            data[s.charAt(i)]++;
            data[t.charAt(i)]--;
        } 
        for(int a:data){
            if(a!=0) return false;
        }


        return true;


    }
}
