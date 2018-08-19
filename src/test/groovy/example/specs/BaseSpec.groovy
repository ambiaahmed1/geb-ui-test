package example.specs

import geb.spock.GebReportingSpec


class BaseSpec extends GebReportingSpec {


    def setup() {
        //this is where we can setup mocking services
    }

    def cleanup() {
        //this is where we can tear stuff down
    }


}
