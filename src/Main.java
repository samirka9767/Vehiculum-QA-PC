import Browsers.Win10Chrome;
import Browsers.Win10FireFox;
import Browsers.Win10IE_Edge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class Main {

    public static final String USERNAME = "samirahuseyn1";
    public static final String AUTOMATE_KEY = "zKCM4E7vz37RmFGF2UKS";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {

        TestCases OSBrowserTest = new TestCases();

        //TestCase: business, brand= audi, design = cabrio, budget = 500, Win 10, FireFox
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10FireFox.win10FF70()), Win10FireFox.name);

     //   OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10FireFox.win10FF70()), Win10FireFox.name);
       /* OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10FireFox.win10FF69()), Win10FireFox.name);
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10FireFox.win10FF68()), Win10FireFox.name);


        //TestCase: business, brand= audi, design = cabrio, budget = 500, Win 10, Chrome
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10Chrome.win10Chrm78()), Win10Chrome.name);
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10Chrome.win10Chrm77()), Win10Chrome.name);
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10Chrome.win10Chrm76()), Win10Chrome.name);
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10Chrome.win10Chrm75()), Win10Chrome.name);
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10Chrome.win10Chrm74()), Win10Chrome.name);
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10Chrome.win10Chrm73()), Win10Chrome.name);
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10Chrome.win10Chrm72()), Win10Chrome.name);
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10Chrome.win10Chrm62()), Win10Chrome.name);
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10Chrome.win10Chrm58()), Win10Chrome.name);


        //TestCase: business, brand= audi, design = cabrio, budget = 500, Win 10, Edge/IE
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10IE_Edge.win10IE11()), Win10IE_Edge.name);
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10IE_Edge.win10IEInsiderPreeview()), Win10IE_Edge.name);
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10IE_Edge.win10IE18()), Win10IE_Edge.name);
        OSBrowserTest.tc_audi_cabrio_500(newWebDriver(Win10IE_Edge.win10IE15()), Win10IE_Edge.name);


//----------------------------------Second Test Case-----------------------------------------------------------

        //TestCase:  brand= audi,bmw design = van/bus, budget = 1000, Win 10, FireFox
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10FireFox.win10FF70()), Win10FireFox.name);
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10FireFox.win10FF69()), Win10FireFox.name);
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10FireFox.win10FF68()), Win10FireFox.name);


        //TestCase: brand= audi,bmw design = van/bus, budget = 1000, Win 10, Chrome
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10Chrome.win10Chrm78()), Win10Chrome.name);
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10Chrome.win10Chrm77()), Win10Chrome.name);
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10Chrome.win10Chrm76()), Win10Chrome.name);
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10Chrome.win10Chrm75()), Win10Chrome.name);
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10Chrome.win10Chrm74()), Win10Chrome.name);
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10Chrome.win10Chrm73()), Win10Chrome.name);
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10Chrome.win10Chrm72()), Win10Chrome.name);
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10Chrome.win10Chrm62()), Win10Chrome.name);
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10Chrome.win10Chrm58()), Win10Chrome.name);


        //TestCase: brand= audi,bmw design = van/bus, budget = 1000, Win 10, Edge/IE
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10IE_Edge.win10IE11()), Win10IE_Edge.name);
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10IE_Edge.win10IEInsiderPreeview()), Win10IE_Edge.name);
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10IE_Edge.win10IE18()), Win10IE_Edge.name);
        OSBrowserTest.tc_audi_bmw_van_budget_1000(newWebDriver(Win10IE_Edge.win10IE15()), Win10IE_Edge.name);*/
    }

    public static WebDriver newWebDriver(DesiredCapabilities OSBrowser) throws MalformedURLException {
        return new RemoteWebDriver(new java.net.URL(URL), OSBrowser);
    }
}
