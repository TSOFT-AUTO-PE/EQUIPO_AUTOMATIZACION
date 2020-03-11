package com.tsoft.bot.frontend.steps.WEB_DELIVERY;

import com.tsoft.bot.frontend.BaseClass;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.ExtentReportUtil;
import com.tsoft.bot.frontend.utility.GenerateWord;
import com.tsoft.bot.frontend.utility.Sleeper;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static com.tsoft.bot.frontend.pageobject.WEB_DELIVERY.PageObject_ImpresionDocumentosW_D.*;
import java.util.HashMap;
import java.util.List;

public class steep_ImpresionDocumentosW_D {
    private static GenerateWord generateWord = new GenerateWord();
    private WebDriver driver;
    public steep_ImpresionDocumentosW_D() {
        this.driver = Hook.getDriver();
    }
    /*private List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(EXCEL_WEB, ORDEN);
    }*/
    @When("^Seleccionar impresion de documentos en WEB DELIVERY$")
    public void seleccionarImpresionDeDocumentosEnWEBDELIVERY() throws Exception {
        try {
            Actions act = new Actions(driver);
            act.moveToElement(driver.findElement(LNK_GESTION_PEDIDO)).build().perform();
            Actions act2 = new Actions(driver);
            act2.moveToElement(driver.findElement(LNK_PREPARACION_PEDIDO)).build().perform();
            driver.findElement(LNK_IMPRESION_DOCUMENTOS).click();
            Thread.sleep(2000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Impresión de pedidos");
            generateWord.sendText("Impresión de pedidos");
            generateWord.addImageToWord(driver);

        }catch (Exception e){
            //ExcelReader.writeCellValue(EXCEL_WEB, ORDEN, 1, 19, "FAIL");
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }

    @When("^click en ejecutar informes$")
    public void clickEnEjecutarInformes() throws Exception {
        try {
            driver.findElement(LST_SELECCIONAR_ACCION).click();
            Thread.sleep(1000);
            driver.findElement(LNK_EJECUTAR_INFORMES).click();
            Thread.sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Ejecutar informes");
            generateWord.sendText("Ejecutar informes");
            generateWord.addImageToWord(driver);
        }catch (Exception e){
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }

    @And("^Imprimir guia de remision$")
    public void imprimirGuiaDeRemision() throws Exception {
        try {
            driver.findElement(LNK_GUIA_REMISION).click();
            Thread.sleep(2000);
            driver.findElement(TXT_NUM_SERIE).sendKeys("12345");
            Thread.sleep(1000);
            driver.findElement(TXT_CORRELATIVO_GUIA).sendKeys("12345");
            Thread.sleep(1000);
            driver.findElement(BTN_ENVIAR).click();
            Thread.sleep(10000);


        }catch (Exception e){
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }
}
