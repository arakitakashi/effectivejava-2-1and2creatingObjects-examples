public class HamburgerByConstructor {
    private final String meetType;
    private final String bunType;
    private final String cheese;
    private final String saouce;

    public HamburgerByConstructor(String meetType, String bunType, String cheese, String saouce) {
        this.meetType = meetType;
        this.bunType = bunType;
        this.cheese = cheese;
        this.saouce = saouce;
    }

    @Override
    public String toString() {
        return "HamburgerByConstructor{" +
                "meetType='" + meetType + '\'' +
                ", bunType='" + bunType + '\'' +
                ", cheese='" + cheese + '\'' +
                ", saouce='" + saouce + '\'' +
                '}';
    }
}