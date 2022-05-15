package org.example.javaproblem.chapter3.p58_convertstring_to_date_time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String... args) throws ParseException {
        System.out.println("Before Java 8 (default formatting styles): ");

        var defaultDateFormatUS = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.US);
        // convert String to Date
        // https://bugs.openjdk.java.net/browse/JDK-8206961 - why ",", read there
        var usDate = defaultDateFormatUS.parse("01/15/95, 5:23 AM");
        // convert Date to String
        var usDateAsString = usDate.toString();
        var usDateAsFormattedString = defaultDateFormatUS.format(usDate);
        System.out.println("SHORT format of date & time in US locale: " + usDateAsString);
        System.out.println("SHORT format of date & time in US locale (formatted): " + usDateAsFormattedString);

        var defaultDateFormatDE = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.GERMAN);
        // convert String to Date
        // https://bugs.openjdk.java.net/browse/JDK-8206961 - why ",", read there
        var deDate = defaultDateFormatDE.parse("15.01.95, 5:23 AM");
        // convert Date to String
        var deDateAsString = deDate.toString();
        var deDateAsFormattedString = defaultDateFormatDE.format(deDate);
        System.out.println("SHORT format of date & time in German locale: " + deDateAsString);
        System.out.println("SHORT format of date & time in German locale (formatted): " + deDateAsFormattedString);

        System.out.println("\nBefore Java 8 (custom formatting styles): ");

        // convert String to Date
        var simpleDateFormatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss zzz");
        //simpleDateFormatter.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        var dateSimpleFormatted = simpleDateFormatter.parse("1-Jun-2020 08:22:34 GMT");
        // convert Date to String
        var dateAsDefaultString = dateSimpleFormatted.toString();
        var dateAsFormattedString = simpleDateFormatter.format(dateSimpleFormatted);
        System.out.println("Default format: " + dateAsDefaultString);
        System.out.println("Explicit format: " + dateAsFormattedString);

        System.out.println("\nJava 8, convert without formatter:");

        // convert String to LocalDate
        var localDate = LocalDate.parse("2020-06-01");
        // convert LocalDate to String
        var localDateAsDefaultString = localDate.toString();
        System.out.println("LocalDate: " + localDateAsDefaultString + "( year: " + localDate.getYear() + ", month: " + localDate.getMonthValue() + ", day: " + localDate.getDayOfMonth() + " )");

        var localTime = LocalTime.parse("12:23:44");
        // convert LocalTime to String
        var localTimeAsDefaultString = localTime.toString();
        System.out.println("LocalTime: " + localTimeAsDefaultString + "( hour: " + localTime.getHour() + ", minute: " + localTime.getMinute() + ", second: " + localTime.getSecond() + " )");

        // convert String to LocalDateTime
        var localDateTime = LocalDateTime.parse("2020-06-01T11:20:15");
        // convert LocalDateTime to String
        var localDateTimeAsDefaultString = localDateTime.toString();
        System.out.println("LocalDateTime: " + localDateTimeAsDefaultString + "( year: " + localDateTime.getYear()
                + ", month: " + localDateTime.getMonthValue() + ", day: " + localDateTime.getDayOfMonth()
                + ", hour: " + localDateTime.getHour() + ", minute: " + localDateTime.getMinute()
                + ", second: " + localDateTime.getSecond() + " )");

        // convert String to OffsetDateTime
        var offsetDateTime = OffsetDateTime.parse("2007-12-03T10:15:30+01:00");
        // convert OffsetDateTime to String
        var offsetDateTimeAsDefaultString = offsetDateTime.toString();
        System.out.println("OffsetDateTime: " + offsetDateTimeAsDefaultString + "( year: " + offsetDateTime.getYear()
                + ", month: " + offsetDateTime.getMonthValue() + ", day: " + offsetDateTime.getDayOfMonth()
                + ", hour: " + offsetDateTime.getHour() + ", minute: " + offsetDateTime.getMinute()
                + ", second: " + offsetDateTime.getSecond() + ", offset: " + offsetDateTime.getOffset() + " )");

        // convert String to OffsetTime
        var offsetTime = OffsetTime.parse("10:15:30+01:00");
        // convert OffsetTime to String
        var offsetTimeAsDefaultString = offsetTime.toString();
        System.out.println("OffsetTime: " + offsetTimeAsDefaultString
                + "( hour: " + offsetTime.getHour() + ", minute: " + offsetTime.getMinute()
                + ", second: " + offsetTime.getSecond() + ", offset: " + offsetTime.getOffset() + " )");

        // convert String to ZonedDateTime
        var zonedDateTime = ZonedDateTime.parse("2020-06-01T10:15:30+09:00[Asia/Tokyo]");
        // convert ZonedDateTime to String
        var zonedDateTimeAsDefaultString = zonedDateTime.toString();
        System.out.println("ZonedDateTime: " + zonedDateTimeAsDefaultString + "( year: " + zonedDateTime.getYear()
                + ", month: " + zonedDateTime.getMonthValue() + ", day: " + zonedDateTime.getDayOfMonth()
                + ", hour: " + zonedDateTime.getHour() + ", minute: " + zonedDateTime.getMinute()
                + ", second: " + zonedDateTime.getSecond() + ", offset: " + zonedDateTime.getOffset()
                + ", zone: " + zonedDateTime.getZone() + " )");

        System.out.println("\nJava 8, convert with formatter:");

        var dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        // convert String to LocalDate
        var localDateFormatted = LocalDate.parse("01.06.2020", dateFormatter);
        // convert LocalDate to String
        var localDateAsFormattedString = dateFormatter.format(localDateFormatted);
        System.out.println("Date: " + localDateAsFormattedString + "( year: " + localDateFormatted.getYear()
                + ", month: " + localDateFormatted.getMonthValue() + ", day: " + localDateFormatted.getDayOfMonth() + " )");

        var timeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
        // convert String to LocalTime
        var localTimeFormatted = LocalTime.parse("12|23|44", timeFormatter);
        // convert LocalTime to String
        String localTimeAsFormattedString = timeFormatter.format(localTimeFormatted);
        System.out.println("Time: " + localTimeAsFormattedString + "( hour: " + localTimeFormatted.getHour()
                + ", minute: " + localTimeFormatted.getMinute() + ", second: " + localTimeFormatted.getSecond() + " )");

        var dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss");
        // convert String to LocalDateTime
        var localDateTimeFormatted = LocalDateTime.parse("01.06.2020, 11:20:15", dateTimeFormatter);
        // convert LocalDateTime to String
        var localDateTimeAsFormattedString = dateTimeFormatter.format(localDateTimeFormatted);
        System.out.println("DateTime: " + localDateTimeAsFormattedString + "( year: " + localDateTimeFormatted.getYear()
                + ", month: " + localDateTimeFormatted.getMonthValue() + ", day: " + localDateTimeFormatted.getDayOfMonth()
                + ", hour: " + localDateTimeFormatted.getHour() + ", minute: " + localDateTimeFormatted.getMinute()
                + ", second: " + localDateTimeFormatted.getSecond() + " )");

        var offsetDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd, HH:mm:ss, XXXXX");
        // convert String to OffsetDateTime
        var offsetDateTimeFormatted = OffsetDateTime.parse("2007.12.03, 10:15:30, +01:00", offsetDateTimeFormatter);
        // convert OffsetDateTime to String
        var offsetDateTimeAsFormattedString = offsetDateTimeFormatter.format(offsetDateTimeFormatted);
        System.out.println("OffsetDateTime: " + offsetDateTimeAsFormattedString + "( year: " + offsetDateTimeFormatted.getYear()
                + ", month: " + offsetDateTimeFormatted.getMonthValue() + ", day: " + offsetDateTimeFormatted.getDayOfMonth()
                + ", hour: " + offsetDateTimeFormatted.getHour() + ", minute: " + offsetDateTimeFormatted.getMinute()
                + ", second: " + offsetDateTimeFormatted.getSecond() + ", offset: " + offsetDateTimeFormatted.getOffset() + " )");

        var offsetTimeFormatter = DateTimeFormatter.ofPattern("HH mm ss XXXXX");
        // convert String to OffsetTime
        var offsetTimeFormatted = OffsetTime.parse("10 15 30 +01:00", offsetTimeFormatter);
        // convert OffsetTime to String
        var offsetTimeAsFormattedString = offsetTimeFormatter.format(offsetTimeFormatted);
        System.out.println("OffsetTime: " + offsetTimeAsFormattedString
                + "( hour: " + offsetTimeFormatted.getHour() + ", minute: " + offsetTimeFormatted.getMinute()
                + ", second: " + offsetTimeFormatted.getSecond() + ", offset: " + offsetTimeFormatted.getOffset() + " )");

        var zonedDateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ssXXXXX '['VV']'");
        // DateTimeFormatter zonedDateTimeFormatter
        //      = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ssXXXXX '['VV']'").withZone(ZoneId.of("Europe/Paris"));
        // convert String to ZonedDateTime
        var zonedDateTimeFormatted = ZonedDateTime.parse("01.06.2020, 11:20:15+09:00 [Asia/Tokyo]", zonedDateTimeFormatter);
        // convert ZonedDateTime to String
        var zonedDateTimeAsFormattedString = zonedDateTimeFormatted.format(zonedDateTimeFormatter);
        System.out.println("ZonedDateTime: " + zonedDateTimeAsFormattedString + "( year: " + zonedDateTimeFormatted.getYear()
                + ", month: " + zonedDateTimeFormatted.getMonthValue() + ", day: " + zonedDateTimeFormatted.getDayOfMonth()
                + ", hour: " + zonedDateTimeFormatted.getHour() + ", minute: " + zonedDateTimeFormatted.getMinute()
                + ", second: " + zonedDateTimeFormatted.getSecond() + ", offset: " + zonedDateTimeFormatted.getOffset()
                + ", zone: " + zonedDateTimeFormatted.getZone() + " )");
    }
}

