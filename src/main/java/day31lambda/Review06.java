package day31lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Review06 {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("src/main/java/day31lambda/LambdaTextFile.txt")).forEach(System.out::println);

        System.out.println("============");

        Files.lines(Paths.get("src/main/java/day31lambda/LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        System.out.println("============");

        boolean result = Files.lines(Paths.get("src/main/java/day31lambda/LambdaTextFile.txt")).anyMatch(t-> t.contains("Lambda"));
        System.out.println(result);

       Files.lines(Paths.get("src/main/java/day31lambda/LambdaTextFile.txt"))
               .map(t-> t.split(" "))
               .flatMap(Arrays::stream)// Break arrays convert them to stream
               .distinct()
               .forEach(System.out::println);

        System.out.println("==================");

       Files.lines(Paths.get("src/main/java/day31lambda/LambdaTextFile.txt"))
               .map(t-> t.split(" "))
               .flatMap(Arrays::stream)
               .filter(t-> t.endsWith("e"))
               .forEach(System.out::println);
    }

}
