package week10;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "white", "beef & bacon", 14.54);
        super.addition1("Chips", 2.75);
        super.addition2("Drink", 1.81);
    }

    @Override
    public void addition1(String additionName, double additionPrice) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addition2(String additionName, double additionPrice) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addition3(String additionName, double additionPrice) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addition4(String additionName, double additionPrice) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}