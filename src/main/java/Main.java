public class Main {
    public static void main(String[] args) {
        HamburgerByBuilder hamburger1 =
                new HamburgerByBuilder.Builder("Beef", "White Bun")
                .cheese("Swiss")
                .saouce("Ketchup")
                .build();
        System.out.println(hamburger1);

        HamburgerByStaticFactory hamburger2 = HamburgerByStaticFactory.changeCheese("Chicken", "Baguette","Gouda");
        System.out.println(hamburger2);

        HamburgerByConstructor hamburger3 = new HamburgerByConstructor("Beef", "White Bun", "American", "Mayonnaise");

        HamburgerByJavaBeans hamburger4 = new HamburgerByJavaBeans();
        hamburger4.setMeetType("Beef");
        hamburger4.setBunType("White Bun");
        hamburger4.setCheese("American");
        hamburger4.setSaouce("Mayonnaise");
        System.out.println(hamburger4);

    }

}
