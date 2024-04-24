package co.bellota.generateofexceltoxml;

import java.io.IOException;
import org.jdom2.JDOMException;
/**
 *
 * @author rcuayal
 */
public class GenerateOfExcelToXML {

    public static void main(String[] args) throws JDOMException, IOException {
        System.out.println("Inicio de la conversion");
        ConvertToXML convertToXml = new ConvertToXML();
        convertToXml.convertOfExcelToXML();
        convertToXml.almacenarXml();
        // convertToXml.convertOfCSVToXML();
        // convertToXml.almacenarXMLOfCSV();

        System.out.println("Fin de la conversion");
    }
}
