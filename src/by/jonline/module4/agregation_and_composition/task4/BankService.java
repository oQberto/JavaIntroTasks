/*
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

package by.jonline.module4.agregation_and_composition.task4;

import java.util.Comparator;
import java.util.List;

public class BankService {
    private List<Account> accountList;
    private List<Client> clientList;
    private List<Account> badAccounts;
    private List<Account> goodAccounts;

    private double clientsMoney;
    private double amountOfBills;

    public BankService() {
    }

    public BankService(List<Account> accountList, List<Client> clientList) {
        this.accountList = accountList;
        this.clientList = clientList;
    }

    public void generateClientsLists(List<Account> accountList) {
        for (Account account : accountList) {
            if (account.getAccountBalance() < 0) {
                this.badAccounts.add(account);
            } else {
                this.goodAccounts.add(account);
            }
        }
    }

    public void clientAccountStatus(Account account) {

    }

    public static Comparator<Account> accountIdComparator = new Comparator<Account>() {
        @Override
        public int compare(Account o1, Account o2) {
            return Double.compare(o1.getAccountBalance(), o2.getAccountBalance());
        }
    };

    public void amountOfInvoicesOnAccounts(List<Account> accountList) {
        for (Account account : accountList) {
            this.clientsMoney += account.getAccountBalance();
        }
    }

    public double amountOfAccountsWithPositiveBalance() {
        amountOfBills = 0;

        for (Account account : goodAccounts) {
            amountOfBills += account.getAccountBalance();
        }
        return amountOfBills;
    }

    public double amountOfAccountsWithNegativeBalance() {
        amountOfBills = 0;

        for (Account account : badAccounts) {
            amountOfBills += account.getAccountBalance();
        }
        return amountOfBills;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public List<Account> getBadAccounts() {
        return badAccounts;
    }

    public List<Account> getGoodAccounts() {
        return goodAccounts;
    }

    public double getAmountOfBills() {
        return amountOfBills;
    }

    public double getClientsMoney() {
        return clientsMoney;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
}
