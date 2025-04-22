package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {

    WebDriver driver;

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        // Implementación del inicio de sesión
        driver.findElement(By.id("username")).sendKeys("usuario");
        driver.findElement(By.id("password")).sendKeys("contraseña");
        driver.findElement(By.id("loginButton")).click();
    }

    public void uploadAndProcessDocuments() {
        // Implementación de carga y procesamiento de documentos
        driver.findElement(By.id("uploadButton")).sendKeys("/path/to/document");
        driver.findElement(By.id("processButton")).click();
    }

    public boolean isSlipGenerated() {
        // Verificar si el Slip de salida fue generado
        return driver.findElement(By.id("slipConfirmation")).isDisplayed();
    }

    public boolean areDocumentsSavedInHistory() {
        // Verificar si los documentos y datos fueron guardados en el historial
        return driver.findElement(By.id("historyConfirmation")).isDisplayed();
    }
}