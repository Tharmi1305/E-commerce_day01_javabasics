public class Main {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();
        store.addProduct("Apple", 1.0, 100);
        store.addProduct("Carrot", 0.5, 200);
        store.addProduct("Rice", 2.0, 50);

        System.out.println("\nAvailable Products:");
        store.displayProducts();
    }
}
