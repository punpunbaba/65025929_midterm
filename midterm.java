public class midterm {
  public static void main(String[] args) {
        Product chair = new Product("chair", 500.0);
        Electronics Television = new Electronics("Television", 20000.0, "SumSung", "Neo QLED");
        SmartPhone iphone = new SmartPhone("Iphone", 40000.0, "Apple", "Iphone99", "ios");
        Book OOP = new Book("OOP Programming", 250.0, "John Doe", 300);
        

        System.out.println("Product Name: " + chair.getName());
        System.out.println("Product Price: " + chair.getPrice());

        System.out.println("Product Name: " + Television.getName());
        System.out.println("Product Price: " + Television.getPrice());
        System.out.println("Brand: " + Television.getBrand());
        System.out.println("Model: " + Television.getModel());

        System.out.println("Product Name: " + iphone.getName());
        System.out.println("Product Price: " + iphone.getPrice());
        System.out.println("Brand: " + iphone.getBrand());
        System.out.println("Model: " + iphone.getModel());
        System.out.println("Operating System: " + iphone.getOperatingSystem());

        System.out.println("Product Name: " + OOP.getName());
        System.out.println("Product Price: " + OOP.getPrice());
        System.out.println("Author: " + OOP.getAuthor());
        System.out.println("Number of Pages: " + OOP.getNumberOfPages());
    }
}


class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class SmartPhone extends Electronics {
    private String operatingSystem;

    public SmartPhone(String name, double price, String brand, String model, String operatingSystem) {
        super(name, price, brand, model);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}

class Book extends Product {
    private String author;
    private int numberOfPages;

    public Book(String name, double price, String author, int numberOfPages) {
        super(name, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}

