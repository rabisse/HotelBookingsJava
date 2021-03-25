import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;
    private String function;


    public ConferenceRoom(String name, String function, int capacity) {
        super(capacity);
        this.name = name;
        this.function = function;
    }

    public String getName() {
        return name;
    }

    public String getFunction() {
        return function;
    }
}
