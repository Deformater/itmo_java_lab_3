package laba3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kaktus kaktus = new Kaktus();
        System.out.println(kaktus);
        System.out.println(kaktus.readerOf());
        System.out.println(kaktus.fanOf());
        System.out.println(kaktus.getSkills());
        System.out.println(kaktus.getName());

        kaktus.addSkills(List.of(Skills.WRITING, Skills.READING));
        System.out.println(kaktus.getSkills());
        // kaktus.addIdols();
        System.out.println(kaktus.fanOf());
        System.out.println(kaktus.readerOf());
    }
}
