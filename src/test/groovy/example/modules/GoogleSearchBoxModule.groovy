package example.modules

class GoogleSearchBoxModule extends BaseModule {

    static content = {
        googleSearchBox(wait:true) { $(id: 'lst-ib') }
        googleSearchButton(wait:true) { $('input.Google.Search') }

    }

    void googleEnterSearchText(String searchText) {
        googleSearchBox.value(searchText)
    }

    void googleSearchButtonIsClicked() {
        googleSearchButton.click()
    }

}
