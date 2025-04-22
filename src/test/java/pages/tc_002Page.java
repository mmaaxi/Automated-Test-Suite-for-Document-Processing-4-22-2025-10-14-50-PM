package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_002Page {
    WebDriver driver;
    WebDriverWait wait;

    By uploadButton = By.id("fileUpload");
    By uploadSuccessMessage = By.id("uploadSuccess");
    By filePreviewName = By.id("fileName");
    By filePreviewType = By.id("fileType");
    
    public tc_002Page(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // Upload a file
    public void uploadFile(String filePath) {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys(filePath);
    }

    // Check if the upload was successful
    public boolean isUploadSuccessful() {
        return driver.findElement(uploadSuccessMessage).isDisplayed();
    }

    // Verify the file preview details
    public boolean isPreviewDisplayedCorrectly(String expectedName, String expectedType) {
        WebElement nameElement = driver.findElement(filePreviewName);
        WebElement typeElement = driver.findElement(filePreviewType);
        return nameElement.getText().equals(expectedName) && typeElement.getText().equals(expectedType);
    }
}