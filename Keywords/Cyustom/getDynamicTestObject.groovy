package Cyustom

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.annotation.Keyword

public class getDynamicTestObject {

	@Keyword
	def getDynamicTestObject(String tag, String attribute, String value) {
		TestObject to = new TestObject()
		String xpath = "//${tag}[@${attribute}='${value}']"
		to.addProperty("xpath", ConditionType.EQUALS, xpath)
		
	}
}