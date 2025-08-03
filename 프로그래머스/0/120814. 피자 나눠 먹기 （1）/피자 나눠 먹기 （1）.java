class Solution {
    public int solution(int n) {
        int piecesPerPizza = 7;  // 7조각
        return (n + piecesPerPizza - 1) / piecesPerPizza;
    }
}
