import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.7.1.169/')

WebUI.setText(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_61d5e8 (13)'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_61d5e8_1 (13)'), 
    'RAIVpflpDOg=')

WebUI.clickOffset(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/span_Sign In_p-ink p-ink-active (12)'), 
    0, 0)

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/div_Contract Management (12)'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Back to Landing Page_topbar-menubutt_f8f723 (12)'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/a_Tanpa Kontrak (5)'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/td_3657 (2)'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Edit (2)'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/td_3708'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Edit_1'))

WebUI.setText(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/textarea_Uraian_uraian (1)'), 
    'cek12')

WebUI.setText(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/textarea_Deskripsi_longdesc (1)'), 
    'cek12')

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/span_Simpan dan Keluar'))

WebUI.closeBrowser()

