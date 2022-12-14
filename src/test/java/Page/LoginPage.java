package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{
	@FindBy(id="usernameOrEmail")
	public static WebElement Username;
	@FindBy(id="password")
	public static WebElement Password;
	@FindBy(id="mui-1")
	public static WebElement LoginButton;
}