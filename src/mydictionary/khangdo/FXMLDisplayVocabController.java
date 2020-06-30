/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import mydictionary.khangdo.model.Definition;
import mydictionary.khangdo.model.Example;
import mydictionary.khangdo.model.Noun;
import mydictionary.khangdo.model.Pronunciation;
import mydictionary.khangdo.model.Verb;
import mydictionary.khangdo.model.Word;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class FXMLDisplayVocabController implements Initializable {

    @FXML
    private TextArea txtExample;

    @FXML
    private Label lblSynonymWord;

    private ArrayList<Word> wordList = new ArrayList<>();

    public Word setANewWord(String[] fields) {
        Pronunciation pron = new Pronunciation(fields[2]);

        Definition meaning = new Definition();
        meaning.setMeaning(fields[5]);

        ArrayList<String> collocation = new ArrayList<String>();
        collocation.add(fields[4]);
        meaning.setCollocation(collocation);

        ArrayList<Example> ex = new ArrayList<Example>();
        ArrayList<String> instance = new ArrayList<String>();
        instance.add(fields[8]);

        ex.add(new Example(instance));
        ArrayList<Definition> meanings = new ArrayList<Definition>();
        meanings.add(meaning);

        switch (fields[3]) {
            default:
            case "Noun":
                Noun noun = new Noun(fields[1], pron);
                noun.setMeanings(meanings);
                return noun;
//                break;
            case "Verb":
                Verb verb = new Verb(fields[1], pron);
                verb.setMeanings(meanings);
                return verb;
            
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        File fileName = new File("src/word-storage/newword.csv");
        if (fileName.exists()) {
            BufferedReader br;
            try {
                br = new BufferedReader(new FileReader("src/word-storage/newword.csv"));
                String line;
                String print = "";
                while ((line = br.readLine()) != null) {
                    String[] fields = line.split(",", -1);

                    print = setANewWord(fields).toString();
                }
                txtExample.setText(print);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
//        try {
//            if (fileName.exists()) {
//                Scanner scLine = new Scanner(fileName);
//                System.out.println(fileName.getName());
////                sc.useDelimiter("\t");
////                System.out.println(sc.hasNextLine());
////                while (sc.hasNextLine()) {
////                    Scanner scLine = new Scanner(sc.nextLine());
////                    System.out.println(sc.nextLine());
//                scLine.useDelimiter("\t");
//                System.out.println(scLine.hasNext());
//
//                while (scLine.hasNext()) {
//                    txtExample.setText(scLine.next());
//                    System.out.println(scLine.next());
//                }
////                    sc.close();
////                    System.out.println();
////                }
////                scLine.close();
//
//            }
//
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }

    }

}
