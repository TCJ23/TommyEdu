package advanced.java.abstraction.inheritance.hermetisation.polymorphism.issue15;

class Ojciec {
    void do1() {

    }
}

class Dziecko extends Ojciec {
    void do2() {

    }
}

 class Chrome {
    public static void main(String[] args) {
        Ojciec ojciec = new Ojciec();
        Ojciec dziecko1 = new Dziecko();
        Dziecko dziecko2 = new Dziecko();
        ((Dziecko) dziecko1).do2();
    }
}


