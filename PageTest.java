package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class PageTest
{
    private WebDriver driver;
    private WebDriver wait;


//    @Test
//    public void bjDeclarationPageFF() {
////        check login Firefox
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("https://kcm.test.kewillcloud.com/kcm/#!Declarations");
//        driver.findElement(By.id("txtUsername")).sendKeys("epam");
//        driver.findElement(By.id("pwdPassword")).sendKeys("epam");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.id("btnLogin")).click();
//            driver.quit();
//                System.out.println("Browse was successfully quited.");
//
//
//    }

    @Test
    public void bjDeclarationPageChrome() {
        //check login Chrome
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Oleksii_Ohniev\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("https://kcm.test.kewillcloud.com/kcm/#!Declarations");
//        driver.findElement(By.id("txtUsername")).sendKeys("epam");
//        driver.findElement(By.id("pwdPassword")).sendKeys("epam");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.id("btnLogin")).click();
//            driver.quit();
                System.out.println("Chrome was successfully quited.");

    }

//    @Test
//    public void declarationPageOk() {
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("https://kcm.test.kewillcloud.com/kcm/#!Declarations");
//        driver.findElement(By.id("txtUsername")).sendKeys("epam");
//        driver.findElement(By.id("pwdPassword")).sendKeys("epam");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.id("btnLogin")).click();
//        driver.findElement(By.id("btnKCM")).click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@id=\"kcm-106005\"]/div/div[2]/div/div[2]/div/span[2]")).click();
//        driver.findElement(By.xpath("//*[@id=\"kcm-106005-overlays\"]/div[2]/div/div/span[1]/span")).click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.id("btnFind")).isDisplayed();
//            driver.quit();
//                System.out.println("Declarations filters page successful.");



    @Test
    public void newUkNctsDecOk() {

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://kcm.test.kewillcloud.com/cm/#!Declarations");
        driver.findElement(By.id("txtUsername")).sendKeys("epam");
        driver.findElement(By.id("pwdPassword")).sendKeys("epam");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("btnLogin")).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("btnKCM")));
        System.out.println("Log in OK");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
//        Login Ok


        driver.findElement(By.id("btnKCM")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"cm-3178\"]/div/div[2]/div/div[2]/div/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"cm-3178-overlays\"]/div[2]/div/div/span[1]/span")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        button appeared
        driver.findElement(By.id("btnNewDeclaration")).isDisplayed();
        driver.findElement(By.id("btnNewDeclaration")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        popup appeared
        driver.findElement(By.xpath("//*[@id=\"cm-3178-overlays\"]/div[3]/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div/div")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"VAADIN_COMBOBOX_OPTIONLIST\"]/div/div[2]/table/tbody/tr[6]/td")).click();
//        combobox appeared
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@id=\"gwt-uid-86\"]/select")).click();
        Select oSelect = new Select(driver.findElement(By.xpath("//*[@id=\"gwt-uid-86\"]")));
        oSelect.selectByVisibleText("NCTSDeclaration");
//        driver.findElement(By.xpath("//*[@id=\"gwt-uid-1499\"]/select/option[34]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"kcm-106005-overlays\"]/div[3]/div/div/div[3]/div/div/div/div[2]/div/div/div[3]/div/div[3]/div")).click();
//        NCTS UK form appeared
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("crn")));
        System.out.println("NCTS UK form appeared");

//        CRN
        driver.findElement(By.id("crn")).sendKeys("TEST_013");
//        Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PlaceOfLoading.Code")).sendKeys("123");
//        City
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PlaceOfLoading.City")).sendKeys("London");
//        Authorised Location Of Goods Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PlaceOfLoading.AuthorisedLocationOfGoodsCode")).sendKeys("Dublin");
//        Street
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PlaceOfLoading.Street")).sendKeys("Central");
//        Agreed Location Of Goods
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PlaceOfLoading.AgreedLocationOfGoods")).sendKeys("A");
//        Postal Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PlaceOfLoading.PostalCode")).sendKeys("1");
//        Agreed Location Of Goods Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PlaceOfLoading.AgreedLocationOfGoodsCode")).sendKeys("C");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Place Of Loading OK");

