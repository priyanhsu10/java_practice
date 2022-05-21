package basics;

import java.util.function.Supplier;

public class ReadEnvironmentVariable {
    public static void main(String[] args) {
        System .getenv()
                .entrySet()
                .stream()
                .forEach(x-> System.out.println(x.getKey() +"=" +x.getValue()));

        //check supplier
        int a=10;
        Supplier runnable = () -> String.format("test %d", a);
        System.out.println(runnable.get());
    }
}
