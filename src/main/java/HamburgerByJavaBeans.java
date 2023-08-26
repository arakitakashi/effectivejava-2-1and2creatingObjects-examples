public class HamburgerByJavaBeans {
    private  String meetType;
    private  String bunType;
    private  String cheese;
    private  String saouce;

    public HamburgerByJavaBeans() {
    }

    public String getMeetType() {
        return meetType;
    }

    public void setMeetType(String meetType) {
        this.meetType = meetType;
    }

    public String getBunType() {
        return bunType;
    }

    public void setBunType(String bunType) {
        this.bunType = bunType;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getSaouce() {
        return saouce;
    }

    public void setSaouce(String saouce) {
        this.saouce = saouce;
    }

    @Override
    public String toString() {
        return "HamburgerByJavaBeans{" +
                "meetType='" + meetType + '\'' +
                ", bunType='" + bunType + '\'' +
                ", cheese='" + cheese + '\'' +
                ", saouce='" + saouce + '\'' +
                '}';
    }
}
