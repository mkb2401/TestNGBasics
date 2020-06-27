package Module1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Email {
	@BeforeTest
	public void launchEmail()
	{
		System.out.println("launch");
	}
	
	@AfterTest
	public void closeEmail()
	{
		System.out.println("closing");
	}
	@BeforeClass
	public void beforeTest()
	{
		System.out.println("before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void loginEmail()
	{
		System.out.println("Login email");
	}
	
	@AfterMethod
	public void logoutEmail()
	{
		System.out.println("logout email");
	}
	
  @Test(groups="smk")
  public void tc02email() {
	  System.out.println("This is 2nd test case of email");
 }
  @Test(groups="reg")
  public void tc01email() {
	  //int a=10/0;
	  System.out.println("This is 1st test case of email");
 }
  @Test(groups= {"reg","smk"})
  public void tc03email() {
	  
	  System.out.println("This is 3rd test case of email");
 }
}
