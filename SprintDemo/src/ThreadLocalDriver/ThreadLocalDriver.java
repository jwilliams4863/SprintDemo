package ThreadLocalDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ThreadLocalDriver {
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    private ChromeOptions options = new ChromeOptions();
     
    public synchronized void setTLDriver () {
    		options = OptionsMgr.getChromeOptions();
            tlDriver = ThreadLocal.withInitial(() -> new ChromeDriver(options));
    }
 
    public synchronized ThreadLocal<WebDriver> getTLDriver () {
        return tlDriver;
    }
}
 
