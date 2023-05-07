package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class1 {
	
public static WebDriver driver;
	
	public static WebDriver browser_launch(String a) {
		if(a.equals("chrome")) {
		
			System.setProperty("webdriver.chrome.driver","F:\\Siva\\eclipse\\Selenium_Project\\Driver\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("incognito");
			driver=new ChromeDriver(options);
			
		}else if(a.equals("edge")){
		
			System.setProperty("webdriver.edge.driver", "F:\\Siva\\eclipse\\Selenium_Project\\Driver\\msedgedriver.exe");
			EdgeOptions options=new EdgeOptions();
			options.addArguments("Inprivate");
			driver=new EdgeDriver(options);
		
		
		}
		return driver;
		
}
	
	public static void url(WebDriver d,String url) {
		d.get(url);
	}
	public static void currenturl(WebDriver d) {
		String current_Url = d.getCurrentUrl();
		System.out.println(current_Url);
		

	}
	public static  void title(WebDriver d) {
		String titlename = d.getTitle();
		System.out.println(titlename);

	}
	public static void pagesource(WebDriver d) {
		String page_source = d.getPageSource();
		System.out.println(page_source);

	}
	public static  void close(WebDriver d) {
		d.close();

	}
	public static void quit(WebDriver d) {
		d.quit();
	}
	public static void navigate_to(WebDriver d,String url) {
		d.navigate().to(url);

	}
	public static void navigate_back(WebDriver d) {
		d.navigate().back();

	}
	public static void navigate_forward(WebDriver d) {
		d.navigate().forward();

	}
	public static void navigate_refresh(WebDriver d) {
		d.navigate().refresh();

	}
	public static void window_maximize(WebDriver d) {
		d.manage().window().maximize();
	}
	public static void window_minimize(WebDriver d) {
		d.manage().window().minimize();
	}
	public static void window_fulscreen(WebDriver d) {
		d.manage().window().fullscreen();
	}
	public static void window_set_size(WebDriver d) {
		Dimension di=new Dimension(700,900);
		d.manage().window().setSize(di);
	}
	public static void window_get_size(WebDriver d) {
		Dimension size = d.manage().window().getSize();
		System.out.println(size);
		
	}
	public static void deletecookies(WebDriver d) {
		d.manage().deleteAllCookies();
	}
	////////// WebElement Methods///////////////////
	
	public static void click(WebElement element) {
		element.click();

	}
	public static void sendkeys(WebElement element,String value) {
		element.sendKeys(value);

	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void get_text(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}
	public static void isdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	public static void isenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	public static void isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);

	}
	public static void attribute_value(WebElement element,String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
		

	}
	public static void tag_name(WebElement element) {
		String tagname = element.getTagName();
		System.out.println(tagname);
	}
	public static void location(WebElement element) {
		Point location1 = element.getLocation();
		System.out.println(location1);
	}
	public static void get_size(WebElement element) {
		Dimension size = element.getSize();
		System.out.println(size);
	}
	public static void css_value(WebElement element,String value) {
		String cssValue = element.getCssValue(value);
		System.out.println(cssValue);
	}
	
	/////////Select Class Methods//////////////////
	
	public static void select_ismultiple(WebElement element) {
		Select s=new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	public static void select_getoptions(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement values : options) {
			System.out.println(values);
			
		}
		
	}
	public static void select_index(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public static void select_value(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public static void select_visible_text(WebElement element,String visbletext) {
		Select s=new Select(element);
		s.selectByVisibleText(visbletext);
	}
	public static void deselect_index(WebElement element,int index) {
		Select s=new Select(element);
		s.deselectByIndex(index);
	}
	public static void deselect_value(WebElement element,String value) {
		Select s=new Select(element);
		s.deselectByValue(value);
	}
	public static void deselect_visible_text(WebElement element,String value) {
		Select s=new Select(element);
		s.deselectByVisibleText(value);
	}
	public static void deselectall(WebElement element) {
		Select s=new Select(element);
		s.deselectAll();
	}

	public static void get_all_selected(WebElement element) {
		Select s=new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement values : allSelectedOptions) {
			System.out.println(values);
			
		}
	}

	public static void first_selected(WebElement element) {
		Select s=new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
	}
	////////////////Alert/////////////////////////

	public static void alert_accept(WebDriver d) {
		Alert simplealert = d.switchTo().alert();
		simplealert.accept();
		
	}
	public static void alert_dismiss(WebDriver d) {
		Alert simplealert = d.switchTo().alert();
		simplealert.dismiss();
		
	}
	public static void alert_gettext(WebDriver d) {
		Alert simplealert = d.switchTo().alert();
		String text = simplealert.getText();
		System.out.println(text);
		
	}
	
	public static void alert_sendkeys(WebDriver d,String value) {
		Alert simplealert = d.switchTo().alert();
		simplealert.sendKeys(value);
	
	}
	
	//////////////Frame////////////////

	public static void frame_index(WebDriver d,int index) {
		d.switchTo().frame(index);
	
	}
	public static void frame_String_nameorid(WebDriver d,String nameorid) {
		d.switchTo().frame(nameorid);

	}
	public static void frame_webelement(WebDriver d,WebElement element) {
		d.switchTo().frame(element);

	}
	public static void frame_defalt_content(WebDriver d) {
		d.switchTo().defaultContent();

	}
	public static void frame_parentframe(WebDriver d) {
		d.switchTo().parentFrame();

	}
	
	//////////// javaSriptexecutor////////
	
	public static void js_click(WebDriver d,WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor) d;
		js.executeScript("arguments[0].click()", element);

	}
	public static void js_sendkeys(WebDriver d,String val,WebElement element) {
		
		JavascriptExecutor js= (JavascriptExecutor) d;
		js.executeScript(val, element);
		
	}
	public static void js_scroll(WebDriver d,WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollIntoView()", element);
		

	}
	public static void js_highlight(WebDriver d,WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor) d;
		js.executeScript("arguments[0].setAttribute('style','color:pink')", element);

	}
	
	///////////Actions//////////////////////////
	public static void action_click(WebDriver d,WebElement element) {
		Actions a=new Actions(d);
		a.click(element).build().perform();

	}
	public static void action_contextclick(WebDriver d,WebElement element) {
		Actions a=new Actions(d);
		a.contextClick(element).build().perform();

	}
	public static void action_doubleclick(WebDriver d,WebElement element) {
		Actions a=new Actions(d);
		a.doubleClick(element).build().perform();

	}
	public static void action_clickandhold(WebDriver d,WebElement element) {
		Actions a=new Actions(d);
		a.clickAndHold(element).build().perform();

	}
	public static void action_movetoelement(WebDriver d,WebElement element) {
		Actions a=new Actions(d);
		a.moveToElement(element).build().perform();

	}
	public static void action_draganddrop(WebDriver d,WebElement element,WebElement element1) {
		Actions a=new Actions(d);
		a.dragAndDrop(element, element1).build().perform();

	}
	
	//////////////////////RobotClass///////////////////
	
	public void down_and_enter() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	/////////////////wait/////////////
	public static void implicitwait(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		
	}
	
	public static void pageloadtimeout(WebDriver d,Duration seconds) {
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(0));
		
	}
	
	//////// window handling//////////////////
	public static void single_window_handle(WebDriver d) {
		String parendid = d.getWindowHandle();
		Set<String> allid = d.getWindowHandles();
		for (String id : allid) {
			if(id.equals(parendid)) {
				continue;
			}else {
				//System.out.println("one");
				d.switchTo().window(id);
			}
		}
			
			

	}
	public static void multi_window_handle(WebDriver d,String url) {
		Set<String> all_id = d.getWindowHandles();
		String exp_url=url;
		
		for (String id : all_id) {
			
			if(d.switchTo().window(id).getCurrentUrl().equals(exp_url)) {
				break;
			}

	}
	}
	
	//////////////Sceeenshot method//////////////////////
	
	public static void screenshot(WebDriver d,String pathname) throws IOException {
		TakesScreenshot ts= (TakesScreenshot) d;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(pathname);
		FileUtils.copyFile(source, des);
	}
	
	
}
