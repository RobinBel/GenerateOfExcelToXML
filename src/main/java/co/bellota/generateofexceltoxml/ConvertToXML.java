/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.bellota.generateofexceltoxml;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
/**
 *
 * @author rcuayal
 */
public class ConvertToXML {
    
    private static String PATH_EXCEL = "plantilla.xlsx";
    private static String PATH_CSV = "plantilla.csv";
    private static final String PATH_XML = "ProductPlantilla.xml";

    
    private Document document;
//    private static InputStream xmlInputStream;
    private static SAXBuilder builder = new SAXBuilder();
    private Element rootElement;
    private Element envelopeElement;
    public ConvertToXML() throws JDOMException, IOException{

        document = new Document();
        rootElement = new Element("DTE");
        rootElement.setAttribute("version", "1.0");
        document.setRootElement(rootElement);
        envelopeElement = new Element("Envelope");
        rootElement.addContent(envelopeElement);
    }
    
    public void convertOfCSVToXML(){
        try (Reader reader = new FileReader(PATH_CSV);
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)) {
                List <String> cabeceras = new ArrayList<>();
                boolean isCabecera = true;
                String cabecera, valor;
                int j = 0;

            for (CSVRecord csvRecord : csvParser) {
                // Itera a través de las columnas de cada fila
                j= 0;
                for (String column : csvRecord) {
                    if(isCabecera){                        
                        cabeceras.add(column);
                        
                    }
                    else{
                        cabecera = cabeceras.get(j);
                        j++;
                        valor = column;
                        System.out.println("Cabecera: " + cabecera + " Valor: " + valor);
                    }
                }
                isCabecera = false;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public void convertOfExcelToXML(){
        try {
            // Abre el archivo de Excel
            InputStream archivoExcel = new FileInputStream(PATH_EXCEL);
            
            // Crea un libro de trabajo (workbook) a partir del archivo de Excel
            Workbook libroExcel = new XSSFWorkbook(archivoExcel);
            
            // Obtiene la primera hoja del libro de trabajo
            Sheet hoja = libroExcel.getSheetAt(0);
            String cabecera, valor, data;
            List<String> cabeceras = new ArrayList<>() ;
            boolean isCabecera = true;
            int j = 0;
            
            // Itera a través de las filas de la hoja
            for (Row fila : hoja) {
                // Itera a través de las celdas de la fila
                
                Product product = new Product();
                j= 0;
                //realizar un for para recorrer las cabeceras por indice
                for (Cell celda : fila) {
                    if(isCabecera){                        
                        cabeceras.add(celda.toString());
                        
                    }
                    else{
                        cabecera = cabeceras.get(j);
                        j++;
                        valor = celda.toString();
                        product.selectCampo(cabecera, valor);
                    }
                }
                isCabecera = false;
                addProduct(product);
            }
            // Cierra el archivo de Excel
            archivoExcel.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String  getXml(){
        XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
        String xmlString = xmlOutputter.outputString(document);
        return xmlString;
    }
    
    public String setValuesXml(){
        return null;
    }

    public void addProduct(Product product){
        Element itemElement = new Element("Item");
        itemElement.setAttribute("priority", "6");
        itemElement.setAttribute("actionType", "Create");
        itemElement.addContent(new Element("itemCode").setText(product.getItemCode()));
        itemElement.addContent(new Element("description").setText(product.getDescription()));
        itemElement.addContent(new Element("extraDescription").setText(product.getExtraDescription()));
        itemElement.addContent(new Element("typeCode").setText(product.getTypeCode()));
        itemElement.addContent(new Element("classCode").setText(product.getClassCode()));
        itemElement.addContent(new Element("stockingUOM").setText(product.getStockingUOM()));
        itemElement.addContent(new Element("lotControlledInd").setText(product.getLotControlledInd()));
        itemElement.addContent(new Element("actualMaterialUpdateCode").setText(product.getActualMaterialUpdateCode()));
        itemElement.addContent(new Element("taxCode").setText(product.getTaxCode()));
        itemElement.addContent(new Element("groupSalesAnalysisRef1").setText(product.getGroupSalesAnalysisRef1()));
        itemElement.addContent(new Element("groupSalesAnalysisRef2").setText(product.getGroupSalesAnalysisRef2()));
        itemElement.addContent(new Element("groupSalesAnalysisRef3").setText(product.getGroupSalesAnalysisRef3()));
        itemElement.addContent(new Element("groupSalesAnalysisRef4").setText(product.getGroupSalesAnalysisRef4()));
        itemElement.addContent(new Element("groupSalesAnalysisRef5").setText(product.getGroupSalesAnalysisRef5()));
        itemElement.addContent(new Element("masterScheduledInd").setText(product.getMasterScheduledInd()));
        itemElement.addContent(new Element("leadTimeDays").setText(product.getLeadTimeDays()));
        itemElement.addContent(new Element("firstDemandCode").setText(product.getFirstDemandCode()));
        itemElement.addContent(new Element("secondDemandCode").setText(product.getSecondDemandCode()));
        itemElement.addContent(new Element("minBalanceQty").setText(product.getMinBalanceQty()));
        itemElement.addContent(new Element("MedidaLote").setText(product.getMedidaLote()));
        itemElement.addContent(new Element("incrementalOrderQty").setText(product.getIncrementalOrderQty()));
        itemElement.addContent(new Element("orderPolicy").setText(product.getOrderPolicy()));
        itemElement.addContent(new Element("controlDate2LeadTime").setText(product.getControlDate2LeadTime()));
        itemElement.addContent(new Element("controlDate3LeadTime").setText(product.getControlDate3LeadTime()));
        itemElement.addContent(new Element("controlDate4LeadTime").setText(product.getControlDate4LeadTime()));
        itemElement.addContent(new Element("abcInventoryCode").setText(product.getAbcInventoryCode()));
        itemElement.addContent(new Element("purchasingUnitCode").setText(product.getPurchasingUnitCode()));
        itemElement.addContent(new Element("sellingUOM").setText(product.getSellingUOM()));
        itemElement.addContent(new Element("groupTechnologyCode").setText(product.getGroupTechnologyCode()));
        itemElement.addContent(new Element("bracketGroupCode").setText(product.getBracketGroupCode()));
        itemElement.addContent(new Element("primaryVendorCode").setText(product.getPrimaryVendorCode()));
        itemElement.addContent(new Element("secondaryVendorCode").setText(product.getSecondaryVendorCode()));
        itemElement.addContent(new Element("countryOfOriginCode").setText(product.getCountryOfOriginCode()));
        itemElement.addContent(new Element("maxInventoryQty").setText( product.getMaxInventoryQty()));
        itemElement.addContent(new Element("horizonDays").setText(product.getHorizonDays()));
        itemElement.addContent(new Element("requirementsCode").setText(product.getRequirementsCode()));
        itemElement.addContent(new Element("dailyLeadTimeRate").setText(product.getDailyLeadTimeRate()));
        itemElement.addContent(new Element("targetAnnualQty").setText(product.getTargetAnnualQty()));
        itemElement.addContent(new Element("minBalanceHorizonDays").setText(product.getMinBalanceHorizonDays()));
        itemElement.addContent(new Element("DiasExistencia").setText(product.getDiasExistencia()));
        itemElement.addContent(new Element("secondaryGroupRef").setText( product.getSecondaryGroupRef()));
        itemElement.addContent(new Element("packagingType").setText(product.getPackagingType()));
        itemElement.addContent(new Element("catalogNumberCode").setText(product.getCatalogNumberCode()));
        itemElement.addContent(new Element("pricingUOM").setText(product.getPricingUOM()));
        itemElement.addContent(new Element("dropShipAllowedInd").setText(product.getDropShipAllowedInd()));
        itemElement.addContent(new Element("controlDate5LeadTime").setText(product.getControlDate5LeadTime()));
        itemElement.addContent(new Element("unitsPerPallet").setText(product.getUnitsPerPallet()));
        itemElement.addContent(new Element("netNetWeightPerUnit").setText(product.getNetNetWeightPerUnit()));
        itemElement.addContent(new Element("weightPerUnit").setText(product.getWeightPerUnit()));
        itemElement.addContent(new Element("weightUOM").setText(product.getWeightUOM()));
        itemElement.addContent(new Element("length").setText(product.getLength()));
        itemElement.addContent(new Element("lengthUOM").setText(product.getLengthUOM()));
        itemElement.addContent(new Element("width").setText(product.getWidth()));
        itemElement.addContent(new Element("widthUOM").setText(product.getWidthUOM()));
        itemElement.addContent(new Element("height").setText(product.getHeight()));
        itemElement.addContent(new Element("heightUOM").setText(product.getHeightUOM()));
        itemElement.addContent(new Element("drawingOrFormulaCode").setText(product.getDrawingOrFormulaCode()));
        envelopeElement.addContent(itemElement);
        
    }
    
    public void almacenarXml(){
        try {
            // Especifica la ubicación del archivo XML en el que deseas almacenar el documento
            String rutaArchivo = "productsFormatXML.xml";

            // Crea un objeto XMLOutputter para formatear la salida XML
            XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());

            // Escribe el documento en el archivo XML
            xmlOutputter.output(document, new FileOutputStream(rutaArchivo));

            System.out.println("Documento XML guardado exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public void almacenarXMLOfCSV(){
        try {
            // Especifica la ubicación del archivo XML en el que deseas almacenar el documento
            String rutaArchivo = "productsFormatXML.xml";

            // Crea un objeto XMLOutputter para formatear la salida XML
            XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());

            // Escribe el documento en el archivo XML
            xmlOutputter.output(document, new FileOutputStream(rutaArchivo));

            System.out.println("Documento XML guardado exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
