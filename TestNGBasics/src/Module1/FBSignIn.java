package Module1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class FBSignIn {
	WebDriver driver;
	@Test(dataProvider="dataP")
	public void f(String a,String b,String c,String d) {
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys(a);
		driver.findElement(By.id("pass")).sendKeys(b);
		driver.findElement(By.name("firstname")).sendKeys(c);
		driver.findElement(By.name("lastname")).sendKeys(d);
	}
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\total solutions\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@DataProvider
	public Object[][] dataP()
	{
		int r=3;
		int c=4;
		Object[][] a=new Object[r][c];
		
		a[0][0]="user1";
		a[0][1]="pass1";
		a[0][2]="Mandeep";
		a[0][3]="Kaur";
		a[1][0]="user2";
		a[1][1]="pass2";
		a[1][2]="name2";
		a[1][3]="lname2";
		a[2][0]="user3";
		a[2][1]="pass3";
		a[2][2]="name3";
		a[2][3]="lname3";
		
		return a;
	}
//	public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {   
//		 
//	    String[][] tabArray = null;
//	 
//	    try {
//	 
//	    FileInputStream ExcelFile = new FileInputStream(FilePath);
//	 
//	    // Access the required test data sheet
//	 
//	    ExcelWBook = new XSSFWorkbook(ExcelFile);
//	 
//	    ExcelWSheet = ExcelWBook.getSheet(SheetName);
//	 
//	    int startRow = 1;
//	 
//	    int startCol = 1;
//	 
//	    int ci,cj;
//	 
//	    int totalRows = ExcelWSheet.getLastRowNum();
//	 
//	    // you can write a function as well to get Column count
//	 
//	    int totalCols = 2;
//	 
//	    tabArray=new String[totalRows][totalCols];
//	 
//	    ci=0;
//	 
//	    for (int i=startRow;i<=totalRows;i++, ci++) {              
//	 
//	   cj=0;
//	 
//	    for (int j=startCol;j<=totalCols;j++, cj++){
//	 
//	    tabArray[ci][cj]=getCellData(i,j);
//	 
//	    System.out.println(tabArray[ci][cj]);  
	 
// }
	 
	// }
	 
	// }

	

	
}
