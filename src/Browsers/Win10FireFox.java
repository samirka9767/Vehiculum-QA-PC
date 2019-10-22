package Browsers;

import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Samira ~  10/21/2019 /  9:53 PM
 */
public class Win10FireFox {

    public static DesiredCapabilities caps;
    public static String name = "";

    public static DesiredCapabilities win10FF70() {
        caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "70.0 beta");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.5.2");
        name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities win10FF69() {
        caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "69.0");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.10.0");
        name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities win10FF68() {
        caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "68.0");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.10.0");
        name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities win10FF50() {
        caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "50.0");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.10.0");
        name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
        return caps;
    }

    public static DesiredCapabilities win10FF32() {
        caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "32.0");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.10.0");
        name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
        return caps;
    }
}
