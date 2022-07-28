public class FactoryMethodApp {
    public static void main(String[] args) {

        System.out.println("Start Factory Method App!");
        System.out.println("********************\n");

        Store store = new GroceryStore();
        store.saleGood();

        StoreFactory storeFactory = new GroceryStoreFactory();
        Store storeGrocery = storeFactory.createStore();
        storeGrocery.saleGood();

        StoreFactory storeFactoryWear = new WearStoreFactory();
        Store storeWear = storeFactoryWear.createStore();
        storeWear.saleGood();

        StoreFactory storeFactory1 = new GroceryStoreFactory();
        Store store1 = storeFactory1.createStore();

        System.out.println("\n******************");
        System.out.println("Factory Method is Done!");


    }
}
