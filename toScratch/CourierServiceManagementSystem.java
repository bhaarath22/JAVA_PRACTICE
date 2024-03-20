package toScratch;

import java.util.Scanner;

public class CourierServiceManagementSystem {

    public static void main(String[] args) {
        CourierServiceApp courierServiceApp = new CourierServiceApp();
        courierServiceApp.start();
    }
}

class CourierServiceApp {
    private Scanner scanner;
    private CourierService courierService;

    public CourierServiceApp() {
        scanner = new Scanner(System.in);
        courierService = new CourierService();
    }

    public void start() {
        int choice;
        do {
            displayMenu();
            choice = getUserChoice();

            switch (choice) {
                case 1:
                    // Redirect to product list when buying
                    courierService.viewProductList();
                    break;
                // ... other cases remain unchanged
            }

        } while (choice != 0);

        scanner.close();
    }

    private void displayMenu() {
        System.out.println("Courier Service Management System");
        System.out.println("1. Buy a Product");
        System.out.println("2. Return a Product");
        System.out.println("3. Payment Window");
        System.out.println("4. View Company Details");
        System.out.println("5. View Hub Rates");
        System.out.println("6. View Delivery Details");
        System.out.println("7. View Non-delivery Details");
        System.out.println("8. View Reviews");
        System.out.println("0. Exit");
    }

    private int getUserChoice() {
        int choice;
        while (true) {
            try {
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return choice;
    }
}

class CourierService {
    private Product[] products = new Product[5]; // Array to store products
    private Review[] reviews = new Review[10]; // Array to store reviews
    private int productCount = 5;
    private int reviewCount = 0;

    public CourierService() {
        // Initialize sample products
        products[0] = new Product("Product1", "Company1", 10.99, "Hub1");
        products[1] = new Product("Product2", "Company2", 20.99, "Hub2");
        products[2] = new Product("Product3", "Company3", 15.99, "Hub3");
        products[3] = new Product("Product4", "Company4", 25.99, "Hub4");
        products[4] = new Product("Product5", "Company5", 12.99, "Hub5");
    }

    public void viewProductList() {
        System.out.println("Available Products:");
        for (int i = 0; i < productCount; i++) {
            System.out.println((i + 1) + ". " + products[i].getName());
        }

        System.out.print("Enter the product number to view details: ");
        int productNumber = Integer.parseInt(new Scanner(System.in).nextLine());

        if (productNumber >= 1 && productNumber <= productCount) {
            viewProductDetails(products[productNumber - 1]);
        } else {
            System.out.println("Invalid product number.");
        }
    }

    public void viewProductDetails(Product product) {
        System.out.println("Product Details:");
        System.out.println("Name: " + product.getName());
        System.out.println("Company: " + product.getCompany());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Hub: " + product.getHub());

        // Offer additional options
        System.out.println("\n1. Buy this product");
        System.out.println("0. Back to main menu");

        int option = Integer.parseInt(new Scanner(System.in).nextLine());

        switch (option) {
            case 1:
                buyProduct(product);
                break;
            case 0:
                // Go back to the main menu
                break;
            default:
                System.out.println("Invalid option. Returning to the main menu.");
        }
    }

    public void buyProduct(Product product) {
        System.out.println("Buying product: " + product.getName());

        // Payment window
        System.out.println("Payment window...");
        System.out.print("Enter mode of payment: ");
        String paymentMode = new Scanner(System.in).nextLine();
        System.out.print("Enter delivery address: ");
        String deliveryAddress = new Scanner(System.in).nextLine();

        // Create a delivery and non-delivery entry
        DeliveryDetail deliveryDetail = new DeliveryDetail(product, paymentMode, deliveryAddress);
        NonDeliveryDetail nonDeliveryDetail = new NonDeliveryDetail(product);

        // Display delivery and non-delivery details
        System.out.println("Delivery Details:");
        System.out.println(deliveryDetail);
        System.out.println("\nNon-Delivery Details:");
        System.out.println(nonDeliveryDetail);

        // Offer the option to post a review
        System.out.print("Would you like to post a review? (y/n): ");
        String response = new Scanner(System.in).nextLine().toLowerCase();

        if (response.equals("y")) {
            System.out.print("Enter your review: ");
            String userReview = new Scanner(System.in).nextLine();
            addReview(new Review(product, userReview));
        }
    }

    public void addReview(Review review) {
        if (reviewCount < reviews.length) {
            reviews[reviewCount++] = review;
            System.out.println("Review added: " + review);
        } else {
            System.out.println("Review storage is full. Cannot add more reviews.");
        }
    }

    private void displayProducts() {
        System.out.println("Available Products:");
        for (int i = 0; i < productCount; i++) {
            System.out.println((i + 1) + ". " + products[i].getName());
        }
    }

    private void viewReviews() {
        System.out.println("Customer Reviews:");
        if (reviewCount == 0) {
            System.out.println("No reviews available.");
        } else {
            for (int i = 0; i < reviewCount; i++) {
                System.out.println((i + 1) + ". " + reviews[i]);
            }
        }
    }
}

class Product {
    private String name;
    private String company;
    private double price;
    private String hub;

    public Product(String name, String company, double price, String hub) {
        this.name = name;
        this.company = company;
        this.price = price;
        this.hub = hub;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public double getPrice() {
        return price;
    }

    public String getHub() {
        return hub;
    }
}

class Review {
    private Product product;
    private String userReview;

    public Review(Product product, String userReview) {
        this.product = product;
        this.userReview = userReview;
    }

    @Override
    public String toString() {
        return "Review for " + product.getName() + ": " + userReview;
    }
}

class DeliveryDetail {
    private Product product;
    private String paymentMode;
    private String deliveryAddress;

    public DeliveryDetail(Product product, String paymentMode, String deliveryAddress) {
        this.product = product;
        this.paymentMode = paymentMode;
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "Product: " + product.getName() +
                "\nPayment Mode: " + paymentMode +
                "\nDelivery Address: " + deliveryAddress;
    }
}

class NonDeliveryDetail {
    private Product product;

    public NonDeliveryDetail(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Product: " + product.getName() +
                "\nCompany: " + product.getCompany() +
                "\nHub: " + product.getHub();
    }
}