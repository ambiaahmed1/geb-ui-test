package example.module

class SearchBoxModule extends BaseModule{


    static content = {
        searchBox(wait:true) { $('#twotabsearchtextbox') }
        searchButton(wait:true) { $('#nav-search > form > div.nav-right > div > input') }
    }

    void enterSearchText(String searchText) {
        searchBox.value(searchText)
    }

    void searchButtonIsClicked() {
        searchButton.click()
    }
}
