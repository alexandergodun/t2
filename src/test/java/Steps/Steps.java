package Steps;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Steps {

    private WebDriver driver;

    public void initBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void closeDriver()
    {
        driver.close();
    }

    public void logInMyFish(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("http://www.myfish.by");
        loginPage.logIn(username, password);
    }
    public boolean isLoggedIn() {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.isLogIn());
    }
    public void logOutMyFish(String username, String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("http://www.myfish.by");
        loginPage.logOut(username,password);
    }
    public boolean isLoggedOut() {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.isLogOut());
    }
    public void search(String searcword){
        Search search = new Search(driver);
        search.openPage("http://www.myfish.by");
        search.search(searcword);
    }
    public boolean isSearched() {
        Search search = new Search(driver);
        return (search.isSearch());
    }
    public void enterBasket() throws InterruptedException {
        EnterBasket enterbasket = new EnterBasket(driver);
        enterbasket.openPage("http://www.myfish.by");
        enterbasket.enterBasket();
    }
    public boolean isEnterBasket() {
        EnterBasket enterbasket = new EnterBasket(driver);
        return (enterbasket.isEnterBasket());
    }
    public void recall(String username,String password){
        Recall recall = new Recall(driver);
        recall.openPage("http://www.myfish.by");
        recall.Recall(username,password);
    }
    public boolean isRecall() {
        Recall recall = new Recall(driver);
        return (recall.isRecall());
    }
    public void changePassword(String username,String password,String newPassword){
        ChangePassword changePassword1 = new ChangePassword(driver);
        changePassword1.openPage("http://www.myfish.by");
        changePassword1.ChangePassword(username,password,newPassword);
    }
    public boolean isChangePassword() {
        ChangePassword isChangePassword1 = new ChangePassword(driver);
        return (isChangePassword1.isChangePassword());
    }
    public void subscribe(String username,String password){
        Subscribe subscribe1 = new Subscribe(driver);
        subscribe1.openPage("http://www.myfish.by");
        subscribe1.subscribe(username,password);
    }
    public boolean isSubscribe() {
        Subscribe isSubscribe1 = new Subscribe(driver);
        return (isSubscribe1.isSubscribe());
    }
    public void liked(){
        Liked liked1 = new Liked(driver);
        liked1.openPage("http://www.myfish.by");
        liked1.Liked();
    }
    public boolean isLiked() {
        Liked isLiked1 = new Liked(driver);
        return (isLiked1.isLiked());
    }
    public void deleteBasket() throws InterruptedException {
        DeleteBasket deletebasket = new DeleteBasket(driver);
        deletebasket.openPage("http://www.myfish.by");
        deletebasket.DeleteBasket();
    }
    public boolean isDeleteBasket() {
        DeleteBasket isDeletebasket = new DeleteBasket(driver);
        return (isDeletebasket.isDeleteBasket());
    }
    public void compare() throws InterruptedException {
        Compare compare = new Compare(driver);
        compare.openPage("http://www.myfish.by");
        compare.compare();
    }
    public boolean isCompare() {
        Compare compare = new Compare(driver);
        return (compare.isCompare());
    }
}


