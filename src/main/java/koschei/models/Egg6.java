package koschei.models;

// getter 6 with 7 with AppConfig
public class Egg6 {

    private Needle7 needle;

    public Egg6(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
