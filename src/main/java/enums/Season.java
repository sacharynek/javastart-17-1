package enums;

public enum Season {
    SPRING("wiosna", new String[]{"mar", "kwi", "ja"}),
    SUMMER("lato", new String[]{"cze", "lip", "sie"}),
    AUTUMN("jesień", new String[]{"wrz", "paź", "lis"}),
    WINTER("zima", new String[]{"gru", "sty", "lut"});

    private final String polishName;
    private final String[] months;

    Season(String polishName, String[] months) {
        this.polishName = polishName;
        this.months = months;
    }


    public String[] getMonths() {
        return this.months;
    }

    public void printMonths() {
        for (String name : getMonths()) {
            System.out.println(name);
        }
    }

    public static Season fromString(String text) {
        String seasonName = text.trim();
        for (Season b : Season.values()) {
            if (b.polishName.equalsIgnoreCase(seasonName)) {
                return b;
            }
        }
        return null;
    }


}
