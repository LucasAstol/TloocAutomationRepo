package com.baseSetup;

import java.util.Locale;


public class DriverHelper {
	
		private static String osName = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
		private static String osArch = System.getProperty("os.arch").toLowerCase(Locale.ENGLISH);
		private static final String GECKO_DRIVER_PATH = "src/main/resources/geckoDrivers/";
		private static final String CHROME_DRIVER_PATH = "src/main/resources/chromeDrivers/";
		
		//DEPRECATED - Used previously for choosing the correct driver based on machine configuration
		public void setFirefoxDriverPath () {
			switch (osName) {
			case "linux":
				if(osArch.contains("64")) {
					System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_PATH+"linux64/geckodriver");
				} else {
					System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_PATH+"linux32/geckodriver");
				}			
				break;
			case "windows":
				if(osArch.contains("64")) {
					System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_PATH+"win64/geckodriver");
				} else {
					System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_PATH+"win32/geckodriver");
				}			
				break;
			default:
				System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_PATH+"macos/geckodriver");
				break;
			}
		}

		//DEPRECATED - Used previously for choosing the correct driver based on machine configuration
		public void setChromeDriverPath() {
			
			switch (osName) {
			case "linux":
				System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH+"linux64/chromedriver");			
				break;
			case "windows":
				System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH+"win32/chromedriver");			
				break;
			default:
				System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH+"macos/chromedriver");
				break;
			}
		}
			
}
