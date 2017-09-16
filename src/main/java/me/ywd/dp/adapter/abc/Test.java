package adapter.abc;

public class Test {
    public static void main(String[] args) {
        Duck duck = new TurkeyAdapter(new WildTurkey());
        duck.quack();
        duck.fly();
    }
}
