package singletone;

public class SingletoneExample {

    private static final SingletoneExample instance  = new SingletoneExample();

    private SingletoneExample() {}

    public static SingletoneExample getInstance() {
        return instance;
    }
}
