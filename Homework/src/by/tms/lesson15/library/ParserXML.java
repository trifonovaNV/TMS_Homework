package by.tms.lesson15.library;

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
import java.util.ArrayList;
import java.util.List;

public class ParserXML {
    public static void start(Library library) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("src/by/tms/lesson15/library/library.xml");
//            fillLibrary(document);
            Viewer.actions.add("Result of validation:" + validateXMLSchema("src/by/tms/lesson15/library/library.xsd", "src/by/tms/lesson15/library/library.xml") + "\n");

            Node root = document.getDocumentElement();

            NodeList books = root.getChildNodes();
            for (int i = 0; i < books.getLength(); i++) {
                Node book = books.item(i);

                if (book.getNodeType() != Node.TEXT_NODE) {
                    Book newBook = new Book();
                    newBook.setID(Integer.parseInt(book.getAttributes().getNamedItem("ID").getNodeValue()));
                    NodeList bookProps = book.getChildNodes();

                    for (int j = 0; j < bookProps.getLength(); j++) {
                        Node bookProp = bookProps.item(j);

                        if (bookProp.getNodeType() != Node.TEXT_NODE) {
                            switch (bookProp.getNodeName()) {
                                case "Name":
                                    newBook.setName(bookProp.getFirstChild().getTextContent());
                                    break;
                                case "Author":
                                    newBook.setAuthor(bookProp.getFirstChild().getTextContent());
                                    break;
                                case "IsAvailable":
                                    newBook.setAvailable(Boolean.parseBoolean(bookProp.getFirstChild().getTextContent()));
                                    break;
                                case "IsOnlyReadingRoom":
                                    newBook.setOnlyReadingRoom(Boolean.parseBoolean(bookProp.getFirstChild().getTextContent()));
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                    library.addBook(newBook);
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            ex.printStackTrace(System.out);
        }
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

    public static void fillLibrary(Document document) {
        List<Book> listOfBooks = new ArrayList<>();

        listOfBooks.add(new Book("Harry Potter", "J.K. Rowling", true, false));
        listOfBooks.add(new Book("The Adventures of Sherlock Holmes ", "Arthur Conan Doyle", true,
                false));
        listOfBooks.add(new Book("Three Men in a Boat", "Jerome K. Jerome", true, false));
        listOfBooks.add(new Book("Jane Eyre", "Charlotte Bronte", true, true));
        listOfBooks.add(new Book("Bridget Jones’ Diary", "Helen Fielding", true, false));
        listOfBooks.add(new Book("To Kill a Mockingbird", "Harper Lee", true, false));
        listOfBooks.add(new Book("Hitchhiker’s Guide to the Galaxy ", "Douglas Adams", true,
                true));

        for (Book book : listOfBooks) {
            Element newBook = document.createElement("Book");
            newBook.setAttribute("ID", String.valueOf(book.getID()));

            Element name = document.createElement("Name");
            name.setTextContent(book.getName());

            Element author = document.createElement("Author");
            author.setTextContent(book.getAuthor());

            Element isAvailable = document.createElement("IsAvailable");
            isAvailable.setTextContent(String.valueOf(book.isAvailable()));

            Element isOnlyReadingRoom = document.createElement("IsOnlyReadingRoom");
            isOnlyReadingRoom.setTextContent(String.valueOf(book.isOnlyReadingRoom()));

            newBook.appendChild(name);
            newBook.appendChild(author);
            newBook.appendChild(isAvailable);
            newBook.appendChild(isOnlyReadingRoom);

            Node root = document.getDocumentElement();
            root.appendChild(newBook);
        }

        writeDocument(document);
    }

    private static void writeDocument(Document document) throws TransformerFactoryConfigurationError {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer tr = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            FileOutputStream fos = new FileOutputStream("src/by/tms/lesson15/library/library.xml");
            StreamResult result = new StreamResult(fos);
            tr.transform(source, result);
        } catch (TransformerException | IOException e) {
            e.printStackTrace(System.out);
        }
    }
}