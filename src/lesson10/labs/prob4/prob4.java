package lesson10.labs.prob4;

import java.util.List;

public class prob4 {

    public int countWords(List<String> words, char c, char d, int len) {
        int count = 0;
        for (String word : words) {
            if (isDesiredWord(word, c, d, len)) {
                count++;
            }
        }
        return count;
    }

    private boolean isDesiredWord(String word, char c, char d, int len) {
        return word.length() == len && word.indexOf(c) != -1 && word.indexOf(d) == -1;
    }
}

