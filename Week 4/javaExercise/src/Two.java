import java.util.Scanner;

public class Two {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int userMoney = 0;
        String CoffeName[] = { "Black Coffee", "Coffee Latte", "Matcha Latte", "Dolce Latte" };
        int CoffeePrice[] = { 10, 14, 16, 18 };

        System.out.println("Please top up your money : (Enter how much to top up)");
        userMoney = input.nextInt();
        int x = 0;
        while (x == 0) {
            System.out.println("Your balance is " + userMoney);
            int i = 0;
            int j = 1;
            System.out.println("Choose what do you want to buy. ");
            while (i < 4) {
                System.out.println(j + ". " + CoffeName[i] + " with the price of " + CoffeePrice[i]);
                i++;
                j++;
            }
            System.out.println("What do you want to Order ? ");
            int orderNumber = input.nextInt();
            int a = 0;
            while (a == 0) {
                if (orderNumber < 0 || orderNumber > 4) {
                    System.out.println("Please input a valid Number! (1 - 4 in order.)");
                    System.out.println("The order are :");
                    i = 0;
                    j = 1;
                    while (i < 4) {
                        System.out.println(j + ". " + CoffeName[i] + " with the price of " + CoffeePrice[i]);
                        i++;
                        j++;
                        x = 1;
                    }
                    System.out.println("Enter your input now ");
                    orderNumber = input.nextInt();
                } else if (orderNumber > 0 && orderNumber < 5) {
                    orderNumber = orderNumber - 1;
                    userMoney = userMoney - CoffeePrice[orderNumber];
                    if (userMoney > 18) {
                        System.out.println("Thank you for ordering " + CoffeName[orderNumber] + " with the price of "
                                + CoffeePrice[orderNumber] + " the balance of your money is now " + userMoney);
                        a = 1;
                    } else if (userMoney < 19) {
                        System.out.println("Not enough balance, please kindly choose another! ");
                        a = 1;
                        if (userMoney < 10) {
                            x = 1;
                        }
                    } else {
                        System.out.println("You don't have enough balance! ");
                        a = 1;
                        x = 1;
                    }
                }
            }
            if (userMoney > CoffeePrice[orderNumber]) {
                a = 0;
                x = 0;
            }
        }
    }
}
