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

WebUI.navigateToUrl('https://lapor.folkatech.com/')

WebUI.setText(findTestObject('Object Repository/Web Browser/Page_Lapor Folkatech - Login/input_Email_email'), 'admin@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Web Browser/Page_Lapor Folkatech - Login/input_Password_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Web Browser/Page_Lapor Folkatech - Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Web Browser/Page_Dashboard/h3_Dashboard'))

WebUI.click(findTestObject('Web Browser/Page_Dashboard/Page_Daftar Laporan/Page_Daftar Laporan/div_FAQ_icon icon-shape icon-sm shadow border-radius-md bg-white text-center me-2 d-flex align-items-center justify-content-center'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web Browser/Page_Daftar Laporan/select_102550100'), '25', true)

WebUI.setText(findTestObject('Object Repository/Web Browser/Page_Daftar Laporan/input_Search_form-control form-control-sm'), 
    '')

WebUI.click(findTestObject('Web Browser/Page_Daftar Laporan/button_Aksi'))

WebUI.click(findTestObject('Web Browser/Page_Daftar Laporan/a_Detail'))

WebUI.scrollToElement(findTestObject('Web Browser/Page_Detail Laporan/Page_Detail Laporan/textarea_Komentar Anda_comment'), 
    0)

WebUI.setText(findTestObject('Object Repository/Web Browser/Page_Detail Laporan/textarea_Komentar Anda_comment'), 'Test komen')

WebUI.click(findTestObject('Object Repository/Web Browser/Page_Detail Laporan/button_Submit'))

WebUI.click(findTestObject('Object Repository/Web Browser/Page_Detail Laporan/button_OK'))

WebUI.click(findTestObject('Object Repository/Web Browser/Page_Detail Laporan/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Web Browser/Page_Dashboard/img_Admin_img-fluid rounded-circle shadow'))

WebUI.click(findTestObject('Object Repository/Web Browser/Page_Dashboard/div_Logout'))

