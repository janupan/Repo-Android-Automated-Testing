import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('/Users/januaripanjaitan/git/Android-Automation-Testing/Android Apk/Polisi110-v0112-staging-11072018.apk', true)

Mobile.tap(findTestObject('android.widget.TextView3 - Login (96)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Email (96)'), 'fajar2@mailinator.com', 0)

Mobile.setText(findTestObject('android.widget.EditText1 (110)'), 'fajar1234', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.TextView1 - Login (97)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView1 (23)'), 0)

Mobile.tap(findTestObject('android.widget.TextView1 - Maps'), 0)

Mobile.tap(findTestObject('android.widget.MultiAutoCompleteTextView0 - Search anything here (5)'), 0)

Mobile.setText(findTestObject('android.widget.MultiAutoCompleteTextView0 - Search anything here (5)'), 'upload video', 0)

Mobile.tap(findTestObject('android.widget.ImageButton0 (19)'), 0)

Mobile.tap(findTestObject('android.widget.TextView13 - Confirm (2)'), 0)

Mobile.closeApplication()

