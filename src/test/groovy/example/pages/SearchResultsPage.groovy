package example.pages

import modules.SearchBoxModule
import modules.SearchResultsBarModule
import modules.SideBarModule

class SearchResultsPage extends BasePage {

    static url = ''

    static at = { title.contains("Amazon.co.uk:")
    }

    static content = {
        searchBox { module SearchBoxModule }
        searchResultsBar { module SearchResultsBarModule }
        sideBar { module SideBarModule }
    }

}
