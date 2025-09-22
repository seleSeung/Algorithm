class Solution {
    public String solution(String my_string, int n) {
        CharRepeater repeater = new StringCharRepeater();
        return repeater.repeat(my_string, n);
    }

    private interface CharRepeater {
        String repeat(String s, int n);
    }

    private static final class StringCharRepeater implements CharRepeater {
        @Override
        public String repeat(String s, int n) {
            if (s == null || n <= 0) return "";
            StringBuilder sb = new StringBuilder(s.length() * n);
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                for (int j = 0; j < n; j++) sb.append(ch);
            }
            return sb.toString();
        }
    }
}
