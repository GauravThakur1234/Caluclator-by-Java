import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("hello how can I help you?");
        System.out.println("Which thing do like to do in Mathematics?");
        System.out.println("Addition - 0 , Subtraction - 1 , Multiplicatation - 2 , Division - 3 , Decimal - 4 ");
        int Addition = 0;
        int Subtraction = 1;
        int Multiplicatation = 2;
        int Division = 3;
        int Decimal = 4;
        int user = sc.nextInt();

        if (user == Addition) {

            System.out.println("Enter your first number: ");
            int af1 = sc.nextInt();

            System.out.println("Enter your second number: ");
            int af2 = sc.nextInt();

            System.out.println("Your answer is: ");
            int ans1 = af1 + af2;

            System.out.println(ans1);
        } else if (user == Subtraction) {

            System.out.println("Enter your first number: ");
            int sf1 = sc.nextInt();

            System.out.println("Enter your second number: ");
            int sf2 = sc.nextInt();

            System.out.println("Your answer is: ");
            int ans2 = sf1 - sf2;

            System.out.println(ans2);
        } else if (user == Multiplicatation) {

            System.out.println("Enter your first number: ");
            int mf1 = sc.nextInt();

            System.out.println("Enter your second number: ");
            int mf2 = sc.nextInt();

            System.out.println("Your answer is: ");
            int ans3 = mf1 * mf2;

            System.out.println(ans3);
        } 
        else if (user == Division) {

            System.out.println("Enter your first number: ");
            int df1 = sc.nextInt();

            System.out.println("Enter your second number:");
            int df2 = sc.nextInt();

            System.out.println("Your answer is: ");
            int ans4 = df1 / df2;

            System.out.println(ans4);
        }
         else if (user == Decimal) {

            System.out.println("What do you want to do in decimal?");
            System.out.println("Addition - 10 , Subtraction - 20 , Multiplicataion - 30 , Division - 40.");
            int DA = 10;
            int DS = 20;
            int DM = 30;
            int DD = 40;
            int user2 = sc.nextInt();
            if (user2 == DA) {

                System.out.println("Enter your first number: ");
                float D1 = sc.nextFloat();

                System.out.println("Enter your second number: ");
                float D2 = sc.nextFloat();

                System.out.println("Your answer is: ");
                float ans10 = D1 + D2;

                System.out.println(ans10);
            } 
            else if (user2 == DS) {

                System.out.println("Enter your first number: ");
                float D30 = sc.nextInt();

                System.out.println("Enter your second number: ");
                float D09 = sc.nextInt();

                System.out.println("Your answer is: ");
                float ans200 = D30 - D09;

                System.out.println(ans200);
            }
             else if (user2 == DM) {

                System.out.println("Enter your first number: ");
                float D23 = sc.nextFloat();

                System.out.println("Enter your second number: ");
                float D100 = sc.nextFloat();

                System.out.println("Your answer is: ");
                float ans300 = D23 * D100;

                System.out.println(ans300);
            } 
            else if (user2 == DD) {

                System.out.println("Enter your first number: ");
                float D2009 = sc.nextFloat();

                System.out.println("Enter your second number:");
                float D234 = sc.nextFloat();

                System.out.println("Your answer is: ");
                float ans400 = D2009 / D234;

                System.out.println(ans400);
            }
        }

        sc.close();
    }
}