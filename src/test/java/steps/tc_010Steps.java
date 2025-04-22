package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_010Page;
import org.junit.Assert;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("^El usuario ha iniciado sesión en el sistema$")
    public void elUsuarioHaIniciadoSesionEnElSistema() {
        page.login();
    }

    @When("^Completa la carga y procesamiento de documentos$")
    public void completaLaCargaYProcesamientoDeDocumentos() {
        page.uploadAndProcessDocuments();
    }

    @Then("^El sistema genera el 'Slip de salida'$")
    public void elSistemaGeneraElSlipDeSalida() {
        Assert.assertTrue(page.isSlipGenerated());
    }

    @Then("^Guarda tanto los documentos originales como los datos extraídos en el historial de la solicitud$")
    public void guardaDocumentosEnElHistorial() {
        Assert.assertTrue(page.areDocumentsSavedInHistory());
    }
}