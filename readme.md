

#API Demos Automation Suite Information:-

##Testng File Description:
- testng.xml - define all parameters and tests.

##Packages Description:
* main: define all actions, dependencies and reusables methods.
* screens: define all screens needed for tests.
* utils: define all utils.
* features: define all scenario and features description to be tested.
* hooks: define hook file containing After and Before statement. 
* runner: define all runner class.
* stepdef: define all step definitions which are related to feature files.

### main/java/main descriptions:
* BaseClass: This class defines all the dependencies.
* Reusable: Include methods that can be used in others class like scroll,etc.

### main/java/screens descriptions:
* AccessibilityOptionScreen.java: It contains @AndroidFindBy and methods for accessibility services.
* AnimationOptionScreen.java: It contains @AndroidFindBy and methods for animation default layout.
* AppOptionScreen.java: It contains @AndroidFindBy and methods for custom title.
* GraphicsOptionScreen.java: It contains @AndroidFindBy and methods for animate drawables.
* NFCOptionScreen.java: It contains @AndroidFindBy and methods for foreground ndef push.
* OSOptionScreen.java: It contains @AndroidFindBy and methods for sms message.
* TextOptionScreen.java: It contains @AndroidFindBy and methods for log text box.

### main/java/utils description:
* Screenshot.java: define function for screenshot.
* ExcelReader.java: define function for getting data from excel.

## main/recources:
* log4j2.properties: defines log4j2 properties.

## test/java/features descriptions:
* AccessibilityOption.feature: It is feature file containing scenarios for accessibility services.
* AnimationOption.feature: It is feature file containing scenario for default layout animation.
* AppOption.feature: It is feature file containing scenario outlines for custom title.
* GraphicsOption.feature: It is feature file containing scenario for animate drawables.
* NFCOption.feature: It is feature file containing scenario for foreground ndef push.
* OSOption.feature: It is feature file containing scenario outlines for sms messaging.
* TextOption.feature: It is feature file containing scenario for log text box.
* WrongAssertionOption.feature: It is feature file containing scenario for Accessibility(wrong assertion).

## test/java/hooks descriptions:
* hook.java: This class defines @After, @Before.

## test/java/runner descriptions:
* TestRunner: This class defines @BeforeSuite, @AfterSuite, @AfterClass and cucumber option like feature, glue, tags, etc.

## test/java/stepdef descriptions:
* AccessibilityOption_StepDef: It defines Given,When, and Then for accessibility services.
* AnimationOption_StepDef: It defines Given,When, and Then for default layout animation.
* AppOption_StepDef: It defines Given,When, and Then for custom title.
* GraphicsOption_StepDef: It defines Given,When, and Then for animate drawable.
* NFCOption_StepDef: It defines Given,When, and Then for foreground ndef push.
* OSOption_StepDef: It defines Given,When, and Then for sms messaging.
* TextOption_StepDef: It defines Given,When, and Then for log text box.
* WrongAssertionOption_StepDef: It defines Given,When, and Then for sms messaging.

##test/resources:
* extent.properties: defines spark extent properties for spark report generation.
* extent-config.xml: defines extent properties for report generation.

##Reports and Screenshots:
* ExtentReport will be generated after run.
* TestNG report is generated as "ExtentReport.html".
* Screenshots will be taken while run.
