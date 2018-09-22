package example.specs

import example.pages.GooglePage

class GoogleSpec extends BaseSpec {

    def "validate google page by title"() {
        when:
        to GooglePage
        then:
        at GooglePage
    }

    /*
    then: "Bob is then taken to the search results page with search item"
    at SearchResultsPage
    isQueryParameterSet("keywords", searchKeyWord)
    searchResultsBar.getSearchText().equals(searchItem)

    when: "Bob sorts the results by #sortOrder"
    searchResultsBar.selectSortByOption(sortOrder)

    then: "the search results page should be updated according to the sort order"
    at SearchResultsPage
    isQueryParameterSet("sort", sortOptionUrl)

    //In the perfect world, we would have full control over the applicaiton under test, it would be running locally or on a build server,
    // which we then can setup data and test the sorting logic. The sorting logic would probably be in another service which handles search requests.

    where:
    searchItem  | searchKeyWord | sortOrder              | sortOptionUrl
    "iphone 6s" | "iphone+6s"   | "Featured"             | "featured-rank"
    "iphone 6s" | "iphone+6s"   | "Price: Low to High"   | "price-asc-rank"
    "iphone 6s" | "iphone+6s"   | "Price: High to Low"   | "price-desc-rank"
    "iphone 6s" | "iphone+6s"   | "Avg. Customer Review" | "smooth-review-rank"
    "iphone 6s" | "iphone+6s"   | "Newest Arrivals"      | "date-desc-rank"
    "iphone 6s" | "iphone+6s"   | "Newest Arrivals"      | "date-desc-rank"*/
}

