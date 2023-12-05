import java.util.Scanner;
public class Shop {
    private int healthChange;
    private int happinessChange;
    private int token;
    private int tokenChange;

    public Shop(int token) {
        healthChange = 0;
        happinessChange=0;
        tokenChange=0;
        this.token=token;
        Scanner scan = new Scanner(System.in);

    }


    public void Shoppify() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome To the Shop Would you like to see our stock?Oh yeah uh so even if you don't use the shop it counts a round (y/n) ");
        String y = scan.nextLine();

        while (!y.equals("y") && (!y.equals("n"))) {
            System.out.println("type y to continue and n to say no");
            y = scan.nextLine();


        }

        if (y.equals("y")) {

            System.out.println("We have 3 items in stock ");
            System.out.println("1. Food(+5 Happiness) = 1 Token ");
            System.out.println("2. Medicine(+10 Health) = 5 Token ");
            System.out.println("3. Toys(+25 Happiness) = 4 token");
            System.out.println("4. Nothing");
            System.out.println("What would you like to buy? ");
            String choice = scan.nextLine();
            if (choice.equals("1")) {
                if (token >= 1) {
                    happinessChange= 5;
                    tokenChange =- 1;
                    System.out.println("You bought food");
                } else {
                    System.out.println("You dont have enough tokens");
                }
            } else if (choice.equals("2")) {
                if (token >= 5) {
                    healthChange=10;
                    tokenChange = -5;
                    System.out.println("You bought medicine");
                } else {
                    System.out.println("You dont have enough tokens");
                }

            } else if (choice.equals("3")) {
                if (token >= 4) {
                    happinessChange = 25;
                    tokenChange = -5;
                    System.out.println("You bought a toy");
                } else {
                    System.out.println("You don't have enough tokens");
                }
            }
        } else {
            System.out.println("Have a nice day!");
        }


    }

    public int getHappinessChange() {
        return happinessChange;
    }

    public int getHealthChange() {
        return healthChange;
    }

    public int getTokenChange() {
        return tokenChange;
    }
}
