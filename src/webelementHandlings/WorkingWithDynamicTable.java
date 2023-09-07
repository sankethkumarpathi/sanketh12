package webelementHandlings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDynamicTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/webtable-example");

		WebElement table = driver.findElement(By.xpath("//table[@class='tg']"));
		// no of rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("the total no.of rows =" + rows.size());

		System.out.println("---------------------");
		// no of heads
		List<WebElement> heads = table.findElements(By.tagName("th"));
		System.out.println("No of heads=" + heads.size());
		for (WebElement head : heads) {
			System.out.println(head.getText());

			System.out.println("-------------------");

			List<WebElement> cols = table.findElements(By.tagName("td"));
			System.out.println(("No of cols =" + cols.size()));
			for (WebElement col : cols) {

				System.out.println(col.getText());

			}
			System.out.println("----------------------");

			for (int n = 1; n < rows.size(); n++) {

				List<WebElement> col = rows.get(n).findElements(By.tagName("td"));
				System.out.println(n + " " + "row cols are = " + col.size());

			}

			System.out.println("---------------------");

			for (int i = 1; i < rows.size(); i++) {
				List<WebElement> col = rows.get(i).findElements(By.tagName("td"));

				for (int j = 0; j < col.size(); j++) {
					System.out.print(col.get(j).getText() + " | ");

					if (i == 3 && j == 2) {
						col.get(j).findElement(By.tagName("input")).click();

					}

					if (i == 4 && j == 3) {
						col.get(j).findElement(By.tagName("input")).click();

					}

					 if (i == 2 && j == 4) {
						WebElement ele = col.get(j).findElement(By.tagName("select"));

						Select select = new Select(ele);
						select.selectByVisibleText("Sports");

					}

					 if (i == 1 && j == 5) {
						col.get(j).findElement(By.tagName("input")).sendKeys("good");

					}
				}

				System.out.println();
			}
		}
	}
}
