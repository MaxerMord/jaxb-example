package Book;

import jaxb.JAXBHelper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws Exception {

        Document document = Jsoup.connect("https://www.bookdepository.com/My-Life-Red-White-Arsene-Wenger/9781474618250?ref=grid-view").get();

        //System.out.println(document.outerHtml());

        Book book = new Book();
        book.setA1title(document.select("h1").text());
        book.setA2catagory(document.select("a.active").text());
        book.setA3descryption(document.select("div.item-excerpt.trunc").text());
        book.setA6product_details(document.select("ul.biblio-info").text());
        book.setA4type(document.select("ul.meta-info").text());
        book.setA5author(document.select("div.author-info").text());
        book.setAnnotation(document.select("div.item-annotation").text());
        book.setUrl("https://www.bookdepository.com/My-Life-Red-White-Arsene-Wenger/9781474618250?ref=grid-view");
        //System.out.println(book);
        JAXBHelper.toXML(book, System.out);

    }
}