//        Transport Mode
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportInland.TransportMode")).sendKeys("1A");
//        Transportation Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportInland.TransportationNumber")).sendKeys("1");
//        Place Of Loading Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportInland.PlaceOfLoadingCode")).sendKeys("L1");
//        Transportation Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportInland.TransportationType")).sendKeys("air");
//        Transportation Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportInland.TransportationCountry")).sendKeys("UK");
//        Transport Time
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportInland.TransportTime")).sendKeys("2");
//        Place Of Loading
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportInland.PlaceOfLoading")).sendKeys("Limerick");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Means Of Transport Inland OK");

//        Transport Mode
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportBorder.TransportMode")).sendKeys("1");
//        Transportation Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportBorder.TransportationNumber")).sendKeys("2");
//        Place Of Loading Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportBorder.PlaceOfLoadingCode")).sendKeys("L!");
//        Transportation Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportBorder.TransportationType")).sendKeys("2");
//        Transportation Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportBorder.TransportationCountry")).sendKeys("UK");
//        Transport Time
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportBorder.TransportTime")).sendKeys("2");
//        Place Of Loading
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportBorder.PlaceOfLoading")).sendKeys("Bristol");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Means Of Transport Border OK");

//        Transport Mode
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportDeparture.TransportMode")).sendKeys("1");
//        Transportation Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportDeparture.TransportationNumber")).sendKeys("2");
//        Place Of Loading Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportDeparture.PlaceOfLoadingCode")).sendKeys("L!");
//        Transportation Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportDeparture.TransportationType")).sendKeys("2");
//        Transportation Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportDeparture.TransportationCountry")).sendKeys("UK");
//        Transport Time
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportDeparture.TransportTime")).sendKeys("2");
//        Place Of Loading
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportDeparture.PlaceOfLoading")).sendKeys("Bristol");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Means Of Transport Departure OK");

//        Transport Mode
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportCrossingBorder.TransportMode")).sendKeys("1");
//        Transportation Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportCrossingBorder.TransportationNumber")).sendKeys("2");
//        Place Of Loading Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportCrossingBorder.PlaceOfLoadingCode")).sendKeys("L!");
//        Transportation Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportCrossingBorder.TransportationType")).sendKeys("2");
//        Transportation Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportCrossingBorder.TransportationCountry")).sendKeys("UK");
//        Transport Time
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportCrossingBorder.TransportTime")).sendKeys("2");
//        Place Of Loading
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.MeansOfTransportCrossingBorder.PlaceOfLoading")).sendKeys("Bristol");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Means Of Transport Crossing Border OK");

//        TIN
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorTIN.TIN")).sendKeys("1");
//        BO
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorTIN.BO")).sendKeys("1");
//        Is TIN German Approval Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorTIN.IsTINGermanApprovalNumber")).sendKeys("");
//        Identification Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorTIN.IdentificationType")).sendKeys("1");
//        Customer Identifier
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorTIN.CustomerIdentifier")).sendKeys("1");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Consignor TIN OK");

//        Name
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignor.Address.Name")).sendKeys("A");
//        City
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignor.Address.City")).sendKeys("London");
//        Country Sub Entity
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignor.Address.CountrySubEntity")).sendKeys("UK");
//        Street
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignor.Address.Street")).sendKeys("Central");
//        Postal Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignor.Address.PostalCode")).sendKeys("1");
//        House Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignor.Address.HouseNumber")).sendKeys("1");
//        Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignor.Address.Country")).sendKeys("UK");
//        VAT Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignor.VATNumber")).sendKeys("123");
//        ETN Address
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignor.ETNAddress")).sendKeys("Back");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Consignor OK");

//        Position
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorContactPerson.Position")).sendKeys("1");
//        Email
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorContactPerson.Email")).sendKeys("123@mail.com");
//        Initials
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorContactPerson.Initials")).sendKeys("1");
//        Clerk
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorContactPerson.Clerk")).sendKeys("A");
//        Fax Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorContactPerson.FaxNumber")).sendKeys("1");
//        Title
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorContactPerson.Title")).sendKeys("Title");
//        Identity
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorContactPerson.Identity")).sendKeys("1");
//        Phone number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorContactPerson.PhoneNumber")).sendKeys("123123123");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Consignor Contact Person OK");

//        TIN
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeTIN.TIN")).sendKeys("1");
//        BO
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeTIN.BO")).sendKeys("A");
//        Is TIN German Approval Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeTIN.IsTINGermanApprovalNumber")).sendKeys("");
//        Identification Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeTIN.IdentificationType")).sendKeys("B");
//        Customer Identifier
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeTIN.CustomerIdentifier")).sendKeys("2");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Consignee TIN OK");

