package by.jonline.module4.simplest_class_and_object.task8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BelarusBankServiceTest {
    Customer[] customers;
    BankService belarusBank;

    @BeforeEach
    void setUp() {
        customers = new Customer[]{
                new Customer(1, "Smith", "John", "first street", 123456789, 457896),
                new Customer(2, "Brown", "Emily", "second street", 12569874, 4568789),
                new Customer(3, "Taylor", "Kevin", "third street", 12569874, 4568789),
                new Customer(4, "Walker", "Hana", "fourth street", 12569874, 4568789),
                new Customer(5, "Harris", "Alana", "fifth street", 12569874, 4568789),
                new Customer(6, "Davis", "Bill", "sixth street", 12569874, 4568789),
                new Customer(7, "Lewis", "Emily", "seventh street", 12569874, 4568789),
                new Customer(8, "King", "Ben", "eighth street", 12569874, 4568789),
                new Customer(9, "Young", "Alex", "ninth street", 12569874, 4568789),
                new Customer(10, "Moore", "Emma", "tenth street", 12569874, 4568789)
        };

        belarusBank = new BankService("BelarusBank");
        belarusBank.addCustomerToBankList(new Customer(1, "Smith", "John", "first street", 123456789, 457896));
        belarusBank.addCustomerToBankList(new Customer(2, "Brown", "Emily", "second street", 12569874, 4568789));
        belarusBank.addCustomerToBankList(new Customer(3, "Taylor", "Kevin", "third street", 12569874, 4568789));
        belarusBank.addCustomerToBankList(new Customer(4, "Walker", "Hana", "fourth street", 12569874, 4568789));
        belarusBank.addCustomerToBankList(new Customer(5, "Harris", "Alana", "fifth street", 12569874, 4568789));
        belarusBank.addCustomerToBankList(new Customer(6, "Davis", "Bill", "sixth street", 12569874, 4568789));
        belarusBank.addCustomerToBankList(new Customer(7, "Lewis", "Emily", "seventh street", 12569874, 4568789));
        belarusBank.addCustomerToBankList(new Customer(8, "King", "Ben", "eighth street", 12569874, 4568789));
        belarusBank.addCustomerToBankList(new Customer(9, "Young", "Alex", "ninth street", 12569874, 4568789));
        belarusBank.addCustomerToBankList(new Customer(10, "Moore", "Emma", "tenth street", 12569874, 4568789));
    }

    @Test
    void findUserByCreditCardNumber() {
        List<Customer> customerList = belarusBank.findUserByCreditCardNumber(1, 6);
        Customer[] expected = new Customer[]{
                new Customer(1, "Smith", "John", "first street", 123456789, 457896),
                new Customer(2, "Brown", "Emily", "second street", 12569874, 4568789),
                new Customer(3, "Taylor", "Kevin", "third street", 12569874, 4568789),
                new Customer(4, "Walker", "Hana", "fourth street", 12569874, 4568789),
                new Customer(5, "Harris", "Alana", "fifth street", 12569874, 4568789),
                new Customer(6, "Davis", "Bill", "sixth street", 12569874, 4568789),
        };

        assertEquals(Arrays.toString(expected), customerList.toString());
    }

    @Test
    void showUsersByName() {
        Arrays.sort(customers, BankService.nameComparator);
        Customer[] expected = new Customer[]{
                new Customer(5, "Harris", "Alana", "fifth street", 12569874, 4568789),
                new Customer(9, "Young", "Alex", "ninth street", 12569874, 4568789),
                new Customer(8, "King", "Ben", "eighth street", 12569874, 4568789),
                new Customer(6, "Davis", "Bill", "sixth street", 12569874, 4568789),
                new Customer(2, "Brown", "Emily", "second street", 12569874, 4568789),
                new Customer(7, "Lewis", "Emily", "seventh street", 12569874, 4568789),
                new Customer(10, "Moore", "Emma", "tenth street", 12569874, 4568789),
                new Customer(4, "Walker", "Hana", "fourth street", 12569874, 4568789),
                new Customer(1, "Smith", "John", "first street", 123456789, 457896),
                new Customer(3, "Taylor", "Kevin", "third street", 12569874, 4568789)
        };

        assertEquals(Arrays.toString(expected), Arrays.toString(customers));
    }
}