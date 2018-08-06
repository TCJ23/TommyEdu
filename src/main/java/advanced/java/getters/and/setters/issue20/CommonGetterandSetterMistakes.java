package advanced.java.getters.and.setters.issue20;

/*              http://www.codejava.net/coding/java-getter-and-setter-tutorial-from-basics-to-best-practices  */
public class CommonGetterandSetterMistakes {
    private int[] scores;

    public void setScores(int[] scr) {
//        this.scores = scr;        AVOID THAT
        this.scores = new int[scr.length];
        System.arraycopy(scr, 0, this.scores, 0, scr.length);
    }

    public int[] getScores() {
        int[] copy = new int[this.scores.length];
        System.arraycopy(this.scores, 0, copy, 0, copy.length);
        return copy;
    }

    public static void main(String[] args) {
        CommonGetterandSetterMistakes mistake = new CommonGetterandSetterMistakes();
        int[] myScores = {5, 5, 4, 3, 2, 4};

        mistake.setScores(myScores);

        mistake.displayScores();

        myScores[1] = 1;

        mistake.displayScores();

        int[] copyScores = mistake.getScores();

        copyScores[1] = 1;

        mistake.displayScores();
    }

    public void displayScores() {
        for (int i = 0; i < this.scores.length; i++) {
            System.out.print(this.scores[i] + " ");
        }
        System.out.println();
    }
}
