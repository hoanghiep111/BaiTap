package bu3_training.shop_demo.java8;

import java.util.*;
import java.util.stream.Collectors;

public class BaiTap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java","c", "api","python");
        List<Integer> numbers = Arrays.asList(9,4,3,2,5,6,7,8);

        //Bài 1
        // chuyển chữ in hoa
        List<String> upperCase = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Chữ in hoa: " + upperCase);

        // chuyển chữ in thường
        List<String> lowerCase = words.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Chữ in thường: " + lowerCase);


        // Baài 2
        // tính các số chắn
        int evenSum = numbers.stream().filter(number -> number % 2 == 0).mapToInt(number -> number).sum();
        // tinh các số lẻ
        int oddSum = numbers.stream().filter(number -> number % 2 != 0).mapToInt(number -> number).sum();

        System.out.println("Tổng số chẵn: " + evenSum );
        System.out.println("Tổng số chẵn: " + oddSum );


        // Bài 3
        // sắp xếp tăng dần
        List<String> ascending = words.stream().sorted().collect(Collectors.toList());
        System.out.println("Sắp xếp tăng dần: " + ascending);

        // sắp ếp giảm dần
        List<String> descending = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sắp xếp tăng dần: " + descending);


        // Bài 4
        // Tìm số nhỏ thứ 2
       int secondSmall = numbers.stream().distinct().sorted().skip(1).findFirst().orElse(-1);
        System.out.println("Số nhỏ thứ 2: " + secondSmall);
        // Tìm số lớn thứ 2
        int secondLargest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
        System.out.println("Số nhỏ thứ 2: " + secondLargest);


        // bài 5
        //dùng groupingBy để nhóm chúng lại theo độ dài của chuỗi
        Map<Integer, List<String>> groupedByLength = words.stream().collect(Collectors.groupingBy(String::length));
        for (Map.Entry<Integer, List<String>> entry : groupedByLength.entrySet()) {
            System.out.println("Các từ có độ dài " + entry.getKey() + ":");
            for (String word : entry.getValue()) {
                System.out.println(word);
            }
        }


        // bài 6
        // dùng joining nối tất cả thành chuỗi
        String join = words.stream().collect(Collectors.joining(", "));
        System.out.println(" sau khi nối: " + join);


        // Bài 7
        List<Person> people = Arrays.asList(
                new Person("Man", 25),
                new Person("Boy", 30),
                new Person("Girl", 28),
                new Person("Boy", 27)
        );

        Map<String, Person> personMap = people.stream().collect(Collectors.toMap(Person::getName, person -> person,( oldValue, newValue) -> oldValue));

        // in danh sách
        personMap.forEach((name,person) -> System.out.println(name + ":" + person));



        // Bài 8: Tìm số chẵn đầu tiên bằng Stream API
        Optional<Integer> firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        if (firstEven.isPresent()) {
            System.out.println("Số chẵn đầu tiên là: " + firstEven.get());
        } else {
            System.out.println("Không có số chẵn nào trong danh sách.");
        }

    }
}
