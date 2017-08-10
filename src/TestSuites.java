import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//madhu
public class TestSuites {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchTerm")).sendKeys("puma");
        driver.findElement(By.className("argos-header__search-button")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String actual = driver.findElement(By.xpath("//div[@class='search']/div/div[2]/div/h1")).getText();
        Assert.assertEquals("Puma",actual);
         driver.close();
    }
}
