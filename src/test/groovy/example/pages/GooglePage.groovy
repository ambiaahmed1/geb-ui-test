package example.pages

import example.modules.GoogleSearchBoxModule
import geb.Page

class GooglePage extends Page {
    static at = { title.startsWith("Google") }

    static content = {
        googleSearchBox{module GoogleSearchBoxModule}
    }
}
