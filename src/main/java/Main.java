import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String[] names = {"Лера", "Петя", "Тоня", "Антон", "Елисей", "Тоня", "Чехов", "Гриша", "Петя", "Лера", "Тоня", "Миша", "Боря"};

        Map<String, Integer> wordList = new HashMap<>();
        for (String name : names) {
            wordList.put(name, wordList.getOrDefault(name, 0) + 1);
        }

        System.out.println(wordList);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петя", "123456789");
        phoneBook.add("Петя", "123456789");
        phoneBook.add("Петя", "9876543");
        phoneBook.add("Петя", "1");
        phoneBook.add("Петя", "15");
        phoneBook.add("Гена", "123456789");
        phoneBook.add("Гриша", "1234554");
        phoneBook.add("Тоня", "1357911");
        phoneBook.add("Петя" , "1357911");
        phoneBook.add("Антон", "25476332");
        phoneBook.add("Миша", "87654321");
        phoneBook.add("Елисей", "21345637");

        phoneBook.getAll();
        //сортировка по списку как по именам
    }
}
