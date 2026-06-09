// TLE
// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         ArrayList<String> list = new ArrayList<>();
//         list= permu("", s1, list);
//         for(String str:list){
//             if (s1.equals(s2)||s2.contains(str)){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public ArrayList<String> permu(String p, String up, ArrayList<String> list){
//         if(up.length()==0){
//             list.add(p);
//             return list;
//         }
//         char ch = up.charAt(0);
        
//         for(int i =0 ; i<=p.length(); i++){
//             String f = p.substring(0,i);
//             String  l = p.substring(i,p.length());
//             permu(f+ch+l,up.substring(1),list);
//         }
        
        
//         return list;
//     }
// }
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        if (matches(count1, window)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {

            window[s2.charAt(i) - 'a']++;

            window[s2.charAt(i - s1.length()) - 'a']--;

            if (matches(count1, window)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
