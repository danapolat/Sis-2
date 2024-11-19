public class ExamCheckingSimulation {
    public static void main(String[] args) {
        int totalSheets = 500;
        int sheetsPerThread = 50;
        int iterations = 6;

        int numThreads = totalSheets / sheetsPerThread;

        System.out.println("Starting exam checking with " + numThreads + " assistants (threads).");

        for (int i = 1; i <= numThreads; i++) {
            ExamChecking assistant = new ExamChecking(i, sheetsPerThread, iterations);
            assistant.start();
        }
    }
}

