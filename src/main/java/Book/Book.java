package Book;

import lombok.Data;

import javax.swing.*;
import javax.xml.bind.Element;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URL;
import java.util.List;

@XmlRootElement
@Data
public class Book {
    //@XmlAttribute
    private String url;
    private String a1title;
    private String a2catagory;
    private String a3descryption;
    private String a4type;
    private String a5author;
    private String a6product_details;
    private String a7prize;
    private String annotation;

}
