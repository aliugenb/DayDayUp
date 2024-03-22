import java.util.StringJoiner;

public class Demo {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        var sj = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj.toString());
    }
}
