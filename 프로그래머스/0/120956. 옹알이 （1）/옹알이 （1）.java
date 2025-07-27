class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};

        for (String b : babbling) {
            boolean isValid = true;

            for (String w : words) {
                // 같은 단어가 두 번 이상 반복되면 안 됨
                if (b.contains(w + w)) {
                    isValid = false;
                    break;
                }
            }

            if (!isValid) continue;

            // 각 단어를 공백으로 바꿔 제거
            for (String w : words) {
                b = b.replace(w, " ");
            }

            // 공백을 제거하고 남은 문자가 없으면 유효
            if (b.replaceAll(" ", "").equals("")) {
                answer++;
            }
        }

        return answer;
    }
}
