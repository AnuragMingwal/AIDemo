import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable



println("##################################Test Case STARTED#######################")
WebUI.openBrowser('')

WebUI.navigateToUrl('https://practicetestautomation.com/practice-test-login/')

// Enter username
WebUI.waitForElementVisible(findTestObject('Object Repository/Login Page/input_username'), GlobalVariable.G_Timeout)
WebUI.setText(findTestObject('Object Repository/Login Page/input_username'), 'student')

// Enter password
WebUI.waitForElementVisible(findTestObject('Object Repository/Login Page/input_password'), GlobalVariable.G_Timeout)
WebUI.setText(findTestObject('Object Repository/Login Page/input_password'), 'Password123')

// Click submit button
WebUI.waitForElementClickable(findTestObject('Object Repository/Login Page/button_submit'), GlobalVariable.G_Timeout)
WebUI.click(findTestObject('Object Repository/Login Page/button_submit'))

// Verify success message
WebUI.waitForElementVisible(findTestObject('Object Repository/Logged In Page/text_success_message'), GlobalVariable.G_Timeout)
WebUI.verifyElementPresent(findTestObject('Object Repository/Logged In Page/text_success_message'), GlobalVariable.G_Timeout)

// Verify logout button
WebUI.waitForElementVisible(findTestObject('Object Repository/Logged In Page/button_logout'), GlobalVariable.G_Timeout)
WebUI.verifyElementPresent(findTestObject('Object Repository/Logged In Page/button_logout'), GlobalVariable.G_Timeout)

// Click on logout button
WebUI.click(findTestObject('Object Repository/Logged In Page/button_logout'))

WebUI.closeBrowser()