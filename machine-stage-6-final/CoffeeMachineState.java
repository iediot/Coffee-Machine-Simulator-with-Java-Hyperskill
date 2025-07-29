package machine;

public class CoffeeMachineState {
    int water, milk, beans, cups, money, timesUsed;
    public CoffeeMachineState (int water, int milk, int beans,
                               int cups, int money, int timesUsed) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
        this.timesUsed = timesUsed;
    }
}
