package pages.Appium;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;
public class C03 {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        //eger appActivity ve appPackage kullanacaksaniz app path gerekli degil
        // desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\ONURENESCELIK\\IdeaProjects\\mobileTesting\\src\\test\\java\\pages\\App\\apiDemos.apk");
        //app acilirken izin istediginde appActivity ve appPackage tanimlayarak bu sorunu gecebilirsiniz.
        // app telefonda acin
        //terminal veya CMD prompt acarak adb shell  yazin
        //sonra dumpsys window | grep -E "mCurrentFocus" komutunu girice appActivity ve appPackage bilgilerini ulasabilirsiniz
     //   desiredCapabilities.setCapability("appPackage", "com.touchboarder.android.api.demos");
     //   desiredCapabilities.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");
//http://localhost:4723/wd/hub

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(4000);
    }
}
