import entites.Customer;
import entites.account.Account;
import entites.account.SalaryAccount;
import entites.account.SunbulaAccount;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private final List<Customer> customersList = new ArrayList<>();

    public List<Customer> getCustomersList() {
        return customersList;
    }


    public DataBase() {
        Customer customer1 = getCustomer1();
        Customer customer2 = getCustomer2();

        customersList.add(customer1);
        customersList.add(customer2);
    }

    private Customer getCustomer2() {
        List<Account> accountsCustomer2 = new ArrayList<>();
        accountsCustomer2.add(new SunbulaAccount());
        return new Customer("7823642", "Hussam", "Yasin", 950.500, accountsCustomer2);
    }

    private Customer getCustomer1() {
        List<Account> accountsCustomer1 = new ArrayList<>();
        accountsCustomer1.add(new SalaryAccount());
        accountsCustomer1.add(new SunbulaAccount());
        return new Customer("2783642", "Ahmad", "Najar", 250.500, accountsCustomer1);
    }

    public Customer findCustomerByAccNumber(String accountNumber) {
        Customer customerFounded = null;
        for (Customer customer : customersList) {
            if (customer.getAccountNumber().equalsIgnoreCase(accountNumber)) {
                customerFounded = customer;
            }
        }
        return customerFounded;
    }
}
