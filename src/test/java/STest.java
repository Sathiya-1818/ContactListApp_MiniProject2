import base.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.*;

public class STest {
    ExtentReports extent;
    ExtentTest test;

    @BeforeClass
    public void setUp()  {
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void beforeTestMethod() {
        test = extent.createTest("Testng Test");
    }

    @Test
    public void testExample() {
        test.info("Test execution started");
        Assert.assertTrue(true, "Condition is true");
        test.pass("Test passed successfully");
    }

    @AfterMethod
    public void afterTestMethod() {
        extent.flush();
    }

    @AfterClass
    public void tearDown() {
        // Additional cleanup, if necessary
    }
}
