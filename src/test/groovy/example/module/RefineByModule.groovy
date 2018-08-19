package example.module


class RefineByModule extends BaseModule {

    static content = {
        brandsList(wait:true) { $('#leftNavContainer > ul:nth-child(10) > div') }
        //:( would be better to use Id but there is none.
    }

    void selectBrand(String brandName) {
//        brandsList.find{
//            it.value(brandName)
//        }
//        brandsList.children().find{it.text().equals("Apple")}.find("img").click()
        brandsList.children().find{it.text().equals("Apple")}.click()
    }



}
