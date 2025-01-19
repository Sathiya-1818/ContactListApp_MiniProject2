
import base.ExtentManager;
import base.ProjectSpecification;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.AddContact;
import page.HomePage;

public class TestSTest extends ProjectSpecification {

    ExtentReports extent;
    ExtentTest test;

    @BeforeTest
    public void setup() throws InterruptedException {
        extent = ExtentManager.getInstance();
    }


    @Test(priority = 1)
    public void contactSignUp() throws InterruptedException {
        test = extent.createTest("Signing Up", "Check whether the Signing Process is processing Successfully");
        HomePage SignUp = new HomePage(driver);
        SignUp.launchandLoad(URL);
        SignUp.contactSignUp()
                .contactFirstName()
                .contactLastName()
                .contactEmail("testing.com")
                .contactPassword("demo123")
                .contactSubmit();
        extent.flush();
    }

    @Test(priority = 2)
    public void contactAdd() throws InterruptedException {
        test = extent.createTest("Adding Contact", "Check whether the Adding Contact Process is processing Successfully");
        AddContact Contact = new page.AddContact(driver);
        Contact.contactAddbtn()
                .contactFirstName("Sathiya")
                .contactLastName("Priya")
                .contactDOB("1990-10-03")
                .contactEmail("testing.com")
                .contactPhone(325234560)
                .contactAdd1("2nd Main 1st cross street")
                .contactAdd2("Guindy")
                .contactCity("Chennai")
                .contactState("TN")
                .contactPostalCode("600098")
                .contactCountry("India")
                .contactSubmit();
        Contact.contactAddbtn()
                .contactFirstName("Praba")
                .contactLastName("karan")
                .contactDOB("1992-08-12")
                .contactEmail("testing.com")
                .contactPhone(346527689)
                .contactAdd1("1st cross street")
                .contactAdd2("Adyar")
                .contactCity("Chennai")
                .contactState("TN")
                .contactPostalCode("600038")
                .contactCountry("India")
                .contactSubmit();
        Contact.contactAddbtn()
                .contactFirstName("BMP")
                .contactLastName("Murugaperumal")
                .contactDOB("1987-07-04")
                .contactEmail("testing.com")
                .contactPhone(15476790)
                .contactAdd1("Gandhi street")
                .contactAdd2("Chrompet")
                .contactCity("Chennai")
                .contactState("TN")
                .contactPostalCode("600091")
                .contactCountry("India")
                .contactSubmit();
        Contact.contactAddbtn()
                .contactFirstName("Varadha")
                .contactLastName("Rajan")
                .contactDOB("1988-02-15")
                .contactEmail("testing.com")
                .contactPhone(174645643)
                .contactAdd1("4th Main 2nd cross street")
                .contactAdd2("Adyar")
                .contactCity("Chennai")
                .contactState("TN")
                .contactPostalCode("600056")
                .contactCountry("India")
                .contactSubmit();
        Contact.contactAddbtn()
                .contactFirstName("Arun")
                .contactLastName("Kumar")
                .contactDOB("1996-05-20")
                .contactEmail("testing.com")
                .contactPhone(1268517890)
                .contactAdd1("Vivekanadha street")
                .contactAdd2("Velachery")
                .contactCity("Chennai")
                .contactState("TN")
                .contactPostalCode("600055")
                .contactCountry("India")
                .contactSubmit()
                .contactOrderVerify();
        extent.flush();
    }

    @Test(priority = 3)
    public void contactEdit() throws InterruptedException {
        test = extent.createTest("Editing Contact", "Check whether the Editing Contact Process is processing Successfully");
        AddContact Contact = new page.AddContact(driver);
        Contact.contactOpen()
                .contactEdit()
                .contactEditFirstName("Arun New")
                .contactSubmit()
                .contactReturn()
                .contactEditVerify();
        extent.flush();

    }

    @Test(priority = 4)
    public void contactDelete() throws InterruptedException {
        test = extent.createTest("Deleting Contact", "Check whether the Deleting Contact Process is processing Successfully");
        AddContact Contact = new page.AddContact(driver);
        Contact.contactOpen2()
                .contactDelete()
                .contactDeleteok();
        extent.flush();
    }

    @Test(priority = 5)
    public void contactLogout() throws InterruptedException {
        test = extent.createTest("Loggout Out from Login Page", "Check whether the logging out Process is processing Successfully");
        AddContact AddContact = new page.AddContact(driver);
        AddContact.Logout()
                .contactLoginScreen()
                .closeBrowser();
    }
}


