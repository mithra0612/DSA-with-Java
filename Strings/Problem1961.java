class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String concat = "";
        for (String str : words) {
            if (!s.contains(str)) {
                break;
            } else {
                if (concat.length() != s.length()) {
                    concat += str;

                }

            }
        }
        return concat.equals(s);
    }
}