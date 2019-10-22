package Browsers;

import org.openqa.selenium.remote.DesiredCapabilities;


public class Win10IE_Edge {
     public static DesiredCapabilities caps;
     public static String name ="";

      public static DesiredCapabilities win10IE11() {
        caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "IE");
        caps.setCapability("browser_version", "11.0");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.5.2");
        name = " "+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
        return caps;
    }
      public static DesiredCapabilities win10IEInsiderPreeview() {
        caps = new DesiredCapabilities();
          caps.setCapability("os", "Windows");
          caps.setCapability("os_version", "10");
          caps.setCapability("browser", "Edge");
          caps.setCapability("browser_version", "insider preview");
          caps.setCapability("browserstack.local", "false");
          caps.setCapability("browserstack.selenium_version", "3.10.0");
          name = " "+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
        return caps;
    }
      public static DesiredCapabilities win10IE18() {
        caps = new DesiredCapabilities();
          caps.setCapability("os", "Windows");
          caps.setCapability("os_version", "10");
          caps.setCapability("browser", "Edge");
          caps.setCapability("browser_version", "18.0");
          caps.setCapability("browserstack.local", "false");
          caps.setCapability("browserstack.selenium_version", "3.10.0");
          name = " "+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
        return caps;
    }
      public static DesiredCapabilities win10IE15() {
        caps = new DesiredCapabilities();
          caps.setCapability("os", "Windows");
          caps.setCapability("os_version", "10");
          caps.setCapability("browser", "Edge");
          caps.setCapability("browser_version", "15.0");
          caps.setCapability("browserstack.local", "false");
          caps.setCapability("browserstack.selenium_version", "3.10.0");
          name = " "+caps.getCapability("os")+caps.getCapability("os_version")+" - "+caps.getCapability("browser")+caps.getCapability("browser_version");
        return caps;
    }
}
