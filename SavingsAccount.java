public class SavingsAccount {
    private double savingsBalance;
    private static double annualInterestRate;

    public SavingsAccount(double balance){
        this.savingsBalance = balance;
    }
    public void calculateMonthlyInterest(){
        double monthlyInterest = (savingsBalance * annualInterestRate/12)/100;
        savingsBalance += monthlyInterest;
    }
    public void printSavingsBalance(){
        System.out.printf("  Savings Balance:Rs %.2f  \n ",savingsBalance);
    }
    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }
    public static void main(String[] args) {
        SavingsAccount saver1= new SavingsAccount(2000.00);
        SavingsAccount saver2= new SavingsAccount(3000.00);
       
        SavingsAccount.modifyInterestRate(4.0);
        
        System.out.println("--------Balance with 4% Interest rate-------- ");
        saver1.calculateMonthlyInterest();
        saver1.printSavingsBalance();
        saver2.calculateMonthlyInterest();
        saver2.printSavingsBalance();
        SavingsAccount.modifyInterestRate(5.0);

        System.out.println("--------Balances with 5% Interest rate-------- ");
        saver1.calculateMonthlyInterest();
        saver1.printSavingsBalance();
        saver2.calculateMonthlyInterest();
        saver2.printSavingsBalance();
    }
    }