//        Name
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignee.Address.Name")).sendKeys("ADC");
//        City
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignee.Address.City")).sendKeys("Cork");
//        Country Sub Entity
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignee.Address.CountrySubEntity")).sendKeys("A");
//        Street
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignee.Address.Street")).sendKeys("NEW");
//        Postal Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignee.Address.PostalCode")).sendKeys("123");
//        House Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignee.Address.HouseNumber")).sendKeys("16");
//        Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignee.Address.Country")).sendKeys("IRELAND");
//        VAT Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignee.VATNumber")).sendKeys("321");
//        ETN Address
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Consignee.ETNAddress")).sendKeys("1A");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Consignee OK");

//        Position
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeContactPerson.Position")).sendKeys("21");
//        Email
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeContactPerson.Email")).sendKeys("123@321.mail.com");
//        Initials
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeContactPerson.Initials")).sendKeys("123");
//        Clerk
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeContactPerson.Clerk")).sendKeys("A");
//        Fax Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeContactPerson.FaxNumber")).sendKeys("3212321123");
//        Title
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeContactPerson.Title")).sendKeys("Title");
//        Identity
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeContactPerson.Identity")).sendKeys("333");
//        Phone Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeContactPerson.PhoneNumber")).sendKeys("023483223");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Consignee Contact Person OK");

//        TIN
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTraderTIN.TIN")).sendKeys("21");
//        BO
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTraderTIN.BO")).sendKeys("231");
//        Is TIN German Approval Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTraderTIN.IsTINGermanApprovalNumber")).sendKeys("");
//        Identification Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTraderTIN.IdentificationType")).sendKeys("1");
//        Customer Identifier
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTraderTIN.CustomerIdentifier")).sendKeys("1Q");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Destination Trader TIN OK");

//        Name
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTrader.Address.Name")).sendKeys("QW");
//        City
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTrader.Address.City")).sendKeys("Manchester");
//        Country Sub Entity
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTrader.Address.CountrySubEntity")).sendKeys("UK");
//        Street
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTrader.Address.Street")).sendKeys("First");
//        Postal Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTrader.Address.PostalCode")).sendKeys("1");
//        House Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTrader.Address.HouseNumber")).sendKeys("123");
//        Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTrader.Address.Country")).sendKeys("USA");
//        VAT Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTrader.VATNumber")).sendKeys("123");
//        ETN Address
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationTrader.ETNAddress")).sendKeys("New");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Destination Trader OK");

//        TIN
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsigneeTIN.TIN")).sendKeys("12");
//        BO
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsigneeTIN.BO")).sendKeys("21");
//        Is TIN German Approval Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsigneeTIN.IsTINGermanApprovalNumber")).sendKeys("");
//        Identification Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsigneeTIN.IdentificationType")).sendKeys("B");
//        Customer Identifier
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsigneeTIN.CustomerIdentifier")).sendKeys("19");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Authorised Consignee TIN OK");

//        Name
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsignee.Address.Name")).sendKeys("QW");
//        City
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsignee.Address.City")).sendKeys("Manchester");
//        Country Sub Entity
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsignee.Address.CountrySubEntity")).sendKeys("UK");
//        Street
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsignee.Address.Street")).sendKeys("First");
//        Postal Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsignee.Address.PostalCode")).sendKeys("1");
//        House Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsignee.Address.HouseNumber")).sendKeys("123");
//        Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsignee.Address.Country")).sendKeys("USA");
//        VAT Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsignee.VATNumber")).sendKeys("123");
//        ETN Address
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisedConsignee.ETNAddress")).sendKeys("New");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Authorized Consignee OK");

//        TIN
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalTIN.TIN")).sendKeys("12");
//        BO
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalTIN.BO")).sendKeys("21");
//        Is TIN German Approval Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalTIN.IsTINGermanApprovalNumber")).sendKeys("");
//        Identification Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalTIN.IdentificationType")).sendKeys("B");
//        Customer Identifier
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalTIN.CustomerIdentifier")).sendKeys("19");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Principal TIN OK");

//        Name
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Principal.Address.Name")).sendKeys("QW");
//        City
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Principal.Address.City")).sendKeys("Manchester");
//        Country Sub Entity
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Principal.Address.CountrySubEntity")).sendKeys("UK");
//        Street
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Principal.Address.Street")).sendKeys("First");
//        Postal Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Principal.Address.PostalCode")).sendKeys("1");
//        House Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Principal.Address.HouseNumber")).sendKeys("123");
//        Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Principal.Address.Country")).sendKeys("USA");
//        VAT Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Principal.VATNumber")).sendKeys("123");
//        ETN Address
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Principal.ETNAddress")).sendKeys("New");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Principal OK");