class Main2 {
    public static void main(String... args) {
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS"));
        String zoneDate = ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSSZ"));
        System.out.println(localDate);
        System.out.println(zoneDate);

        LocalDate localDate1 = LocalDate.now();
        System.out.println("localDate1 = " + localDate1);

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        Instant instant = Instant.now();
        System.out.println("instant = " + instant);

        Clock clock = Clock.systemUTC();
        System.out.println("clock = " + clock.instant()
                .plus(3, ChronoUnit.HOURS)
                .minus(30, ChronoUnit.MINUTES));

        Instant instant1 = Instant.now();
        Instant instant2 = instant1.plusSeconds(10);
        System.out.println("instant1.isAfter(instant2) = " + instant1.isAfter(instant2));
        System.out.println("instant1.isBefore(instant2) = " + instant1.isBefore(instant2));
        System.out.println("instant1.until(instant2, ChronoUnit.NANOS) = " + instant1.until(instant2, ChronoUnit.SECONDS));
    }
}

class Main3 {
    public static void main(String... args) {
//        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
//        System.out.println("zoneIds = " + zoneIds);

        List<String> timezones7 = DateTimes.fetchTimeZones7(DateTimes.OffsetType.UTC);
        List<String> timezones8 = DateTimes.fetchTimeZones8(DateTimes.OffsetType.UTC);

        Collections.sort(timezones8);
        timezones8.forEach(System.out::println);
    }
}

