import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Integers {
    public static void main(String[] args) {

        List<Integer> integers = List.of(8, 10, 20, 50, 80, 100, 130, 160, 190, 200);

        integers.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return (integer > 100); // (integer > 100) && integer/5  ????
                    }
                })
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer);
                    }
                });
        System.out.println("--------------------------------");

        integers.stream()
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer integer) {
                        return integer * 3;
                    }
                })
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer);
                    }
                         });
        System.out.println("--------------------------------");

        integers.stream()
                .limit(10)
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer);
                    }
                });
    }
}


