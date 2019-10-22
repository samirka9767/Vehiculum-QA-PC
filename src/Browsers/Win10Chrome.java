package Browsers;

import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Samira ~  10/21/2019 /  9:46 PM
 */
public class Win10Chrome {

        public static DesiredCapabilities caps;
        public static String name ="";

        public static DesiredCapabilities win10Chrm78() {
            caps = new DesiredCapabilities();
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "78.0 beta");
            caps.setCapability("browserstack.selenium_version", "3.5.2");
            name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
            return caps;
        }

        public static DesiredCapabilities win10Chrm77() {
            caps = new DesiredCapabilities();
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "77.0");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "3.5.2");
            name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
            return caps;
        }
        public static DesiredCapabilities win10Chrm76() {
            caps = new DesiredCapabilities();
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "76.0");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "3.5.2");
            name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
            return caps;
        }

        public static DesiredCapabilities win10Chrm75() {
            caps = new DesiredCapabilities();
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "75.0");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "3.5.2");
            name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
            return caps;
        }

        public static DesiredCapabilities win10Chrm74() {
            caps = new DesiredCapabilities();
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "74.0");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "3.5.2");
            name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
            return caps;
        }

        public static DesiredCapabilities win10Chrm73() {
            caps = new DesiredCapabilities();
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "73.0");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "3.5.2");
            name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
            return caps;
        }
        public static DesiredCapabilities win10Chrm72() {
            caps = new DesiredCapabilities();
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "72.0");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "3.5.2");
            name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
            return caps;
        }

        public static DesiredCapabilities win10Chrm62() {
            caps = new DesiredCapabilities();
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "62.0");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("resolution", "1024x768");
            caps.setCapability("name", "Bstack-[Java] Sample Test");
            name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
            return caps;
        }
        public static DesiredCapabilities win10Chrm58() {
            caps = new DesiredCapabilities();
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "58.0");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "3.5.2");
            name =   ""+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
            return caps;
        }


}
