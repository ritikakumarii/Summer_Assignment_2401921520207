class Solution {
    int i = 0;

    public String decodeString(String s) {
        String result = "";

        while (i < s.length() && s.charAt(i) != ']') {
            if (!Character.isDigit(s.charAt(i))) {
                result += s.charAt(i);
                i++;
            } else {
                // build the number
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                i++; // skip '['
                String inside = decodeString(s);
                i++; // skip ']'

                // repeat the string num times
                for (int j = 0; j < num; j++) {
                    result += inside;
                }
            }
        }

        return result;
    }
}
