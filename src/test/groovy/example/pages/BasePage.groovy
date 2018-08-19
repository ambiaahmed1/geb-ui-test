package example.pages

import geb.Page


class BasePage extends Page{

    boolean isQueryParameterSet(String key, String value) {
        driver.currentUrl.contains("${key}=${value}")
    }

}