//        Position
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalContactPerson.Position")).sendKeys("21");
//        Email
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalContactPerson.Email")).sendKeys("123@321.mail.com");
//        Initials
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalContactPerson.Initials")).sendKeys("123");
//        Clerk
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalContactPerson.Clerk")).sendKeys("A");
//        Fax Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalContactPerson.FaxNumber")).sendKeys("3212321123");
//        Title
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalContactPerson.Title")).sendKeys("Title");
//        Identity
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalContactPerson.Identity")).sendKeys("333");
//        Phone Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalContactPerson.PhoneNumber")).sendKeys("023483223");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Principal Contact Person OK");

//        Position
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Contact.Position")).sendKeys("21");
//        Email
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Contact.Email")).sendKeys("123@321.mail.com");
//        Initials
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Contact.Initials")).sendKeys("123");
//        Clerk
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Contact.Clerk")).sendKeys("A");
//        Fax Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Contact.FaxNumber")).sendKeys("3212321123");
//        Title
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Contact.Title")).sendKeys("Title");
//        Identity
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Contact.Identity")).sendKeys("333");
//        Phone Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Contact.PhoneNumber")).sendKeys("023483223");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Contact OK");

//        TIN
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.RepresentativeTIN.TIN")).sendKeys("12");
//        BO
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.RepresentativeTIN.BO")).sendKeys("21");
//        Is TIN German Approval Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.RepresentativeTIN.IsTINGermanApprovalNumber")).sendKeys("");
//        Identification Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.RepresentativeTIN.IdentificationType")).sendKeys("B");
//        Customer Identifier
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.RepresentativeTIN.CustomerIdentifier")).sendKeys("19");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Representative TIN OK");

//        Suspension Indicator
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.TransportationRoute.SuspensionIndicator")).sendKeys("1");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Transportation Route OK");

//        TIN
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.CarrierTIN.TIN")).sendKeys("12");
//        BO
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.CarrierTIN.BO")).sendKeys("21");
//        Is TIN German Approval Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.CarrierTIN.IsTINGermanApprovalNumber")).sendKeys("");
//        Identification Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.CarrierTIN.IdentificationType")).sendKeys("B");
//        Customer Identifier
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.CarrierTIN.CustomerIdentifier")).sendKeys("19");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Carrier TIN OK");

//        Name
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Carrier.Address.Name")).sendKeys("QW");
//        City
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Carrier.Address.City")).sendKeys("Manchester");
//        Country Sub Entity
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Carrier.Address.CountrySubEntity")).sendKeys("UK");
//        Street
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Carrier.Address.Street")).sendKeys("First");
//        Postal Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Carrier.Address.PostalCode")).sendKeys("1");
//        House Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Carrier.Address.HouseNumber")).sendKeys("123");
//        Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Carrier.Address.Country")).sendKeys("USA");
//        VAT Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Carrier.VATNumber")).sendKeys("123");
//        ETN Address
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Carrier.ETNAddress")).sendKeys("New");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Carrier OK");

//        Shipment Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Security.ShipmentNumber")).sendKeys("7");
//        Place Of Loading
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Security.PlaceOfLoading")).sendKeys("Berlin");
//        Place Of Unloading
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Security.PlaceOfUnloading")).sendKeys("Bonn");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Security OK");

//        TIN
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurityTIN.TIN")).sendKeys("12");
//        BO
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurityTIN.BO")).sendKeys("21");
//        Is TIN German Approval Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurityTIN.IsTINGermanApprovalNumber")).sendKeys("");
//        Identification Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurityTIN.IdentificationType")).sendKeys("B");
//        Customer Identifier
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurityTIN.CustomerIdentifier")).sendKeys("19");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Consignor Security TIN OK");

//        Name
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurity.Address.Name")).sendKeys("QW");
//        City
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurity.Address.City")).sendKeys("Manchester");
//        Country Sub Entity
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurity.Address.CountrySubEntity")).sendKeys("UK");
//        Street
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurity.Address.Street")).sendKeys("First");
//        Postal Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurity.Address.PostalCode")).sendKeys("1");
//        House Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurity.Address.HouseNumber")).sendKeys("123");
//        Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurity.Address.Country")).sendKeys("USA");
//        VAT Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurity.VATNumber")).sendKeys("123");
//        ETN Address
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsignorSecurity.ETNAddress")).sendKeys("New");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Consignor Security OK");

