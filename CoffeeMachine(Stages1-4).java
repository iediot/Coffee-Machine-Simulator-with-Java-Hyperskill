package machine;

public class CoffeeMachine {
    /// -- Fourth version of the code --
    /// --- made for the fourth task---
    /// the rest of the code is commented
    /// out in the main function
    /*
    public static void machineInfoShower(int water, int milk,
                                          int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println(" ");
    }
    public static void actions(int water, int milk,
                               int beans, int cups, int money) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();
        switch (action) {
            case "buy" -> buy(water, milk, beans, cups, money);
            case "fill" -> fill(water, milk, beans, cups, money);
            case "take" -> take(water, milk, beans, cups, money);
            default -> System.out.println("Unknown action. Try again!");
        }
    }
    public static void buy(int water, int milk,
                           int beans, int cups, int money) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                water -= 250;
                beans -= 16;
                money += 4;
                cups--;
                break;
            case 2:
                water -= 350;
                milk -= 75;
                beans -= 20;
                money += 7;
                cups--;
                break;
            case 3:
                water -= 200;
                milk -= 100;
                beans -= 12;
                money += 6;
                cups--;
                break;
            default:
                System.out.println("Not a valid coffee choice!");
        }
        System.out.println(" ");
        machineInfoShower(water, milk, beans, cups, money);
    }
    public static void fill(int water, int milk,
                            int beans, int cups, int money) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int waterAdded = scanner.nextInt();
        water += waterAdded;
        System.out.println("Write how many ml of milk you want to add:");
        int milkAdded = scanner.nextInt();
        milk += milkAdded;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int beansAdded = scanner.nextInt();
        beans += beansAdded;
        System.out.println("Write how many disposable cups you want to add:");
        int cupsAdded = scanner.nextInt();
        cups += cupsAdded;
        System.out.println(" ");
        machineInfoShower(water, milk, beans, cups, money);
    }
    public static void take(int water, int milk,
                            int beans, int cups, int money) {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println(" ");
        machineInfoShower(water, milk, beans, cups, money);
    }
    */
    public static void main(String[] args) {
        /// -- First version of the code --
        /// --- made for the first task---
        /*
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        */
        /// -- Second version of the code --
        /// --- made for the second task ---
        /*
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffee = scanner.nextInt();
        System.out.println("For " + cupsOfCoffee + " cups of coffee you will need:");
        System.out.println(cupsOfCoffee * 200 + " ml of water");
        System.out.println(cupsOfCoffee * 50 + " ml of milk");
        System.out.println(cupsOfCoffee * 15 + " g of coffee beans");
        */
        /// -- Third version of the code --
        /// --- made for the third task ---
        /*
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffee = scanner.nextInt();
        int cupsMade = Math.min(water / 200, Math.min(milk / 50, coffeeBeans / 15));
        if (cupsMade == cupsOfCoffee)
            System.out.println("Yes, I can make that amount of coffee");
        else {
            if (cupsMade > cupsOfCoffee) {
                int cupsDiff = cupsMade - cupsOfCoffee;
                System.out.println("Yes, I can make that amount of coffee (and even "
                        + cupsDiff + " more than that)");
            }
            else
                System.out.println("No, I can only make " + cupsMade + "cup(s) of coffee");
        }
        */
        /// -- Fourth version of the code --
        /// --- made for the fourth task---
        /// this is the rest of the code that
        /// I was talking about at the beginning
        /// of the static void functions declared
        /// at the beginning of this file
        /*
        int machineWater = 400, machineMilk = 540,
                machineBeans = 120, machineCups = 9, machineMoney = 550;
        machineInfoShower(machineWater, machineMilk, machineBeans, machineCups, machineMoney);
        actions(machineWater, machineMilk, machineBeans, machineCups, machineMoney);
        */
    }
}