import entites.Customer;
import entites.account.Account;
import entites.account.SafwaAccount;
import entites.account.SunbulaAccount;

public class ATMMachine {


    public static void main(String[] args) {

        DataBase dataBase = new DataBase();
        Customer customer = dataBase.findCustomerByAccNumber("2783642");

        if (customer != null) {

            for (Account account : customer.getAccounts()) {
                if (account instanceof SafwaAccount) {
                    System.out.println("Account is " + account.name() + "\n" + ((SafwaAccount) account).shuttleAvailable());
                } else if (account instanceof SunbulaAccount) {
                    System.out.println(account.name() + "\n" + ((SunbulaAccount) account).color() + "\n" + ((SunbulaAccount) account).shuttleAvailable());
                }
            }

        } else {
            System.out.println("ERROR: Customer Not Founded");
        }


    }
}
