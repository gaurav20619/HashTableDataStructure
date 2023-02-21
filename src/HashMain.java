import java.util.Hashtable;

public class HashMain {
    public static void main(String[] args) {

        System.out.println("---Word Frequency Calculator Program---");
        FrequencyCalculator mapString = new FrequencyCalculator();
        System.out.println("Input Sentence : To be or not to be");
        mapString.resultCalculate("To be or not to be");

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
}
