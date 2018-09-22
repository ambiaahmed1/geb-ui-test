package example.pages

import example.modules.SearchBoxModule

class HomePage extends BasePage {

    static url = ""
    static at = {
        title.contains("Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more")

            searchBox.enterSearchText("test") == "test"

    }

    static content = {
        searchBox { module SearchBoxModule }
    }




}