//        TIN
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurityTIN.TIN")).sendKeys("12");
//        BO
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurityTIN.BO")).sendKeys("21");
//        Is TIN German Approval Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurityTIN.IsTINGermanApprovalNumber")).sendKeys("");
//        Identification Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurityTIN.IdentificationType")).sendKeys("B");
//        Customer Identifier
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurityTIN.CustomerIdentifier")).sendKeys("19");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Consignee Security TIN OK");

//        Name
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurity.Address.Name")).sendKeys("QW");
//        City
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurity.Address.City")).sendKeys("Manchester");
//        Country Sub Entity
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurity.Address.CountrySubEntity")).sendKeys("UK");
//        Street
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurity.Address.Street")).sendKeys("First");
//        Postal Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurity.Address.PostalCode")).sendKeys("1");
//        House Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurity.Address.HouseNumber")).sendKeys("123");
//        Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurity.Address.Country")).sendKeys("USA");
//        VAT Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurity.VATNumber")).sendKeys("123");
//        ETN Address
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConsigneeSecurity.ETNAddress")).sendKeys("New");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Consignee Security OK");

//Footer Fields part
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

//Shipment Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ShipmentNumber")).sendKeys("1");
//Destination Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DestinationCountry")).sendKeys("UK");
//Transport Data Available
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.TransportDataAvailable")).sendKeys("");
//Total Number Positions
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.TotalNumberPositions")).sendKeys("12133");
//Declaration Date
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DeclarationDate")).sendKeys("12-12-18");
//Situation Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.SituationCode")).sendKeys("1657");
//Conveyance Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ConveyanceNumber")).sendKeys("17765");
//Principal Is Carrier
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PrincipalIsCarrier")).sendKeys("1");
//Control Result Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ControlResultCode")).sendKeys("1987654");
//Representative Name
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.RepresentativeName")).sendKeys("AL");
//Identification Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.IdentificationCode")).sendKeys("12222");
//UCR Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.UCRNumber")).sendKeys("26651");
//Authorisation Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.AuthorisationNumber")).sendKeys("10");
//Dispatch Country
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DispatchCountry")).sendKeys("USA");
//Transport In Container
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.TransportInContainer")).sendKeys("1");
//Total Number Packages
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.TotalNumberPackages")).sendKeys("198");
//Declaration Place
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DeclarationPlace")).sendKeys("UK");
//Payment Type
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PaymentType")).sendKeys("1");
//Place Of Un Loading
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.PlaceOfUnLoading")).sendKeys("USA");
//Office Of Departure
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.OfficeOfDeparture")).sendKeys("Berlin");
//Control Result Date Limit
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.ControlResultDateLimit")).sendKeys("12-12-18");
//Representative Capacity
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.RepresentativeCapacity")).sendKeys("1");
//Bonded Warehuse Ref Num
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.BondedWarehuseRefNum")).sendKeys("12");
//Declaration Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.DeclarationNumber")).sendKeys("1");
//Type Of Declaration
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.TypeOfDeclaration")).sendKeys("12");
//Customs Sub Place
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.CustomsSubPlace")).sendKeys("Canada");
//NCTS Document Language
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.NCTSDocumentLanguage")).sendKeys("2");
//Total Gross Mass
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.NCTSDocumentLanguage")).sendKeys("2");
//Latest Presentation Date
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.LatestPresentationDate")).sendKeys("12-12-18");
//Security Indicator
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.SecurityIndicator")).sendKeys("1");
//Carnet ID
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.CarnetID")).sendKeys("1");
//Office Of Destination
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.OfficeOfDestination")).sendKeys("London");
//Simplified Procedure Indicator
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.SimplifiedProcedureIndicator")).sendKeys("");
//Total Number Of Seals
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.TotalNumberOfSeals")).sendKeys("1");
//Bonded Warehouse Permit Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.BondedWarehousePermitNumber")).sendKeys("1");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                System.out.println("Footer Fields part OK");

