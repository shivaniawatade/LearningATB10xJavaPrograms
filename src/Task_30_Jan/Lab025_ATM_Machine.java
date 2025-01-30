package Task_30_Jan;
import java.util.*;
public class Lab025_ATM_Machine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int accountBalance= 200000;
        System.out.println("please the Amount which you want to withdraw: ");
        int withdrawAmount= sc.nextInt();
        if (withdrawAmount <= 0) {
            System.out.println("Error: Amount must be greater than ₹0.");
        } else if (withdrawAmount % 100 != 0) {
            System.out.println("Error: Amount must be a multiple of ₹100.");
        } else if (withdrawAmount > accountBalance) {
            System.out.println("Error: Insufficient account balance.");
        } else {
            // Step 4: Deduct the amount and display the updated balance
            accountBalance -= withdrawAmount;
            System.out.println("Withdrawal successful!");
            System.out.println("Updated account balance: ₹" + accountBalance);
        }

    }

}
