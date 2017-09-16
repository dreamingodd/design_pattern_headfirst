package callback.asynchronize;

public class Test {
    public static void main(String[] args) {
        Solver solver = new Solver();
        Riser riser = new Riser(solver);
        riser.riseProblem("How to distribute profits of the company?");
    }
}
