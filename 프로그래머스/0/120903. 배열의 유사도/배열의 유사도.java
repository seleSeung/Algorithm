import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

interface Similarity {
    int count(String[] s1, String[] s2);
}

final class SetSimilarity implements Similarity {
    @Override
    public int count(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        int result = 0;
        for (String w : s2) {
            if (set.contains(w)) result++;
        }
        return result;
    }
}

class Solution {
    private final Similarity strategy = new SetSimilarity();
    public int solution(String[] s1, String[] s2) {
        return strategy.count(s1, s2);
    }
}