public class HamburgerByStaticFactory {
    private final String meetType;
    private final String bunType;
    private final String cheese;
    private final String saouce;

    private HamburgerByStaticFactory(String meetType, String bunType, String cheese, String saouce) {
        this.meetType = meetType;
        this.bunType = bunType;
        this.cheese = cheese;
        this.saouce = saouce;
    }

    public static HamburgerByStaticFactory withCheese(String meetType, String bunType, String cheese) {
        return new HamburgerByStaticFactory(meetType, bunType, cheese, "None");
    }

    public static HamburgerByStaticFactory withSaouce(String meetType, String bunType, String saouce) {
        return new HamburgerByStaticFactory(meetType, bunType, "None", saouce);
    }

    public static HamburgerByStaticFactory withCheeseAndSaouce(String meetType, String bunType, String cheese, String saouce) {
        return new HamburgerByStaticFactory(meetType, bunType, cheese, saouce);
    }

    @Override
    public String toString() {
        return "HamburgerByStaticFactory{" +
                "meetType='" + meetType + '\'' +
                ", bunType='" + bunType + '\'' +
                ", cheese='" + cheese + '\'' +
                ", saouce='" + saouce + '\'' +
                '}';
    }
}
