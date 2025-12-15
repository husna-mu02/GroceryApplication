package constant;

public class Constant {
	public static final String TESTDATAFILE = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata2.xlsx";
	public static final String CONFIGFILE = System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";
	
	public static final String LOGINCORRECTUSERNAMEANDPASSWORD = "Homepage is not displayed with valid credentials"; 
	public static final String LOGININVALIDPASSWORD = "Homepage is displayed with valid username and invalid password";
	public static final String LOGININVALIDUSERNAME = "Homepage is displayed with invalid username and password";
	public static final String LOGININVALIDUSERNAMEANDPASSWORD = "Homepage is displayed with invalid username and password";
	public static final String ADMINUSERSINFORMATIONERROR = "Admin users information remains unsaved with valid username and password ";
	public static final String LOGOUTFAILURE = "SignIn page is not displayed ";
	public static final String MANAGECATEGORYFAILURE = "The ‘Alert created successfully’ message is not displayed";
	public static final String MANAGECONTACTFAILURE = "The ‘Alert created successfully’ message is not displayed";
	public static final String FOOTERTEXTFAILURE = "The ‘Alert created successfully’ message is not displayed";
	public static final String MANAGENEWSFAILURE = "The ‘Alert created successfully’ message is not displayed";
	
}
