/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class FXMLDisplayVocabController implements Initializable {
    
    @FXML
    private TextArea txtExample;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        File fileName = new File("src/word-storage/newword.csv");

        try {
            if (!fileName.exists()) {
                Scanner scLine = new Scanner(fileName);
                while (scLine.hasNextLine()) {
                    Scanner sc = new Scanner(scLine.nextLine());
                    while (sc.hasNext()) {
                        txtExample.setText(sc.next());
                        System.out.println(sc.next());
                    }
//                    System.out.println();
                }
            }
        } catch (Exception e) {
            
        }
    }

}
