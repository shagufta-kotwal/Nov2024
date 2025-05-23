package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager
{
   private static ExtentReports extent = new ExtentReports();
   private static String reportpath = System.getProperty("user.dir")+ "/Reports/ExtentReport.html";
   
   public static ExtentReports getInstance() {
	   ExtentSparkReporter spark = new ExtentSparkReporter(reportpath);
	   spark.config().setReportName("Automation Test report");
	   spark.config().setDocumentTitle("Test Results");
	   extent.attachReporter(spark);
	   return extent;
	   
   }
}
