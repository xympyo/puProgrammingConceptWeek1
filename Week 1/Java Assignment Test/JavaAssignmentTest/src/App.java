import java.util.Scanner;

public class App {
    public static void numberOne(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Fahrenheit");
        double fahrenheitNumber = scan.nextDouble();
        double celcius = ((5.0 / 9.0) * (fahrenheitNumber - 32));
        System.out.println("Your Celcius will be " + celcius + " after being converted");
    }

    public static void numberTwo(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how much do you wish to loan?");
        double loanAmount = scan.nextDouble();
        System.out.println("Enter how many years? ");
        double numberOfYears = scan.nextDouble();
        System.out.println("Enter your Interest Rate");
        double interestRate = scan.nextDouble();

        double totalManyYears = numberOfYears * 12.0;
        double monthlyPayment = loanAmount / totalManyYears;
        double interestTax = ((loanAmount / interestRate) * 100);
        double fullPayment = monthlyPayment * totalManyYears;
        double monthlyFullPayment = monthlyPayment + interestTax;
        double totallFullPayment = monthlyFullPayment * totalManyYears;

        System.out.println("Your Monthly Payment (Tax Included) will be "
                + monthlyFullPayment + " and your total Payment (Tax Included) will be " + totallFullPayment + " .");

        System.out.println("Do you wish to see your Monthly and Total Payment without Tax? (1 for Yes, 2 for No)");
        double answer = scan.nextInt();
        if (answer == 1) {
            System.out.println("Your monthly Payment without Tax will be " + monthlyPayment
                    + " and your whole Payment without tax will be " + fullPayment);
        }
    }

    public static void numberThree(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] Currency = { 100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100 };
        int i = 0;
        int j = 0;
        int f = 1;

        System.out.println("Enter how much money ? ");
        int amountMoney = scan.nextInt();

        for (j = 0; j != f; j++) {
            int dividedMoney = amountMoney / Currency[i];
            if (dividedMoney == 0) {
                dividedMoney = amountMoney % Currency[i];
            } else if (dividedMoney > 0) {
                System.out.println(
                        "The amount of " + Currency[i] + " that consists on your money is " + dividedMoney + " .");
                int remainderMoney = amountMoney % Currency[i];
                if (remainderMoney == 0) {
                    j = j + 2;
                    break;
                } else if (remainderMoney > 0) {
                    i++;
                }
            }
            // if (remainderMoney == 0) {
            // i = i++;
            // } else if (dividedMoney > 0) {
            // System.out.println("Check remainderMoney" + dividedMoney);
            // }
            // i = i++;
        }
    }

    public static void main(String[] args) throws Exception {
        numberThree(args);
    }
}