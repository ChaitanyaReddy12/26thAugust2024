package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Execution {

	public static void main(String[] args) {
		
		//interface objectname = new classname();

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
	}

}
