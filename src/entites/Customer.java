package entites;

import entites.account.Account;

import java.util.List;
import java.util.Objects;

public class Customer {
    private String accountNumber;
    private String firstName;
    private String lastName;
    private Double availableBalance;
    private List<Account> accounts;

    public static final String NAME_FORMAT = "%s %s";


    public Customer(String accountNumber, String firstName, String lastName, Double availableBalance, List<Account> accounts) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.availableBalance = availableBalance;
        this.accounts = accounts;
    }

    public Customer() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getAvailableBalance() {
        return availableBalance;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getName() {
        return String.format(NAME_FORMAT, firstName, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(accountNumber, customer.accountNumber) &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(availableBalance, customer.availableBalance) &&
                Objects.equals(accounts, customer.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, firstName, lastName, availableBalance, accounts);
    }


    @Override
    public String toString() {
        StringBuilder formattedString = new StringBuilder();
        formattedString.append(getName())
                .append(":")
                .append(formattedAccounts());
        return formattedString.toString();
    }


    public String formattedAccounts() {
        StringBuilder accounts = new StringBuilder();
        for (Account account : getAccounts()) {
            accounts.append(account.name()).append("\n");
        }
        return accounts.toString();
    }
}
