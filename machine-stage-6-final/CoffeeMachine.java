package machine;

public class CoffeeMachine {
    public static void machineInfoShower(CoffeeMachineState state) {
        System.out.println("The coffee machine has:");
        System.out.println(state.water + " ml of water");
        System.out.println(state.milk + " ml of milk");
        System.out.println(state.beans + " g of coffee beans");
        System.out.println(state.cups + " disposable cups");
        System.out.println("$" + state.money + " of money");
        System.out.println(" ");
    }
    public static void actions(CoffeeMachineState state) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int exit = 0;
        while (exit == 0) {
            System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
            String action = scanner.nextLine();
            switch (action) {
                case "buy" -> buy(state);
                case "fill" -> fill(state);
                case "take" -> take(state);
                case "clean" -> clean(state);
                case "remaining" -> machineInfoShower(state);
                case "exit" -> exit = 1;
                default -> System.out.println("Unknown action. Try again!");
            }
        }
    }
    public static void buy(CoffeeMachineState state) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        if (state.timesUsed >= 10)
            System.out.println("I need cleaning!");
        else {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    if (state.water >= 250 && state.beans >= 16 && state.cups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        state.water -= 250;
                        state.beans -= 16;
                        state.money += 4;
                        state.cups--;
                    } else {
                        System.out.print("Sorry, not enough ");
                        if (state.water < 250)
                            System.out.println("water!");
                        else if (state.beans < 16)
                            System.out.println("coffee beans!");
                        else
                            System.out.println("cups!");
                    }
                    break;
                case "2":
                    if (state.water >= 350 && state.milk >= 75
                            && state.beans >= 20 && state.cups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        state.water -= 350;
                        state.milk -= 75;
                        state.beans -= 20;
                        state.money += 7;
                        state.cups--;
                    } else {
                        System.out.print("Sorry, not enough ");
                        if (state.water < 350)
                            System.out.println("water!");
                        else if (state.milk < 75)
                            System.out.println("milk!");
                        else if (state.beans < 20)
                            System.out.println("coffee beans!");
                        else
                            System.out.println("cups!");
                    }
                    break;
                case "3":
                    if (state.water >= 200 && state.milk >= 100
                            && state.beans >= 12 && state.cups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        state.water -= 200;
                        state.milk -= 100;
                        state.beans -= 12;
                        state.money += 6;
                        state.cups--;
                    } else {
                        System.out.print("Sorry, not enough ");
                        if (state.water < 200)
                            System.out.println("water!");
                        else if (state.milk < 100)
                            System.out.println("milk!");
                        else if (state.beans < 12)
                            System.out.println("coffee beans!");
                        else
                            System.out.println("cups!");
                    }
                    break;
                case "back":
                    break;
                default:
                    System.out.println("Not a valid coffee choice!");
            }
            state.timesUsed++;
        }
        System.out.println(" ");
    }
    public static void fill(CoffeeMachineState state) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int waterAdded = scanner.nextInt();
        state.water += waterAdded;
        System.out.println("Write how many ml of milk you want to add:");
        int milkAdded = scanner.nextInt();
        state.milk += milkAdded;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int beansAdded = scanner.nextInt();
        state.beans += beansAdded;
        System.out.println("Write how many disposable cups you want to add:");
        int cupsAdded = scanner.nextInt();
        state.cups += cupsAdded;
        System.out.println(" ");
    }
    public static void take(CoffeeMachineState state) {
        if (state.money > 0) {
            System.out.println("I gave you $" + state.money);
            state.money = 0;
        }
        System.out.println(" ");
    }
    public static void clean(CoffeeMachineState state) {
        System.out.println("I have been cleaned!");
        System.out.println(" ");
        state.timesUsed = 0;
    }
    public static void main(String[] args) {
        CoffeeMachineState state = new
                CoffeeMachineState(400, 540, 120, 9, 550, 0);
        actions(state);
    }
}