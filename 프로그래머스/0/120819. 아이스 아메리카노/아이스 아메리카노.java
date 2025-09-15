class Coffee {
    private final int price;

    public Coffee(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Wallet {
    private int money;

    public Wallet(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void spend(int amount) {
        if (amount <= money) {
            money -= amount;
        }
    }
}

class Order {
    public int[] buyCoffee(Wallet wallet, Coffee coffee) {
        int cups = wallet.getMoney() / coffee.getPrice();
        int change = wallet.getMoney() % coffee.getPrice();
        return new int[] { cups, change };
    }
}

class Solution {
    public int[] solution(int money) {
        Coffee americano = new Coffee(5500);
        Wallet wallet = new Wallet(money);
        Order order = new Order();
        return order.buyCoffee(wallet, americano);
    }
}
