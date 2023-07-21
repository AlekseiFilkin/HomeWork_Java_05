import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+79235215425");
        phoneBook.add("Петров", "+79132503669");
        phoneBook.add("Сидоров", "+79039392585");
        phoneBook.add("Иванов", "+79832539999");

        List<String> strings = phoneBook.get("Иванов");
        System.out.println(strings);
    }
}