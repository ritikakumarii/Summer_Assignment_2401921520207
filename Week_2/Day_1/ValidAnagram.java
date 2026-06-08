class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        // iski time complexity boht kharab hai


        // HashMap<Character,Integer>  mp = new HashMap<>();
        // for(int i =0 ; i<s.length(); i++){
        //     Character ch =s.charAt(i);
        //     mp.put(ch,mp.getOrDefault(ch,0)+1); 
        // }
        // for(int i =0; i<t.length() ; i++){
        //     Character ch= t.charAt(i);
        //     if(!mp.containsKey(ch)) return false;
        //     mp.put(ch, mp.getOrDefault(ch,0)-1);

        // }

        // for(Integer i:mp.values() ){
        //     if(i!=0) return false;
        // }
        // return true;


        // array approach for better time complexity
        char[] ch1 =s.toCharArray();
        char[] ch2 =t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i =0; i<s.length();i++){
            if(ch1[i]!= ch2[i]) return false;
        }
        return true;

    }
}
