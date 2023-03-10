import java.util.Hashtable;

public class HashMain {
    public static void main(String[] args) {

        System.out.println("---Word Frequency Calculator Program---");
        FrequencyCalculator mapString = new FrequencyCalculator();

        System.out.println("Input Paragraph : " + "Paranoids are not\n" +
                                                 "paranoid because they are paranoid but\n" +
                                                 "because they keep putting themselves\n" +
                                                 "deliberately into paranoid avoidable\n" +
                                                 "situations");
        System.out.println();

        mapString.resultCalculate("Paranoids are not" +
                                        "paranoid because they are paranoid but" +
                                        "because they keep putting themselves" +
                                        "deliberately into paranoid avoidable" +
                                        "situations");

        System.out.println();

        mapString.removeWord("Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations", "avoidable");
    }
}

class FrequencyCalculator {

    public void resultCalculate(String input) {

        Hashtable<String, Integer> value = new Hashtable<>();
        String[] words = input.split(" ");

        for (String word : words) {

            Integer val = value.get(word);
            if (val == null) {
                value.put(word, 1);
            } else {
                value.put(word, val + 1);
            }
        }

        System.out.println(value);
    }

    public void removeWord(String input, String delete) {

        Hashtable<String, Integer> value = new Hashtable<>();
        String[] words = input.split(" ");


        for (String word : words) {

            Integer val = value.get(word);
            if (val == null) {
                value.put(word, 1);
            } else {
                value.put(word, val + 1);
            }
        }
        System.out.println(value);
        System.out.println("After Delete");
        value.remove(delete);
        System.out.println(value);
    }
}
