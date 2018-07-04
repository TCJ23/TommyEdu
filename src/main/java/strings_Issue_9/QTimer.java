package strings_Issue_9;

public class QTimer {

    private long start;
    private long elapsed; //ile minęło między start() i stop()
    private boolean counting; //czy licznik działa (był start nie było stop
    private boolean measured; // czy czas został zmierzony (był start a po nim stop

    public QTimer start() {
        if (counting) emsg("Can't start counting timer");
        counting = true;
        measured = false;
        start = System.nanoTime();
        return this;
    }

    public QTimer stop() {
        if (!counting) emsg("Can't stop counting timer");
        elapsed = System.nanoTime() - start;
        counting = false;
        measured = true;
        return this;
    }

    public long elapsed() {
        if (!measured) emsg("Elapsed time not measured yet");
        return elapsed;
    }

    public String toString() {
        if (!measured) emsg("Elapsed time not measured yet");
        return "Czas: " + elapsed + " ns, " + "czyli " + 1. * elapsed / 1_000_000_000 + " sek.";
    }

    private void emsg(String msg) {
        throw new RuntimeException(msg);
    }


}
