package practice_package;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.security.cert.Certificate;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkTest {
	@Test
	public void getLink() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		 List<WebElement> alllinks = driver.findElements(By.xpath("//section[@class='partners']/descendant::a"));
		for(WebElement ele:alllinks) {
			String link = ele.getAttribute("href");
			URL url=new URL(link);
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			conn.setRequestMethod("HEAD");
			int code = conn.getResponseCode();
			System.out.println(url +"  "+code);
	}
	}
}
