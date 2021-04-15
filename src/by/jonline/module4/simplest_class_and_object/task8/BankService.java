/*
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.

Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

package by.jonline.module4.simplest_class_and_object.task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BankService {
    private String bankName;
    private final List<Customer> customerList = new ArrayList<>();

    BankService(String bankName) {
        this.bankName = bankName;
    }

    public void addCustomerToBankList(Customer customer) {
        customerList.add(customer);
    }

    public List<Customer> findUserByCreditCardNumber(int fromId, int toId) {
        List<Customer> list = new ArrayList<>();
        for (Customer customer : customerList) {
            if (customer.getId() >= fromId && customer.getId() <= toId) {
                list.add(customer);
            }
        }
        return list;
    }

    public static Comparator<Customer> nameComparator = new Comparator<Customer>() {
        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
