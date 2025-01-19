package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public abstract class ExtentManager extends ProjectSpecification {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            String reportPath = "C:\\Users\\HOSUR PS\\Desktop\\ContactListApp_MiniProject2\\target\\TestReports.html";

            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);

            sparkReporter.config().setReportName("Test Automation Report");

            sparkReporter.config().setDocumentTitle("Automation Test Results");

            extent = new ExtentReports();

            extent.attachReporter(sparkReporter);

            extent.setSystemInfo("Tester", "Your Name");

            extent.setSystemInfo("Environment", "QA");

        }

        return extent;

    }

    }
