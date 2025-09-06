class Pizza {
    private int slice;

    public Pizza(int slice) {
        this.slice = slice;
    }

    public int getSlice() {
        return slice;
    }
}

class PizzaCalculator {
    public int calculateMinPizzas(Pizza pizza, int people) {
        int slice = pizza.getSlice();
        return (people + slice - 1) / slice; // 올림 나눗셈
    }
}

class Solution {
    public int solution(int slice, int n) {
        Pizza pizza = new Pizza(slice);
        PizzaCalculator calculator = new PizzaCalculator();
        return calculator.calculateMinPizzas(pizza, n);
    }
}
