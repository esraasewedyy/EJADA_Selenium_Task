package EjadaPages.module2;
import org.openqa.selenium.WebElement;

// Product class to store product information
class Product {
    private String name;
    private double price;
    private WebElement addToCartButton;

    public Product(String name, double price, WebElement addToCartButton) {
        this.name = name;
        this.price = price;
        this.addToCartButton = addToCartButton;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }
}

