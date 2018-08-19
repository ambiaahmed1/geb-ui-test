package example.modules

import geb.waiting.WaitTimeoutException

class SideBarModule extends BaseModule{

    static content = {
        brandsList(wait:true) { $('#leftNavContainer > ul:nth-child(10) > div') }
        brandsListAlt(wait:true) { $('#ref_1632651031') }
        //:( would be better to use Id but there is none.
    }

    //Another mvt which means different selectors being used each time... I shouldnt need to do this, it's ugly as fuck.
    void selectBrand(String brandName) {

        try{
            brandsList.children().find{it.text().equals(brandName)}.click()

        } catch(WaitTimeoutException e) {
            brandsListAlt.children().find{it.text().equals(brandName)}.find("img").click()
        }
    }

}
