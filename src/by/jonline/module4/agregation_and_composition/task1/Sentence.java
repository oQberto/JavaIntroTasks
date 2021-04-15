package by.jonline.module4.agregation_and_composition.task1;

public class Sentence {
    private String value = "";

    public void addValue(Word word) {
        value += " " + word.getWord();
    }

    public String getValue() {
        return value;
    }
}