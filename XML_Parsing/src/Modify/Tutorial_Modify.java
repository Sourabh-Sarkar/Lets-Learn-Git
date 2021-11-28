package Modify;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Tutorial_Modify {
	 public static void main(String args[]) throws TransformerFactoryConfigurationError, TransformerException
	 {
		 File f= new File("/home/user/Desktop/input.xml");
		 try {
			Document doc= 
					 DocumentBuilderFactory.newInstance().
					 newDocumentBuilder().parse(f);
			
			Node supercar=doc.getElementsByTagName("supercars").item(0);
			
			//Update attribute of supercar
			NamedNodeMap attr = supercar.getAttributes();
			Node nodeAttr = attr.getNamedItem("company");
			nodeAttr.setTextContent("Lamborigini");
			
			//Looping into child node
			NodeList childnode=supercar.getChildNodes();
			for(int i=0;i<childnode.getLength();i++)
			{
				Node carname = childnode.item(i);
				if (carname.getNodeType() == Node.ELEMENT_NODE)
				{
					Element eElement = (Element) carname;
					   if ("carname".equals(eElement.getNodeName())) {
			                  if("Ferrari 101".equals(eElement.getTextContent()) || 
			                		  carname.getAttributes().getNamedItem("type").getTextContent().equalsIgnoreCase("formula one")) 
			                     eElement.setTextContent("Lamborigini 001");
			                  
			                  if("Ferrari 202".equals(eElement.getTextContent())|| 
			                		  carname.getAttributes().getNamedItem("type").getTextContent().equalsIgnoreCase("sports"))
			                     eElement.setTextContent("Lamborigini 002");
			               }
				}
			}
			
			//Deleting luxurycars node
			Node cars = doc.getFirstChild();
			NodeList childNodes = cars.getChildNodes();
	         for(int count = 0; count < childNodes.getLength(); count++) {
	            Node node = childNodes.item(count);
	            
	            if("luxurycars".equals(node.getNodeName()))
	               cars.removeChild(node);
	         }
	         writeXml(doc, "/home/user/Desktop/output.xml");
		}
		 catch (SAXException | IOException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	 
	 private static void writeXml(Document doc,
             String path) throws TransformerFactoryConfigurationError, TransformerException
	 {
		 DOMSource source = new DOMSource(doc);
		 StreamResult consoleResult = new StreamResult(System.out);
		 Transformer transformer =TransformerFactory.newInstance().newTransformer();
		 StreamResult result = new StreamResult(new File(path));
		 
		 transformer.transform(source, consoleResult);
		 transformer.transform(source, result);
	 }
}
