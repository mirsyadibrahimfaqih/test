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

WebUI.setText(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_61d5e8 (12)'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Financial Integrated Applications - N_61d5e8_1 (12)'), 
    'RAIVpflpDOg=')

WebUI.clickOffset(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/span_Sign In_p-ink p-ink-active (11)'), 
    0, 0)

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/div_Contract Management (11)'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Back to Landing Page_topbar-menubutt_f8f723 (11)'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/a_Tanpa Kontrak (4)'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/td_3657 (1)'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Edit (1)'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Baru (9)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/button_ (8)'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/div_241A00 Pendapatan TL komponen A - Common'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/a_Pencarian PRK'))

WebUI.clickOffset(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/button_ (8)'), 0, 
    0)

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/td_PJB2 (4)'))

WebUI.clickOffset(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Pilih'), 0, 
    0)

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/span_Pembebanan_p-button-icon pi pi-search'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/button_ (8)'))

WebUI.doubleClick(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/td_ABL311013259960F101'))

WebUI.setText(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/textarea_Uraian_uraian'), 
    'cek')

WebUI.setText(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/textarea_Deskripsi_longdesc'), 
    'cek')

WebUI.setText(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Satuan_satuan'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Jumlah_jumlah'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Jumlah_jumlah'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Harga Satuan_hrgSatuan'))

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Batas Waktu_ng-tns-c83-35 p-inputtext_671912'))

WebUI.clickOffset(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/span_Sa_p-ink p-ink-active'), 
    0, 0)

WebUI.setText(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/input_No OA_noOa'), '1')

WebUI.setText(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Batas Waktu_ng-tns-c83-35 p-inputtext_671912'), 
    '')

WebUI.clickOffset(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/input_Batas Waktu_ng-tns-c83-35 p-inputtext_671912'), 
    0, 0)

WebUI.clickOffset(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/span_Sa_p-ink p-ink-active_1'), 
    0, 0)

WebUI.setText(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/input_User_userOa'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_FinUP (Financial Integrated Applicatio_e626e9/button_Simpan dan Keluar (5)'))

WebUI.closeBrowser()

