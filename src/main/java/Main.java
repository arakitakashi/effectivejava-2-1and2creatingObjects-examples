public class Main {
    public static void main(String[] args) {
        HamburgerByBuilder hamburger1 = new HamburgerByBuilder.Builder("ビーフ", "小麦バン").cheese("スイスチーズ").saouce("バーベキュー").build();
        System.out.println(hamburger1);

        HamburgerByStaticFactory hamburgerWithCheese = HamburgerByStaticFactory.withCheese("チキン", "バケット", "ゴーダチーズ");
        HamburgerByStaticFactory hamburgerWithCheeseAndSauce = HamburgerByStaticFactory.withCheeseAndSaouce("チキン", "バケット", "コーダチーズ", "マヨネーズ");
        System.out.println(hamburgerWithCheese);
        System.out.println(hamburgerWithCheeseAndSauce);

        HamburgerByConstructor hamburger3 = new HamburgerByConstructor("ビーフ", "小麦バン", "アメリカンチーズ", "マヨネーズ");

        HamburgerByJavaBeans hamburger4 = new HamburgerByJavaBeans();
        hamburger4.setMeetType("ビーフ");
        hamburger4.setBunType("麦バン");
        hamburger4.setCheese("アメリカンソース");
        hamburger4.setSaouce("マヨネーズ");
        System.out.println(hamburger4);
    }
}
