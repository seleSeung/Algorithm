class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int lambPrice = 12000;
        int drinkPrice = 2000;
        
        int serviceDrinks= n / 10; //10인분마다 음료서비스
        int paidDrink= k - serviceDrinks; // 사먹은 음료 개수
        
        answer = (n * lambPrice) + (paidDrink * drinkPrice);
        
        return answer;
    }
}