public class Solution {
    public int[] solution(int[] num_list) {
        int even = 0;
        int odd = 0;

        for (int num : num_list) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return new int[]{even, odd};
    }

    // 예시 실행
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {1, 2, 3, 4, 5, 6};
        int[] result = sol.solution(num_list);
        System.out.println("짝수: " + result[0] + ", 홀수: " + result[1]);  // 출력: 짝수: 3, 홀수: 3
    }
}