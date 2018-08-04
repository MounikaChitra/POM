package Week2Day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcLogin {

	public static void main(String[] args) throws InterruptedException {

		// lunch chrome driver

		System.setProperty("webdriver.chrome.driver", "C:\\Testleaf\\Selenium\\Softwares\\drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		//to maximize the screen

		driver.manage().window().maximize();

		//user id and password

		driver.findElementById("userRegistrationForm:userName").sendKeys("mounika");;
		driver.findElementById("userRegistrationForm:password").sendKeys("mOUNIK@123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("mOUNIK@123");

		//drop down selection for security question

		WebElement source=driver.findElementById("userRegistrationForm:securityQ");
		Select dd = new Select(source);
		dd.selectByIndex(5);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("ZPHS");

		//personal info first name middle name and last name

		driver.findElementById("userRegistrationForm:firstName").sendKeys("Mounika");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Chitra");

		//gender radio button
		//first check whether radio button is displayed or not
		//second check radio button id enabled or not
		//third check radio button is already checked or not
		//if not checked click on that finally
		//for is displayed?
		WebElement	female_radio_button = driver.findElementById("userRegistrationForm:gender:1");
		boolean Status=female_radio_button.isDisplayed();
		System.out.println("female radio button is diaplyed"+Status);
		//is enabled?
		boolean enabled_status=female_radio_button.isEnabled();
		System.out.println("Female radio button is enabled"+enabled_status);
		//is selected?
		boolean selected_status=female_radio_button.isSelected();
		System.out.println("female button is selected"+selected_status);
		//select female radio button
		female_radio_button.click();
		boolean selected_status_new=female_radio_button.isSelected();
		System.out.println("female radio button is selcted"+selected_status_new);


		//Marital Status radio button
		//first check whether radio button is displayed or not
		//second check radio button id enabled or not
		//third check radio button is already checked or not
		//if not checked click on that finally
		//for is displayed?
		WebElement	Marital_status_radio_button = driver.findElementById("userRegistrationForm:maritalStatus:1");
		boolean mariral_Status=Marital_status_radio_button.isDisplayed();
		System.out.println("female radio button is diaplyed"+mariral_Status);
		//is enabled?
		boolean marital_enabled_status=Marital_status_radio_button.isEnabled();
		System.out.println("Female radio button is enabled"+marital_enabled_status);
		//is selected?
		boolean marital_selected_status=Marital_status_radio_button.isSelected();
		System.out.println("female button is selected"+marital_selected_status);
		//select marital status radio button
		Marital_status_radio_button.click();
		boolean marital_selected_status_new=female_radio_button.isSelected();
		System.out.println("female radio button is selcted"+marital_selected_status_new);


		//date of birth selection

		WebElement source1=driver.findElementById("userRegistrationForm:dobDay");
		Select dd1 = new Select(source1);
		dd1.selectByIndex(21);
		WebElement source2=driver.findElementById("userRegistrationForm:dobMonth");
		Select dd2 = new Select(source2);
		dd2.selectByIndex(4);
		WebElement source21=driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dd21 = new Select(source21);
		dd21.selectByIndex(6);

		//Occupation

		WebElement source3=driver.findElementById("userRegistrationForm:occupation");
		Select dd3 = new Select(source3);
		dd3.selectByIndex(3);

		//country

		WebElement source4=driver.findElementById("userRegistrationForm:countries");
		Select dd4 = new Select(source4);
	List<WebElement> countryList=dd4.getOptions();
	int count=0;
	for(WebElement eachCountry:countryList)
		if(eachCountry.getText().startsWith("E"))
		{
			count++;
			if(count==2)
			{
				System.out.println(eachCountry.getText());
				break;

		// email

		driver.findElementById("userRegistrationForm:email").sendKeys("mounikachitra456@gmail.com");


		//ISD Mobile

		driver.findElementById("userRegistrationForm:mobile").sendKeys("9966289705");

		//nationality

		WebElement source41=driver.findElementById("userRegistrationForm:nationalityId");
		Select dd41 = new Select(source41);
		dd41.selectByIndex(1);

		//Residential Address

		driver.findElementById("userRegistrationForm:address").sendKeys("7B");
		driver.findElementById("userRegistrationForm:street").sendKeys("jayalakshmi appartments");
		driver.findElementById("userRegistrationForm:area").sendKeys("mugalivakkam");

		//pincode
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600012",Keys.TAB);

		//state will display automatically once pincode enetered

		Thread.sleep(30000);

		//city or town
		WebElement source6=driver.findElementById("userRegistrationForm:cityName");
		Select dd6=new Select(source6);
		dd6.selectByIndex(1);
		Thread.sleep(30000);


		//post office
		WebElement source7=driver.findElementById("userRegistrationForm:postofficeName");
		Select dd7=new Select(source7);
		dd7.selectByIndex(2);

		//phone number
		driver.findElementById("userRegistrationForm:landline").sendKeys("9966289705");
	}

}
}
}