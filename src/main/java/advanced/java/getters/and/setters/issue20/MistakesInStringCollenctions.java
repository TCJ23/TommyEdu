package advanced.java.getters.and.setters.issue20;

import java.util.ArrayList;
import java.util.List;

public class MistakesInStringCollenctions {
    private List<String> listTitles;

    public void setListTitles(List<String> titles) {
        this.listTitles = new ArrayList<String>(titles);
//        AVOID ------> this.listTitles = titles;
    }

    public List<String> getListTitles() {
        return new ArrayList<>(this.listTitles);
//        AVOID -------> return this.listTitles;
    }
    public static void main(String[] args) {
        MistakesInStringCollenctions app = new MistakesInStringCollenctions();
        List<String> titles1 = new ArrayList();
        titles1.add("Name");
        titles1.add("Address");
        titles1.add("Email");
        titles1.add("Job");

        app.setListTitles(titles1);

        System.out.println("Titles 1: " + titles1);

        titles1.set(2, "Habilitation");

        List<String> titles2 = app.getListTitles();
        System.out.println("Titles 2: " + titles2);

        titles2.set(0, "Full name");

        List<String> titles3 = app.getListTitles();
        System.out.println("Titles 3: " + titles3);

    }
}
