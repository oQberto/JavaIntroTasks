/*
 Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.

Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */

package by.jonline.module4.simplest_class_and_object.task9;

public class Book {

    private double price;
    private String id;
    private String title;
    private String author;
    private String publishingHouse;
    private String yearOfPublishing;
    private String numberOfPages;
    private String bindingType;

    public Book(double price, String id, String title, String author, String publishingHouse, String yearOfPublishing, String numberOfPages, String bindingType) {
        this.price = price;
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.bindingType = bindingType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYearOfPublishing(String yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public String getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public String getBindingType() {
        return bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                "price=" + price + '\n' +
                "title='" + title + '\n' +
                "author='" + author + '\n' +
                "publishingHouse='" + publishingHouse + '\n' +
                "yearOfPublishing='" + yearOfPublishing + '\n' +
                "numberOfPages='" + numberOfPages + '\n' +
                "bindingType='" + bindingType + '\n' +
                '}';
    }
}
