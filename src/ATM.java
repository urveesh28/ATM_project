import java.util.Scanner;

public class ATM {
    private BankAccount currentAccount;

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        // Sample user and account for demonstration
        User user = new User("John Doe", "1234");
        currentAccount = new BankAccount(user, 1000.0);

        System.out.println("Welcome to the ATM!");

        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        if (authenticate(pin)) {
            boolean quit = false;
            while (!quit) {
                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Quit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        deposit(scanner);
                        break;
                    case 3:
                        withdraw(scanner);
                        break;
                    case 4:
                        quit = true;
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid PIN. Access denied.");
        }
        scanner.close();
    }

    private boolean authenticate(String pin) {
        return currentAccount.getUser().getPin().equals(pin);
    }

    private void checkBalance() {
        System.out.printf("Current Balance: $%.2f\n", currentAccount.getBalance());
    }

    private void deposit(Scanner scanner) {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            currentAccount.deposit(amount);
            System.out.printf("Successfully deposited $%.2f\n", amount);
            checkBalance();
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }

    private void withdraw(Scanner scanner) {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= currentAccount.getBalance()) {
            currentAccount.withdraw(amount);
            System.out.printf("Successfully withdrew $%.2f\n", amount);
            checkBalance();
        } else {
            System.out.println("Invalid amount or insufficient funds. Please try again.");
        }
    }
}
