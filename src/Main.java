
public class Main {
    public static void main(String[] args) {
        PhoneBook.add("Ivanov", 123);
        PhoneBook.add("Ivanov", 1234);
        PhoneBook.add("Petrov", 546585);
        PhoneBook.add("Sidorov", 8956477);
        PhoneBook.add("Ivanov", 12356233);
        PhoneBook.add("Petrov", 787897);

        PhoneBook.printBook();
    }
}