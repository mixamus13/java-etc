package com.mixamus.interview.sber;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SberInterviews {
    public static void main(String... args) {

    }
}

// ------  SBER DeduplicateChars -----------
class DedupChars {
    static String deduplicate(String str) {
        // your code
        //return "Здравствуй, Сбер!";

        StringBuilder sb = new StringBuilder();
        var chArray = str.toCharArray();
        char ch = chArray[0];
        sb.append(ch);
        for (char newChars : chArray) {
            if (Character.toLowerCase(newChars) != Character.toLowerCase(ch)) {
                sb.append(newChars);
            }
            ch = newChars;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "Зздрррраавствввууй,    Ссссбееерррр!";
        String expected = "Здравствуй, Сбер!";

        String deduplicated = deduplicate(input);
        System.out.println(deduplicated);
        System.out.println(expected.equals(deduplicated));
    }
}


class AppSberInterviewTree {
    public static void main(String... args) {

        var hashTags = List.of(
                "Сегодня в #МОСКВА хорошая погода, а в #Питер опять дождь",
                "В #питер сегодня пробки 10 баллов",
                "В Америке городе #Маями есть много винограда"
        );

        Set<String> stringList = getHashTagOnly(hashTags);
        stringList.forEach(System.out::println);
    }

    public static Set<String> getHashTagOnly(List<String> hashTags) {
        return hashTags.stream()
                .map(s -> s.split(" "))
                .flatMap(strings -> Arrays.stream(strings).flatMap(String::lines))
                .filter(s -> s.startsWith("#"))
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(TreeSet::new));
    }
}

/*
Как реализовать метод для парсинга сообщений Твиттера: Collection{String} parse(Collection{String} messages){}
На вход метода передаётся коллекция сообщений, которые состоят из текста и хэштегом.
Мы точно знаем, что все слова и хэштеги разделены пробелами.
На выходе нужно отдать отсортированную по алфавиту коллекцию уникальных хэштегом, которые использовались в этих сообщениях.
Уникальность должна быть регистронезависимой, т.е. все хэштеги привести к одному регистру
(например, считать, что #МОСКВА и #москва - одно и то же).

Сегодня в #МОСКВА хорошая погода, а в #Питер опять дождь
В #питер сегодня пробки 10 баллов
В Америке городе #Маями есть много винограда
 */
