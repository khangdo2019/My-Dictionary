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
import java.util.Scanner;
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
    private Label lblSynonymWord, lblRelatedWord, lblWord, lblCollocation, lblDefinition;

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
        instance.add(fields[6]);

        ex.add(new Example(instance));
        meaning.setEx(ex);
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
        File fileName = new File("src/word-storage/newword.txt");
        if (fileName.exists()) {
            BufferedReader br;
            try {
                br = new BufferedReader(new FileReader("src/word-storage/newword.csv"));
                Scanner scLine = new Scanner(fileName);
                String line = "";
                ArrayList<String> print = new ArrayList<>();

                scLine.useDelimiter(System.getProperty("line.separator"));
                while (scLine.hasNextLine()) {
                    String newLine = scLine.nextLine();
//                    Scanner sc = new Scanner(newLine);
//                    System.out.println(newLine);
                    String[] fields = newLine.split("/", -1);
                    System.out.println(fields.length);
                    if (setANewWord(fields) instanceof Noun) {
                        Noun word = (Noun) setANewWord(fields);
                        System.out.println(word.getWord());
                        // lblWord, lblCollocation, lblDefinition
                        lblWord.setText(word.getWord() + " " + fields[2] + 
                                " " + fields[4]);
                        lblCollocation.setText(fields[5]);
                        lblDefinition.setText(fields[6]);
                        txtExample.setText(word.getMeanings().get(0).getEx()
                                .get(0).getInstances().get(0));
                        lblSynonymWord.setText(fields[7]);
                        lblRelatedWord.setText(fields[8]);
                    }
                    for (String list : fields) {
                        System.out.println(list);
                    }               
                }                

                Scanner scLine2 = new Scanner(new File("src/word-storage/newword.csv"));
                while (scLine.hasNextLine()) {
                    String[] fields1 = scLine2.nextLine().split("\t");
                    System.out.println(fields1[0]);
                }
                scLine.close();
                
//                for (String list: print) {
//                    System.out.println(list);
//                }
//                System.out.println(print.get(0));
//                line = br.readLine();
//                while (line != "" && line != null) {
////
//////                    System.out.println(print);
//////                    print = "";
//////                    String[] list = new String[9];
//                    String[] fields1 = line.split("\t", -1);
//                    System.out.println(fields1.length + " " + fields1[0]);
////
//////                    print += setANewWord(fields).toString();
//                }
//                txtExample.setText(print);
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
