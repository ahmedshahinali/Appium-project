# Appium-project
#appium #application #automation #AndroidDriver #sendKeys #MobileCapabilityType #uiautomatorviewer

•	Get java jdk 8 
•	Install java jdk 
•	Command (java –version)
•	Set java home in environment JAVA_HOME
•	Get android studio 
•	Make new project in the android studio empty activity 
•	Set android home in environment ANDREOID_HOME
•	User/-/appdata/local/android/sdk
•	And the path /sdk/platform-tools
•	Command (adb)
•	Make a device in the android studio 
•	Get node.js
•	Install nodejs
•	Set node home in environment NODE_HOME
•	Add path \node_modules\npm\bin
•	Command (node --version)
•	Command (npm  --version )
•	npm install -g npm   (can be used )
•	Command (npm install appium -g)
•	sdkmanager  --list 
uiautomatorviewer 

•	to get the opened application package /activity use the below in command line 
adb shell "dumpsys window | grep -E mCurrentFocus 

sdkmanager – -list 








•	driver.findElement(MobileBy.AccessibilityId("Content-desc")).click();
to open the application that are installed on the mobile using content-desc

•	driver.findElement(By.id("resource-id")).click();
to click on a button using the resource id 

•	driver.findElement(By.xpath("//class[@index='0']")).sendKeys("em@email.com");
to send text using the class and any other attribute this is the xpath syntax 


