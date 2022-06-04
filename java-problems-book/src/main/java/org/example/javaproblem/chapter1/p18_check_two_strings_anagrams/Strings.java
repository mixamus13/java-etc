package org.example.javaproblem.chapter1.p18_check_two_strings_anagrams;

import lombok.Value;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Strings {

    private static final int EXTENDED_ASCII_CODES = 256;

    private Strings() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static boolean isAnagramV1(String str1, String str2) {
        int[] chCounts = new int[EXTENDED_ASCII_CODES];
        char[] chStr1 = str1.replace("\\s", "").toLowerCase().toCharArray();
        char[] chStr2 = str2.replace("\\s", "").toLowerCase().toCharArray();

        if (chStr1.length != chStr2.length) {
            return false;
        }

        for (int i = 0; i < chStr1.length; i++) {
            chCounts[chStr1[i]]++;
            chCounts[chStr2[i]]--;
        }

        for (int chCount : chCounts) {
            if (chCount != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagramV2(String str1, String str2) {
        return false;
    }

    public static boolean isAnagramStream(String str1, String str2) {
//        str1 = str1.replace("\\s", "").toLowerCase();
//        str2 = str2.replace("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        return Arrays.equals(
                str1.chars().sorted().toArray(),
                str2.chars().sorted().toArray()
        );
    }
}

class ApplicationSearchNumbers {
    public static void main(String... args) {
        Integer[] numbers = {3, 34, 1, -45, 4, 72, 9, 34, 5, 7, 26};
        Integer near = 6;

        System.out.println("getNearNumberOne(numbers) = " + getNearNumberOne(numbers, near));
    }

    public static Integer getNearNumberOne(Integer[] numbers, Integer target) {
        int max = Integer.MAX_VALUE;
        Integer result = target;
        for (var v : numbers) {
            final int diff = Math.abs(v - target);
            if (diff < max) {
                max = diff;
                result = v;
            }
        }
        return result;
    }
}

class App {
    public static void main(String... args) {
        Map<Integer, String> stringsMap = new HashMap<>();
        stringsMap.put(1, "Pop");
        stringsMap.put(1, "PoWep");
        stringsMap.put(1, "Got");
        stringsMap.entrySet().forEach(System.out::println);

        NavigableSet<Cat> catSet = new TreeSet<>();
        catSet.add(new Cat(23));
        catSet.add(new Cat(23));
        catSet.add(new Cat(223));
        //catSet.add((Cat) new Object());
        System.out.println("catSet = " + catSet);

    }
}

@Value
class Cat implements Comparable<Cat> {
    int name;

    @Override
    public int compareTo(@NotNull Cat cat) {
        return Integer.compare(this.name, cat.getName());
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

    @NotNull
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

