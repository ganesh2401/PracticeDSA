//5 ms
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
//3 ms
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
       
        char[] tdata = s.toCharArray();
        Arrays.sort(tdata);
        char[] sdata = t.toCharArray();
        Arrays.sort(sdata);
        String tresult = new String(tdata);
        String sresult = new String(sdata);

        return sresult.equals(tresult);


    }
}
