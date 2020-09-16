package by.tms.lesson13;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Runner {
    /*
    Создать xml-файл, хранящий информацию об объектах предметной области ниже. Для валидации полученного xml-файла необходимо разработать соответствующую xsd схему.
1. Общие требования:
- Простые и комплексные типы
- Шаблоны и предельные значения
- Обязательно использование атрибутов и типа ID
- Задание атрибутов по умолчанию
2. Произвести проверку XML-документа с помощью XSD.
3. Предметная область:
Компьютерные комплектующие:
- Name - название комплектующего
- Origin - страна производства
- Price - цена (0 - n USD)
- Type (должно быть несколько)
- периферийное либо нет, энергопотребление (ватт), наличие кулера( есть или нет),
 группа комплектующих (устройства ввода-вывода, мультимедийные), порты (COM, USB, LPT)
- Critical - критично ли наличие комплектующего для работы компьютера.
Корневой элемент назвать Devices
     */
    public static void main(String[] args) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("src/by/tms/lesson13/devices.xml");
            addNewDevice(document);
            Node root = document.getDocumentElement();
            System.out.println("Devices:");
            NodeList devices = root.getChildNodes();
            for (int i = 0; i < devices.getLength(); i++) {
                Node device = devices.item(i);
                if (device.getNodeType() != Node.TEXT_NODE) {
                    NodeList deviceProps = device.getChildNodes();
                    for (int j = 0; j < deviceProps.getLength(); j++) {
                        Node deviceProp = deviceProps.item(j);
                        if (deviceProp.getNodeType() != Node.TEXT_NODE) {
                            int childsLength = 0;
                            System.out.print(deviceProp.getNodeName() + ":");
                            for (int k = 0; k < (childsLength = deviceProp.getChildNodes().getLength()); k++) {
                                if (childsLength > 1 && deviceProp.getChildNodes().item(k).getNodeType() != Node.TEXT_NODE) {
                                    System.out.print(deviceProp.getChildNodes().item(k).getNodeName() + " = " +
                                            deviceProp.getChildNodes().item(k).getTextContent() + ", ");
                                } else {
                                    System.out.print(deviceProp.getChildNodes().item(k).getTextContent());
                                }
                            }
                            System.out.println();
                        }
                    }
                    System.out.println();
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            ex.printStackTrace(System.out);
            return;
        }

        System.out.println("Result of validation:" + validateXMLSchema("src/by/tms/lesson13/devices.xsd", "src/by/tms/lesson13/devices.xml"));
    }

    public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
        return true;
    }

    public static void addNewDevice(Document document) {
        Type typeOfDevice = new Type();
        typeOfDevice.setPeripheral(false);
        typeOfDevice.setEnergyConsumption(40);
        typeOfDevice.setHasCooler(true);
        typeOfDevice.setGroupOfComponents("multimedia devices");
        typeOfDevice.setHasCooler(true);
        typeOfDevice.setPorts("USB");

        Device newDevice = new Device();
        newDevice.setName("new Device");
        newDevice.setOrigin("USA");
        newDevice.setPrice(1200);
        newDevice.setType(typeOfDevice);
        newDevice.setCritical(false);

        Element device = document.createElement("Device");
        device.setAttribute("ID", "a" + (new Random().nextInt(89) + 10));
        device.setAttribute("Batch", String.valueOf(new Random().nextInt(899999) + 100000));

        Element type = document.createElement("Type");

        Element name = document.createElement("Name");
        name.setTextContent(newDevice.getName());

        Element origin = document.createElement("Origin");
        origin.setTextContent(newDevice.getOrigin());

        Element price = document.createElement("Price");
        price.setTextContent(String.valueOf(newDevice.getPrice()));

        Element peripheral = document.createElement("Peripheral");
        peripheral.setTextContent(String.valueOf(newDevice.getType().isPeripheral()));

        Element energy = document.createElement("Energy");
        energy.setTextContent(String.valueOf(newDevice.getType().getEnergyConsumption()));

        Element cooler = document.createElement("Cooler");
        cooler.setTextContent(String.valueOf(newDevice.getType().isHasCooler()));

        Element group = document.createElement("Group");
        group.setTextContent(newDevice.getType().getGroupOfComponents());

        Element ports = document.createElement("Ports");
        ports.setTextContent(newDevice.getType().getPorts());

        Element critical = document.createElement("Critical");
        critical.setTextContent(String.valueOf(newDevice.isCritical()));

        type.appendChild(peripheral);
        type.appendChild(energy);
        type.appendChild(cooler);
        type.appendChild(group);
        type.appendChild(ports);

        device.appendChild(name);
        device.appendChild(origin);
        device.appendChild(price);
        device.appendChild(type);
        device.appendChild(critical);

        Node root = document.getDocumentElement();
        root.appendChild(device);

        writeDocument(document);
    }

    private static void writeDocument(Document document) throws TransformerFactoryConfigurationError {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer tr = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            FileOutputStream fos = new FileOutputStream("src/by/tms/lesson13/devices.xml");
            StreamResult result = new StreamResult(fos);
            tr.transform(source, result);
        } catch (TransformerException | IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
