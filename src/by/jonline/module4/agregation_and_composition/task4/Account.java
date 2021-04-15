/*
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

package by.jonline.module4.agregation_and_composition.task4;

import java.util.Objects;

public class Account {

    private int accountNumber;
    private double accountBalance;
    private boolean lockStatus;
    private Client client;

    public Account(int cardNumber, double accountBalance, boolean lockStatus, Client client) {
        this.accountBalance = accountBalance;
        this.accountNumber = cardNumber;
        this.lockStatus = lockStatus;
        this.client = client;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isLockStatus() {
        return lockStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setLockStatus(boolean lockStatus) {
        this.lockStatus = lockStatus;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber &&
                Double.compare(account.accountBalance, accountBalance) == 0 &&
                lockStatus == account.lockStatus &&
                Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountBalance, lockStatus, client);
    }
}
