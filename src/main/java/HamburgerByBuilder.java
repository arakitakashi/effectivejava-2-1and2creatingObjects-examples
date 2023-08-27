public class HamburgerByBuilder {
    private final String meetType;
    private final String bunType;
    private final String cheese;
    private final String saouce;

    private HamburgerByBuilder(Builder builder) {
        meetType = builder.meetType;
        bunType = builder.bunType;
        cheese = builder.cheese;
        saouce = builder.saouce;
    }

    public static class Builder {
        private final String meetType;
        private final String bunType;

        // optional
        private String cheese = "None";
        private String saouce = "None";

        public Builder(String meetType, String bunType) {
            this.meetType = meetType;
            this.bunType = bunType;
        }

        public Builder cheese(String val) {
            cheese = val;
            return this;
        }

        public Builder saouce(String val) {
            saouce = val;
            return this;
        }

        public HamburgerByBuilder build() {
            return new HamburgerByBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "meetType='" + meetType + '\'' +
                ", bunType='" + bunType + '\'' +
                ", cheese='" + cheese + '\'' +
                ", saouce='" + saouce + '\'' +
                '}';
    }
}
