/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

import java.util.ArrayList;

/**
 * A abstract class to define a new word in a dictionary
 * @author Khang Do, 2020
 */
public abstract class Word {
    private String word;
    private Pronunciation pron;
    private ArrayList<Definition> meanings;
    private Frequency freq;
    private ArrayList<Word> synonym;
    private ArrayList<Word> antonym;
    private ArrayList<Word> relatedForm;
}
