package week8;
public class Ex12 {
    public static void main(String[] args) {
        Storehouse store = new Storehouse();
        store.addProduct("buttermilk", 2, 20);
        store.addProduct("jogurt", 2, 20);
        store.addProduct("coffee", 5, 1);
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 6);

        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));

        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take sugar " + store.take("sugar"));

        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));
        System.out.println("products:");
        for (String product : store.products()) {
            System.out.println(product);
        }
    }
}