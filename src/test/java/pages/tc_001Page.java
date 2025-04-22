package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_001Page {
    WebDriver driver;

    By uploadDocumentsOption = By.id("uploadDocumentsOption");
    By singleUploadOption = By.id("singleUpload");
    By multipleUploadOption = By.id("multipleUpload");
    By singleUploadBox = By.id("singleUploadBox");
    By multipleUploadBoxes = By.className("multipleUploadBoxes");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToDocumentUploadPage() {
        driver.get("https://example.com/document-upload");
    }

    public void selectUploadDocumentsOption() {
        driver.findElement(uploadDocumentsOption).click();
    }

    public boolean isSingleAndMultipleUploadOptionDisplayed() {
        return driver.findElement(singleUploadOption).isDisplayed() && driver.findElement(multipleUploadOption).isDisplayed();
    }

    public void selectSingleFileUploadOption() {
        driver.findElement(singleUploadOption).click();
    }

    public boolean isSingleFileUploadBoxEnabled() {
        return driver.findElement(singleUploadBox).isDisplayed() && driver.findElement(singleUploadBox).isEnabled();
    }

    public void selectMultipleFileUploadOption() {
        driver.findElement(multipleUploadOption).click();
    }

    public boolean areMultipleUploadBoxesDisplayed() {
        return !driver.findElements(multipleUploadBoxes).isEmpty();
    }
}