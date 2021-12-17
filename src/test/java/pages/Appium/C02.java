package pages.Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.android.CalculatorPages;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;

public class C02 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
Driver.getAppiumDriver();
       DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//
//        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
//        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
//        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\ONURENESCELIK\\IdeaProjects\\mobileTesting\\src\\test\\java\\pages\\App\\Calculator.apk");
//        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,"true");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        //http://chromedriver.chromium.org/download      bu linkten chrome versiyin builgisine ulasiyoruz
        //https://chromedriver.storage.googleapis.com/index.html  bu linkten butun versiyonlara ulasiyoruz
        /*
        eger telefon kullanmak istiyorsaniz developer options aktif hale getirilmeli ve USB Debugging acik olmali
        USB vasitasiyla gercek telefonlardada test yapabilirsiniz.
         */
//      Activity Startup

//      https://appium.io/docs/en/writing-running-appium/android/activity-startup/

//      Appium needs to know package and activity names in order to properly initialize the application under test.
//      This information is expected to be provided in driver capabilities and consists of the following keys:

//      appActivity: The name of the main application activity
//      appPackage: The identifier of the application package

//      How to access to an application's appActivity and appPackage
//      1-Open the applications on the device
//      2-Open command prompt
//      3-Type adb shell and press ENTER
//      4-Type dumpsys window | grep -E "mCurrentFocus" and press ENTER
//      5-First section is for appPackage, the second section is for appActivity

//      If we do not set these capabilities we have to continue manually. If we do not continue manually we get the error: POST /wd/hub/session 500 29981 ms - 1865

      //  desiredCapabilities.setCapability("appPackage","com.davemac327.gesture.tool");
      //  desiredCapabilities.setCapability("appActivity","com.davemac327.gesture.tool.GestureBuilderActivity");

//      After setting these capabilities, we get the confirmation message even though we do not continue manually: POST /wd/hub/session 200 5563 ms - 1287
//
//        URL url = new URL("http://127.0.0.1:4723/wd/hub");
//
//        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
//
//        Thread.sleep(3000);
//       CalculatorPages calculator=new CalculatorPages();
//        calculator.oneNumber.click();

//       MobileElement a= (MobileElement) Driver.getAppiumDriver().findElementById("com.google.android.calculator:id/digit_1");
//        a.click();

    }
}
