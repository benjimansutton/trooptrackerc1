package com.benjiman.trooptracker.troops;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.NodeList;

// This method reads the data from an XML file and then returns a linkedlist list "List<trooper>".
public class TrooperList {

  public List<Trooper> getTrooperFromXML() {
    List<Trooper> list = new LinkedList<Trooper>();

    try {
      // locates the XML file
      Path filePath = Paths.get("src/main/java/com/benjiman/trooptracker/troops.xml");
      File file = new File(String.valueOf(filePath.toAbsolutePath()));

      if (file.exists()) {
        DocumentBuilderFactory DocumentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(String.valueOf(filePath.toAbsolutePath()));

        // Gets the elements "Name" and "Numbers" from the troops.xml file and add them
        // to a node list
        NodeList[] player = { document.getElementsByTagName("name"), document.getElementsByTagName("number"),
            document.getElementsByTagName("percentage") };

        // For loop for getting the information from the node list and collect the
        // values "name" and "number"
        for (int i = 0; i < nodeList.getLength(); i++) {
          String name = Trooper[0].item(i).getTextContent();
          int number = Integer.parseInt(Trooper[1].item(i).getTextContent());
          int percentage = Integer.parseInt(Trooper[2].item(i).getTextContent());
          Trooper newTrooper = new Trooper(name, number, percentage);

          // Then add the new trooper to the trooper list
          troopers.add(newTrooper);
        }
      } else {
        System.out.println("File not found.");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    // Returns the final set of troopers
    return troopers;
  }

}
