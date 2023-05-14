package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Przchodzenie_pomedzy_stronami {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // Tworzymy objekt drivara - wybieramy przyglądarke
        driver.manage().window().maximize(); // maksymalizacja okna przeglądarki
        driver.get("https://coderslab.pl/pl"); // wpisujemy adres strony w przeglądarkę
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        //WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb")); //wyszukanie elementu "Zaakceptuj wszystko" na stronie google
        //acceptCookiesButton.click(); // Klikamy w przycisk "Zaakceptuj wszystko"
        //WebElement element = driver.findElement(By.name("q")); //wyszukiwanie elementu "Search bar"
        //element.clear(); //Usuwanie treści z pula "Search bar"
        //element.sendKeys("Где находится бурятия"); //przesyłamy napis "Coderlab" do search bara
        //element.submit(); //akceptujemy formularz, wyszukujemy hasło w Google
        Thread.sleep(5000);
        //driver.quit();

    }
}
