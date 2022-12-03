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

Mobile.startApplication('C:\\Users\\ASUS\\Downloads\\app-release.apk', false)

Mobile.tap(findTestObject('Login-Android/Button-Akun'), 0)

Mobile.tap(findTestObject('Login-Android/android.widget.Button - Masuk'), 0)

Mobile.setText(findTestObject('Login-Android/android.widget.EditText - Masukkan email'), email, 2)

Mobile.setText(findTestObject('Login-Android/android.widget.EditText - Masukkan password'), password, 2)

Mobile.tap(findTestObject('Login-Android/android.widget.icon - Masukk'), 0)

Mobile.verifyElementVisible(findTestObject('Login-Android/android.widget.Verify'), 0)

Mobile.tap(findTestObject('Login-Android/android.widget.icon - Keluar'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

