package callback.asynchronize;

import callback.asynchronize.Solver;

public class Riser implements Callback {

    private Solver solver;

    public Riser(Solver solver) {
        this.solver = solver;
    }

    public void doOtherTask() {
        System.out.println("Riser goes to do some other tasks.");
    }

    public void riseProblem(final String problem) {
        new Thread(new Runnable() {
                public void run() {
                    solver.execute(problem, Riser.this);
                }
        }).start();
        this.doOtherTask();
    }

    public void solve(String result) {
        System.out.println("Solver sends answer and Riser receive: " + result);
    }
}
