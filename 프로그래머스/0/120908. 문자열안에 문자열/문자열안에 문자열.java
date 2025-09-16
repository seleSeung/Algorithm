class Solution {

    static class Text {
        private final String value;

        Text(String value) {
            this.value = value;
        }

        boolean contains(Text other) {
            return value.contains(other.value);
        }
    }

    static class ContainmentService {
        int resultFor(Text haystack, Text needle) {
            return haystack.contains(needle) ? 1 : 2;
        }
    }

    public int solution(String str1, String str2) {
        Text s1 = new Text(str1);
        Text s2 = new Text(str2);
        return new ContainmentService().resultFor(s1, s2);
    }
}
