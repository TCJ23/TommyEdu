package basic.java.strings.issue10;

import javax.swing.*;

public class StringBuffer_vs_StringBuilder {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Liczba operacji"));

        // warmup (bez rozgrzewki JVM wyniki będą nieco skrzywione)
        QTimer timer = new QTimer().start();
        for (long i = 0; i < 1_000_000_000; i++);
            timer.stop();

        // Jak długo trwa sumowanie int'ów?
        timer.start();
        long sum = 0;
        for (int i = 0; i < n; i++) sum += i;
        System.out.println("Sumowanie liczb całkowitych " + timer.stop());

        // StringBuffer
        timer.start();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) stringBuffer.append("A");
        stringBuffer.toString();
        System.out.println("StringBuffer append. " + timer.stop());
        long stringBufferTime = timer.elapsed();

        // String
        timer.start();
        String string = "";
        for (int i = 0; i < n; i++) string += "B";
        System.out.println("String operator +; " + timer.stop());
        double result1 = (double) timer.elapsed() / stringBufferTime;

        // StringBuilder
        timer.start();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) stringBuilder.append("C");
        stringBuilder.toString();
        System.out.println("StringBuilder append. " + timer.stop());
        double result2 = (double) timer.elapsed()/stringBufferTime;

        System.out.println("Wykonano " + n + " operacji.");
        System.out.println("Relacja String/StringBuffer = " + result1);
        System.out.println("Relacja StringBuilder/StringBuffer = " + result2);
    }
}
