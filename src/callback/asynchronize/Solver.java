package callback.asynchronize;



public class Solver {
    public void execute(String problem, Callback callback)  {
        System.out.println("Riser rises a problem: " + problem);

        System.out.println("Solver is working on the problem");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(0);
        }

        String result = "SolutionA, SolutionB";
        callback.solve(result);
    }
}
