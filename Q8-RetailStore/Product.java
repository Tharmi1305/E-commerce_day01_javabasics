/*8) implement classes for the given scenario:
	- A reatail store which can store,edit,and delete 
multible products like fruits, vegetables, grocery, etc..
	- display the avilabe products like price, name, 
	quantity */
	

    class Product {
        String name;
        double price;
        int quantity;
    
        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    
        public String toString() {
            return name + " - $" + price + " - " + quantity + " in stock";
        }
    }