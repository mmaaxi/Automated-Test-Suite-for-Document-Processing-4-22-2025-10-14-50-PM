package steps;

import pages.tc_001Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_001Steps {
    tc_001Page page;

    @Given("el usuario está en la página de subida de documentos")
    public void el_usuario_está_en_la_página_de_subida_de_documentos() {
        page = new tc_001Page();
        page.navigateToDocumentUploadPage();
    }

    @When("el usuario selecciona opción 'cargar documentos'")
    public void el_usuario_selecciona_opción_cargar_documentos() {
        page.selectUploadDocumentsOption();
    }

    @Then("el sistema muestra opción para carga única y carga múltiple")
    public void el_sistema_muestra_opción_para_carga_única_y_carga_múltiple() {
        assertTrue(page.isSingleAndMultipleUploadOptionDisplayed());
    }

    @When("el usuario elige 'carga en un solo archivo'")
    public void el_usuario_elige_carga_en_un_solo_archivo() {
        page.selectSingleFileUploadOption();
    }

    @Then("se habilita un único recuadro para subir el archivo")
    public void se_habilita_un_único_recuadro_para_subir_el_archivo() {
        assertTrue(page.isSingleFileUploadBoxEnabled());
    }

    @When("el usuario elige 'cargar documentos por separado'")
    public void el_usuario_elige_cargar_documentos_por_separado() {
        page.selectMultipleFileUploadOption();
    }

    @Then("se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void se_muestran_múltiples_recuadros_correspondientes_a_cada_documento_requerido() {
        assertTrue(page.areMultipleUploadBoxesDisplayed());
    }
}