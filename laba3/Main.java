package laba3;


public class Main {
    public static void main(String[] args) {
        Kaktus kaktus = new Kaktus();
        Dostoevskiy dostoevskiy = new Dostoevskiy();
        String text = "Спешу уведомить, что похищенные деньги зарыты во дворе дома No 47 по Кривой улице. Желаю успеха в розысках и счастья в личной жизни. Ваша усердная читательница и почитательница госпожа Кактус. При сем сообщаю, что отлично печатаю на пишущей машинке, знаю кулинарию и умею играть на трубе. ";
        Letter letter = new Letter(text, kaktus, dostoevskiy);
        System.out.println(letter);
    }
}
