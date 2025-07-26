class Solution {
    public static int solution(int a, int b) {
        int concatValue = Integer.parseInt(String.valueOf(a) + b);
        int productValue = 2 * a * b;
        
        return (concatValue >= productValue) ? concatValue : productValue;
    }
}