final class DateTimes {

    public enum OffsetType {
        GMT, UTC
    }

    private DateTimes() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static List<String> fetchTimeZones8(OffsetType type) {
        List<String> timezones = new ArrayList<>();
        var zoneIds = ZoneId.getAvailableZoneIds();
        var now = LocalDateTime.now();

        zoneIds.forEach(zoneId -> timezones.add("(" + type + now.atZone(ZoneId.of(zoneId))
                .getOffset().getId().replace("Z", "+00:00") + ") " + zoneId));
        return timezones;
    }

    public static List<String> fetchTimeZones7(OffsetType type) {
        List<String> timezones = new ArrayList<>();
        var zoneIds = TimeZone.getAvailableIDs();
        var timestamp = new Date().getTime();

        Arrays.stream(zoneIds).forEach(zoneId -> {
            TimeZone curTimeZone = TimeZone.getTimeZone(zoneId);
            curTimeZone.useDaylightTime();
            String offset = formatOffset(curTimeZone.getOffset(timestamp));
            timezones.add("(" + type + offset + ") " + zoneId);
        });
        return timezones;
    }

    public static String formatOffset(int offset) {
        return offset == 0 ? "+00:00" : String.format("%+03d:%02d", TimeUnit.MILLISECONDS.toHours(offset),
                Math.abs(TimeUnit.HOURS.toMinutes(
                        TimeUnit.MILLISECONDS.toHours(offset) - TimeUnit.MILLISECONDS.toMinutes(offset))));
    }
}
