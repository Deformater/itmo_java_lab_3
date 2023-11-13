package laba3;

public class Letter {
    String text;
    Person from;
    Person to;

    public Letter(String text, Person from, Person to) {
        this.text = text;
        this.to = to;
        this.from = from;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("From: %s\nTo: %s\nText: %s", this.from.getName(), this.to.getName(), this.text);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Letter))
            return false;
        Letter letter = (Letter) obj;
        return letter.getText().equals(this.getText()) && letter.from.equals(this.from) && letter.to.equals(this.to);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
