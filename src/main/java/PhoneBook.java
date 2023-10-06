import java.util.*;

public class PhoneBook {
    private TreeMap<String, TreeSet<String>> persons = new TreeMap<>();

    public void add(String name, String number){
        boolean rep = true;
        {
            for (Set<String> x : persons.values()){
                if (x.contains(number)) rep = false;
            }
            if (rep){
                if (persons.containsKey(name)){
                    if (persons.get(name).add(number) == false){
                        System.out.println("Номер " + name + ": " + number + " уже существует добавить невозможно.");
                    }
                } else {
                    TreeSet<String> sortedNumbers = new TreeSet<>(Comparator.comparingInt(Integer::parseInt));
                    sortedNumbers.add(number);
                    persons.put(name, sortedNumbers);
                }
            } else {
                System.out.println("Номер " + name + ": " + number + " уже существует, добавить невозможно.");
            }
        }
    }

    public void get(String name){
        if (this.persons.containsKey(name)){
            System.out.println(this.persons.get(name));
        }
    }

    public void getAll(){
        for (var pair : persons.entrySet()){
            String name = pair.getKey();
            TreeSet<String> numbers = pair.getValue();
            System.out.println(name + ": " + numbers);
        }
    }
}