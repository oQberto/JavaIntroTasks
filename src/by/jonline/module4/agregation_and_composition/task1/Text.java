/*
Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */

package by.jonline.module4.agregation_and_composition.task1;

public class Text {
    private String title;
    private String body = "";

    public Text(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String addText(Sentence sentence) {
        body += " " + sentence.getValue();
        return body;
    }

    public String addText(Word word) {
        body += " " + word.getWord();
        return body;
    }

    public String outputText() {
        return title + '\n' +
                body;
    }
}
