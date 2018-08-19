package example.pages

import example.modules.SearchBoxModule
import example.modules.SearchResultsBarModule
import example.modules.SideBarModule

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
