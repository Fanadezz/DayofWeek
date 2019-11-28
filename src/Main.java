import java.util.Objects;

public class Main {

    public String nullTest(String name) {
        String value;
        value = Objects.requireNonNullElse(name, "");
        return value;
    }

}
