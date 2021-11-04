package Quastion.Fabrica.Patterns.AbstractFactory.Builder;

public abstract class WebSiteBuilder {
    WebSite webSite;
    void createWebsite(){
        webSite = new WebSite();
    }
    abstract void  buildName();
    abstract void  buildCms();
    abstract void  buildPrice();

    WebSite getWebSite(){
        return webSite;
    }

}
