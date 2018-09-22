/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService
import org.openqa.selenium.os.ExecutableFinder

import static org.apache.commons.lang3.SystemUtils.IS_OS_LINUX
import static org.apache.commons.lang3.SystemUtils.IS_OS_MAC
import static org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS

File findDriverExecutable() {
    def defaultExecutable = new ExecutableFinder().find("chromedriver")
    if (defaultExecutable) {
        new File(defaultExecutable)
    } else {
        new File("drivers").listFiles().findAll {
            !it.name.endsWith(".version")
        }.find {
            if (IS_OS_LINUX) {
                it.name.contains("linux")
            } else if (IS_OS_MAC) {
                it.name.contains("mac")
            } else if (IS_OS_WINDOWS) {
                it.name.contains("windows")
            }
        }
    }
}

reportsDir = new File("target/geb-reports")
reportOnTestFailureOnly = true

//System.setProperty(“webdriver.gecko.driver”,”Path to geckodriver.exe”)

driver = {new ChromeDriver()}


driver = {
    ChromeDriverService.Builder serviceBuilder = new ChromeDriverService.Builder()
        .usingAnyFreePort()
        .usingDriverExecutable(findDriverExecutable())
    new ChromeDriver(serviceBuilder.build())
}

//baseUrl = "http://www.amazon.co.uk"
baseUrl = "https://www.google.com/"
//baseUrl = "http://gebish.org"
