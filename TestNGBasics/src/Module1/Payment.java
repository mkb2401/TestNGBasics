package Module1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Payment {
  @Test(groups="reg")
  public void tc01pay() {
	  System.out.println("this is 1st test case of payment");
  }
  @Test(groups= {"smk","reg"})
  public void tc02pay() {
	  System.out.println("this is 2nd test case of payment");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Login payment");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Logout payment");
  }

}
