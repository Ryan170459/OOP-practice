import com.accounts.accountClass;
import com.accounts.SavingsAccountextendsAccount;
import java.util.Scanner;

public class Main12 {
    public static void main(String[]args){
        System.out.println("THe Bank Accounts...");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input account number:");
        int accountNumber= scanner.nextInt();

        System.out.println("Input balance:");
        float  Balance= scanner.nextFloat();

        accountClass account1=new accountClass(accountNumber,Balance);
        account1.checkBalance();

        SavingsAccountextendsAccount Account2 = new SavingsAccountextendsAccount(354,600000F,1.5D);
        Account2.checkBalance();
    }
}