//Office Of Transit ADD FORM
        driver.findElement(By.xpath("//*[@id=\"com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.OfficeOfTransit.panel\"]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div")).click();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//                driver.findElement(By.xpath("//*[@id=\"kcm-106005-overlays\"]/div[3]/div")).isDisplayed();
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTNCTSGoodsDeclaration.OfficeOfTransit.Code")).sendKeys("CH001801");
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTNCTSGoodsDeclaration.OfficeOfTransit.ArrivalDateAndTime")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"kcm-106005-overlays\"]/div[3]/div/div/div[3]/div/div/div[2]/div/div/div[3]/div/div[3]")).click();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println("Office Of Transit OK");

//Seals ADD FORM
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Seals.SealNumbers.panel\"]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div")));
        new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Seals.SealNumbers.panel\"]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div")));
        driver.findElement(By.xpath("//*[@id=\"com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Seals.SealNumbers.panel\"]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div")).click();

//          driver.findElement(By.className("v-slot v-slot-button-secondary")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//                driver.findElement(By.xpath("//*[@id=\"kcm-106005-overlays\"]/div[3]/div")).isDisplayed();
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTSealNumbers.Number")).sendKeys("1");
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTSealNumbers.SealingParty")).sendKeys("2");
        driver.findElement(By.xpath("//*[@id=\"kcm-106005-overlays\"]/div[3]/div/div/div[3]/div/div/div[2]/div/div/div[3]/div/div[3]/div")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//Kind
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Seals.Kind")).sendKeys("1");
//Use Of Tyden Seal Stock
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Seals.UseOfTydenSealStock")).sendKeys("");
//Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Seals.Number")).sendKeys("1");
//Use Of Tyden Seals
        driver.findElement(By.id("com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Seals.UseOfTydenSeals")).sendKeys("");
//            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println("Seals OK");

//Guarantee ADD FORM
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Guarantee.panel\"]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div")));
        new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Guarantee.panel\"]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div")));
        driver.findElement(By.xpath("//*[@id=\"com.kewill.kcm.ncts41.NCTSDeclaration.GoodsDeclaration.Guarantee.panel\"]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div")).click();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@id=\"kcm-106005-overlays\"]/div[3]/div")).isDisplayed();
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTGuarantee.TypeOfGuarantee")).sendKeys("1");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//*[@id=\"com.kewill.kcm.ncts41.CTGuarantee.Reference.panel\"]/div[2]/div/div[2]/div/div/div[1]/div/div[1]")).click();
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


//Amount
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTGuarantee.Reference.Amounts.Amount")).sendKeys("1");
//Local Currency
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTGuarantee.Reference.Amounts.LocalCurrency")).sendKeys("1");
//Currency
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTGuarantee.Reference.Amounts.Currency")).sendKeys("1");
//Local Amount
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTGuarantee.Reference.Amounts.LocalAmount")).sendKeys("1");
//GRN
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTGuarantee.Reference.GRN")).sendKeys("1");
//Issuing Office
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTGuarantee.Reference.IssuingOffice")).sendKeys("1");
//Not Valid For EC
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTGuarantee.Reference.NotValidForEC")).sendKeys("1");
//Access Code
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTGuarantee.Reference.AccessCode")).sendKeys("1");
//Owner TIN
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTGuarantee.Reference.OwnerTIN")).sendKeys("1");
//Other Number
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTGuarantee.Reference.OtherNumber")).sendKeys("1");
//Price Group
        driver.findElement(By.id("com.kewill.kcm.ncts41.CTGuarantee.Reference.PriceGroup")).sendKeys("1");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"kcm-106005-overlays\"]/div[5]/div/div/div[3]/div/div/div/div[2]/div/div/div[3]/div/div[3]")).click();
//            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kcm-106005-overlays\"]/div[3]/div/div/div[3]/div/div/div[2]/div/div/div[3]/div/div[3]/div")));
        new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"kcm-106005-overlays\"]/div[3]/div/div/div[3]/div/div/div[2]/div/div/div[3]/div/div[3]/div")));
        driver.findElement(By.xpath("//*[@id=\"kcm-106005-overlays\"]/div[3]/div/div/div[3]/div/div/div[2]/div/div/div[3]/div/div[3]/div")).click();
                System.out.println("Guarantee ADD FORM OK");

//        Save declaration
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("save")));
        driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
            System.out.println("Declaration saved");
//        Send declaration
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("send")));
        driver.findElement(By.id("send")).click();
            System.out.println("Declaration sent");












































































//        driver.quit();
        System.out.println("Everything is fucking OK! (Without Goods)");


    }
}
