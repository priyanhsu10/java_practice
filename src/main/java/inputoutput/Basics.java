package inputoutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Basics {
    public static void main(String[] args) {


        example1();

        exmample2();

    }

    private static void example1() {
        try(Stream<String> stream= Files.lines(Paths.get("/Library/Java/JavaVirtualMachines/jdk-17.0.1.jdk/Contents/Home/LICENSE"))){
          stream.forEach(System.out::println);
        }catch (IOException e){

        }
    }

    private static void exmample2() {
        try(Stream<Path> stream= Files.list(Paths.get("/Library/Java/JavaVirtualMachines/jdk-17.0.1.jdk/Contents/Home"))) {

            stream.filter(x -> x.toFile().isFile()).forEach(x -> {

                try {
                    System.out.println(x);
                    Files.lines(x)
                            .forEach(System.out::println);
                } catch (IOException e) {

                }
            });
        }
        catch (IOException e){

        }
    }
}
