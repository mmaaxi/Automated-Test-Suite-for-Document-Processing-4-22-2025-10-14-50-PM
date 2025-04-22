package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    WebDriverWait wait;
    tc_002Page uploadPage;

    public tc_002Steps() {
        this.driver = Hooks.driver;
        this.wait = new WebDriverWait(driver, 10);
        this.uploadPage = new tc_002Page(driver, wait);
    }

    @Given("the user navigates to the file upload page")
    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    @When("the user selects a valid PDF/DOCX file within the size limit")
    public void selectValidFile() {
        uploadPage.uploadFile("path/to/valid/file.pdf");
    }

    @Then("the file is uploaded successfully")
    public void verifyFileUploaded() {
        Assert.assertTrue(uploadPage.isUploadSuccessful());
    }

    @Then("the file preview is displayed with the correct name, size, and type")
    public void verifyFilePreview() {
        Assert.assertTrue(uploadPage.isPreviewDisplayedCorrectly("file.pdf", "PDF"));
    }
}