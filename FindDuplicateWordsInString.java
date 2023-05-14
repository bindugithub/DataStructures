import java.util.HashMap;

public class FindDuplicateWordsInString {
    public static void main(String[] args) {
        FindDuplicateWordsInString fw = new FindDuplicateWordsInString();
        System.out.println(fw.countDuplicateCharInString("It is string duplicate string of string"));

    }

    public int countDuplicateCharInString(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String c : s.split(" ")) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        for (String z : map.keySet()) {
            if (map.get(z) > 1) {
                return map.get(z);
            }
        }
        return -1;
    }
}
