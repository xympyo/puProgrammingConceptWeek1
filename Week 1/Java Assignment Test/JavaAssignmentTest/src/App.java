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
        int loanAmount = scan.nextInt();
        System.out.println("Enter how many years? ");
        int numberOfYears = scan.nextInt();
        System.out.println("Enter your Interest Rate");
        int interestRate = scan.nextInt();

        int convertYears = numberOfYears * 12;
        double monthlyPayment = loanAmount / convertYears;
        System.out.println("Your monthly will be " + monthlyPayment);
        double interestTax = ((loanAmount / 100) * interestRate);
        double wholeInterestTax = interestTax / convertYears;
        System.out.println("Your Tax will be " + wholeInterestTax + " per month");
        double monthlyPaymentTax = monthlyPayment + wholeInterestTax;
        System.out.println("Your monthly with tax will be " + monthlyPaymentTax);
        double totalPaymentTax = monthlyPaymentTax * convertYears;
        System.out.println("Your whole payment with tax will be " + totalPaymentTax + " .");
    }

    public static void numberThree(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] Currency = { 100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100 };
        int i = 0;
        int j = 0;
        int f = 1;

        System.out.println("Enter how much money ? ");
        int amountMoney = scan.nextInt();

        for (j = 0; j != f;) {
            int remainderMoney;
            int dividedMoney = amountMoney / Currency[i];
            if (dividedMoney == 0) {
                i++;
            } else if (dividedMoney > 0) {
                System.out.println(
                        "The amount of " + Currency[i] + " that consists on your money is " + dividedMoney + " .");
                dividedMoney = 0;
                remainderMoney = amountMoney % Currency[i];
                System.out.println("The remainder is " + remainderMoney);
                if (remainderMoney > 0) {
                    amountMoney = amountMoney % Currency[i];
                    i++;
                    f++;
                    j++;
                    System.out.println("The Currency is now " + Currency[i]);
                } else if (remainderMoney == 0 || dividedMoney < 100) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        numberTwo(args);
    }
}