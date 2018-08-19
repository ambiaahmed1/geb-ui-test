package example.pages

import modules.SearchBoxModule

class HomePage extends BasePage {

    static url = ""
    static at = {
        title.contains("Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more")
    }

    static content = {
        searchBox { module SearchBoxModule }
    }




}
