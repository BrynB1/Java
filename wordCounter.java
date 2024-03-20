package Junior;

class Word {
    String word;
    int frequency;
    Word next;

    public Word(String word) {
        this.word = word;
        this.frequency = 1;
        this.next = null;
    }
}

class WordList {
    Word head;

    public WordList(String text) {
        head = null;
        processText(text);
    }

    private void processText(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            Word existingWord = findWord(word);
            if (existingWord != null) {
                existingWord.frequency++;
            } else {
                Word newWord = new Word(word);
                newWord.next = head;
                head = newWord;
            }
        }
    }

    private Word findWord(String word) {
        Word current = head;
        while (current != null) {
            if (current.word.equals(word)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void display() {
        Word current = head;
        while (current != null) {
            System.out.println(current.word + ": " + current.frequency);
            current = current.next;
        }
    }
}

public class wordCounter {
    public static void main(String[] args) {
        String s = "Monmouth University is located in Monmouth county that is a county in central New Jersey";
        WordList wordList = new WordList(s);
        wordList.display();
    }
}
