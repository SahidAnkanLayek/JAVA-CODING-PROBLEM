import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class RulesViolationException extends Exception {
    public RulesViolationException(String message) {
        super(message);
    }
}

public class BankAccount {
    private double balance = 0.0; // Added a balance field

    public void depositMoney(double amount) {
        balance += amount;
        mainMenu();
    }

    public  void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Asking to withdraw more than the balance");
        }
        balance -= amount;
        mainMenu();
    }

    public void createAccount(double initialAmount) throws RulesViolationException {
        if (initialAmount < 500) {
            throw new RulesViolationException("Balance should be greater than or equal to 500.");
        } else {
            balance = initialAmount;
        }
    }

    public void mainMenu() {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        
        while (b) {
            int choice;

            System.out.println("\nWELCOME TO STATE BANK OF INDIA !!!");
            System.out.println("\n==================================");
            System.out.println("Press 1 for creating an account in our bank");
            System.out.println("Press 2 for checking the Account information");
            System.out.println("Press 3 for depositing money in the account");
            System.out.println("Press 4 for withdrawing money from the Account");
            System.out.println("Press 5 for fixed deposit");
            System.out.println("Press 6 for recurring deposit");
            System.out.println("Press 7 to end the transaction");
            
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the initial balance: ");
                    double initialAmount = scanner.nextDouble();
                    try {
                        createAccount(initialAmount);
                    } catch (RulesViolationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    accountInformation();
                    break;

                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    depositMoney(depositAmount);
                    break;

                case 4:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        withdrawMoney(withdrawAmount);
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    fixedDeposit();
                    break;

                case 6:
                    recurringDeposit();
                    break;

                case 7:
                    System.out.println("Thank you for using SBI!! Visit again.");
                    b = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
        scanner.close();
    }

    public void accountInformation() {
        System.out.println("Account Information:");
        System.out.println("\t--Total balance: " + balance);
    }

    public void fixedDeposit() {
        System.out.println("NOTICE: OUR BANK PROVIDES 6% COMPOUND INTEREST !!");
        double interestRate = 0.06;
        double totalAmount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount you want to fix: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the number of years for deposit: ");
        int time = scanner.nextInt();
        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = scanner.nextInt();
        totalAmount = principal * Math.pow((1 + (interestRate / n)), (n * time));
        System.out.println("The final amount after " + time + " years is: " + totalAmount);
    }

    public void recurringDeposit() {
        System.out.println("NOTICE: OUR BANK PROVIDES 6% COMPOUND INTEREST in a year!!");
        double interestRate = 6.0;
        double monthlyInterestRate = interestRate / 12.0 / 100.0;
        double maturedAmount = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly deposit amount for recurring: ");
        double monthlyDeposit = scanner.nextDouble();
        System.out.print("Enter the number of time periods: ");
        int time = scanner.nextInt();
        maturedAmount = monthlyDeposit * (Math.pow((1 + monthlyInterestRate), time - 1) - 1) / monthlyInterestRate;
        System.out.println("The maturity amount after " + time + " months will be: " + maturedAmount);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.mainMenu();
    }
}
