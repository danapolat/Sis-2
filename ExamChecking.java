class ExamChecking extends Thread {
    private final int threadId;
    private final int sheetsPerThread;
    private final int iterations;

    public ExamChecking(int threadId, int sheetsPerThread, int iterations) {
        this.threadId = threadId;
        this.sheetsPerThread = sheetsPerThread;
        this.iterations = iterations;
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i <= iterations; i++) {
                System.out.println("Assistant " + threadId + " is checking " +
                        sheetsPerThread + " sheets (Iteration " + i + ").");
                Thread.sleep(500);
            }
            System.out.println("Assistant " + threadId + " has completed its task.");
        } catch (InterruptedException e) {
            System.out.println("Assistant " + threadId + " was interrupted.");
        }
    }
}