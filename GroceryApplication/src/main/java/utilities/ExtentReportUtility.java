package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {
	public static final ExtentReports extentReports = new ExtentReports();
	
	public synchronized static ExtentReports createExtentReports() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extend-reports/extend-report.html");
		reporter.config().setReportName("7R MART PROJECT");
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("organization", "obsqura");
		extentReports.setSystemInfo("name", "husna");
		return extentReports;
		
	}
}
