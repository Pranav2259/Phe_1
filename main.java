import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

public class phe_task1 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(new File("C:\\Users\\PranavAggarwal\\Desktop\\example.xml"));
        doc.getDocumentElement().normalize();

        Element root = doc.getDocumentElement();
        System.out.println(root);
    }
}
