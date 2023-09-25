import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Are you a PresUnivers? (Please answer in 1 for Yes and 0 for No)");
        int presunivAnswers = input.nextInt();
        int a = 0;
        String Faculty[] = { "Computing", "Engineering", "Business", "Humanities", "Medicine" };
        while (a == 0) {
            if (presunivAnswers == 1) {
                System.out.println("Please state your Faculty!");
                int j = 0;
                int f = 1;
                System.out.println("There are 5 Faculty, which is");
                while (j < 6 && f < 6) {
                    System.out.println(f + ". Faculty of " + Faculty[j]);
                    j++;
                    f++;
                }
                System.out.println("Please enter your Faculty now!");
                int facultyAnswer = input.nextInt();
                if (facultyAnswer > 0 && facultyAnswer < 6) {
                    facultyAnswer = facultyAnswer - 1;
                    System.out.println("You are a PresUnivers from Faculty of " + Faculty[facultyAnswer]);
                    a = 1;
                }
            } else if (presunivAnswers == 0) {
                System.out.println("You, apparently is not a PresUnivers.");
                a = 1;
            } else {
                System.out.println("Wrong Input!, please enter the proper Input this time");
                System.out.println("Only 1 for Yes and 0 for No!");
                presunivAnswers = input.nextInt();
            }
        }
    }
}
