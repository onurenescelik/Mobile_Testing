package pages.Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class C04WebKontrol {



    //https://developer.chrome.com/docs/devtools/remote-debugging/ bu siteden
    //chrome://inspect#devices   -> bu adres alinir ve yeni sekmede acilir burada chrome olan kisma url girilir
    //ardindan webde yaptgimiz hareketler telefona isler


    @Test
    public void test() throws InterruptedException, MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");

        //http://chromedriver.chromium.org/download      bu linkten chrome versiyin builgisine ulasiyoruz
        //https://chromedriver.storage.googleapis.com/index.html  bu linkten butun versiyonlara ulasiyoruz
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        desiredCapabilities.setCapability("chromedriverExecutable","/Users/ayyildiz/IdeaProjects/AppiumTurkish/driver/chromedriver");

        //noReset
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
//http://localhost:4723/wd/hub
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
         /*
         Calisma:
         “https://amazon.com" git
         sign in tikla
         Verify “Welcome” text from sign in page 
          */
        Thread.sleep(4000);
        driver.get("https://www.amazon.com/");
        System.out.println("1 "+driver.getContext());//CHROMIUM
        //remote device on chrome  https://developer.chrome.com/docs/devtools/remote-debugging/
        //chrome://inspect#devices  on chrome browser
//getContextHandles() mevcut olab app turlerini Set konteynira ekliyoruz

        Set contextNames = driver.getContextHandles();
        //burda mevcut app tururnu(context) bir bir yazdiriyoruz
        for (Object contextName : contextNames) {
            System.out.println(contextName);//NATIVE_APP   CHROMIUM
            Thread.sleep(3000);
            if (contextName.toString().contains("CHROMIUM")){
                //alttaki kodda hangi app turunde calisacaksak onu set ediyoruz
                driver.context((String) contextName);//WEBAPP DEVAM EDECEGIM
                Thread.sleep(10000);
            }
        }
        //artik set ettigimiz context ile test devam ediyiruz.
        System.out.println("2 "+driver.getContext());//2 CHROMIUM
        driver.findElementByXPath("//a[@class='nav-a nav-show-sign-in']").click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElementByXPath("//h2").isDisplayed());


        System.out.println("3 "+driver.getContext());//CHROMIUM
        driver.quit();

    }

}
