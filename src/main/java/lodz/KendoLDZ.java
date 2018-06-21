package lodz;

/*
no big comments please
 */
public class KendoLDZ {

    private final String dojo ;
    private final int kyu;
    private static long miecz;
    private String name;
    // no further comments please

    //constructors
    //    public KendoLDZ(String zawodnik) { } -> illegal because of final

    public KendoLDZ(final String dojo, final int kyu, String name) {
        this.dojo = dojo;
        this.kyu = kyu;
        this.name = name;
    }

    //metody
    private static void walczMieczem(long miecz) {
    }

    public String przywitaj(String zawodnik) {
        return "Siemka";
    }

    // no nested and inner classes or interfaces for now


    public enum SPRZET {
        SHINAI, BOKUTO, MEN, DO, TARE, KOTE
    }
}
