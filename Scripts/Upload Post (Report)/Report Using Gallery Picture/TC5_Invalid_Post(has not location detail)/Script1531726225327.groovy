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

Mobile.startApplication('C:\\Users\\RIKKY\\git\\Repo-Sumsel\\Android Apk\\app-dev-debug (5).apk', true)

Mobile.tap(findTestObject('android.widget.TextView3 - Login (26)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Email (27)'), 'fajar2@mailinator.com', 0)

Mobile.setText(findTestObject('android.widget.EditText1 (26)'), 'fajar1234', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.TextView1 - Login (27)'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton0 (36)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView1 (37)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView3 (77)'), 0)

Mobile.tap(findTestObject('android.widget.TextView1 - Confirm (4)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Please write down your description (1)'), 'hasn\'t location detail', 
    0)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Element Report/android.widget.LinearLayout2'), 0)

Mobile.scrollToText('Select Label', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView6 - Select Label (1)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView4 (6)'), 0)

Mobile.tap(findTestObject('android.widget.TextView9 - Confirm Label (1)'), 0)

Mobile.tap(findTestObject('android.widget.TextView6 - Confirm (1)'), 0)

Mobile.closeApplication()

