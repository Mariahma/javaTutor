import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutor {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chrome_webdriver_75v\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get("https://www.google.com");
    }
}
