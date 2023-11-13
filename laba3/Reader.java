package laba3;

import java.util.List;

interface Reader {
    List<Skills> skills = List.of(Skills.READING);
    
    List<Person> readerOf();

    default void addWriter(Person person) {
        readerOf().add(person);
    }
}