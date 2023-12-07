import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Open the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Maximise the Window Size
        driver.manage().window().maximize();

        // Visit the Amazon Website
        driver.get("https://www.amazon.in/ ");

        // Print The URL
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        // Print the Title of the Page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Delay for 2 sec
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // This the search bar
        WebElement SearchBar = driver.findElement(By.id("twotabsearchtextbox"));

        // We are sending Keys to Searchbar
        SearchBar.sendKeys("mobile");

        // Again Giving 2 seconds Wait
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on Search Button
        WebElement SearchButton = driver.findElement(By.id("nav-search-submit-button"));
        SearchButton.click();

        // Again 2 sec Wait
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Click on review 4+ rating option
        WebElement Rating = driver.findElement(By.xpath("//*[@id=\"p_72/1318476031\"]/span/a/section/i"));
        Rating.click();
        System.out.println("Selected 4 stars under customer review");

        // Again 2 sec Wait
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //click on range of 10,000 -20,000
        WebElement Range = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[5]/ul[1]/span[4]/li/span/a/span"));
        Range.click();
        System.out.println("Selected the price range between ₹10,000 - ₹20,000");

        // Again 2 sec Wait
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Click on First Mobile
        WebElement First_Mobile = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
        First_Mobile.click();


        // Now we need to Pass the control to this Window

        Set<String> s = driver.getWindowHandles () ;
        ArrayList<String> arr = new ArrayList<>(s);
        System.out.println(arr.get (0));
        System.out.println(arr.get (1)) ;
        driver.switchTo().window ( (String) arr.get (1));

        // Add the mobile to Cart
        WebElement Add_to_Cart = driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[35]/div[1]/span/span/span/input"));
        Add_to_Cart.click();

        // Again 10 sec Wait
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Go to cart Button
        WebElement Cart = driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"));
        Cart.click();

        // Again 5 sec Wait Until we quit the Browser
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }
}