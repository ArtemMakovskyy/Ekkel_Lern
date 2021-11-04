package Quastion.Fabrica.Patterns.AbstractFactory.Builder;
//https://www.youtube.com/watch?v=63_ExLjusac
public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriceWebsiteBuilder());
        WebSite webSite = director.buildWebsite();
        System.out.println(webSite);
    }
}
