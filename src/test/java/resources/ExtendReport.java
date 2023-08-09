package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport {
	
	
	public static ExtentReports Extendreport()
	{
		
		String path = System.getProperty("user.dir")+"\\repo\\index1"+System.currentTimeMillis()+".html";
	
	//String path = System.getProperty("C:\\Users\\Rahul Patekar\\eclipse-workspace\\Amazon")+"\\report\\index4.html";
	ExtentSparkReporter report = new ExtentSparkReporter(path);
	
	report.config().setDocumentTitle("Test result");
	report.config().setReportName("testcase1");
	
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(report);
	extent.setSystemInfo("DayshiftTester", "Ram");
	extent.createTest(path);
	return extent;
	
	
	
}

	

}
