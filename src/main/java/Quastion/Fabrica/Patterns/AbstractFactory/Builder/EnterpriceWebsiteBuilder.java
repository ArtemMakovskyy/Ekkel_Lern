package Quastion.Fabrica.Patterns.AbstractFactory.Builder;

public class EnterpriceWebsiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprice Card");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}
