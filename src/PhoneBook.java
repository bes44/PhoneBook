import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    private static final HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public static void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(phoneNum);
            phoneBook.put(name, list);
        }
    }

    public static void printBook() {
        for (var entry : phoneBook.entrySet()) {
            String phones = "";
            int i=0;
            for (int num : entry.getValue()) {
                if (i==0){
                    phones +=  num;
                }
                else {
                    phones += ", " + num;

                }
                i++;
            }
            System.out.printf("%s: %s%n", entry.getKey(), phones);
        }
    }

}