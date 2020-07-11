/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

import java.util.ArrayList;

/**
 * A abstract class to define a new word in a dictionary
 *
 * @author Khang Do, 2020
 */
public abstract class Word implements Comparable<Word> {

    private String word;
    private Pronunciation pron;
    private ArrayList<Definition> meanings;
    private Frequency freq;
    private ArrayList<Word> synonym; //Synonym can be empty
    private ArrayList<Word> antonym; //Antonym can be empty
    private ArrayList<Word> relatedForm; //Word related form can be empty
    private ArrayList<Topic> topic;
    
    /**
     * A no-args constructor for a word
     */
    public Word() {

    }

    public Word(String word, Pronunciation pron, ArrayList<Definition> meanings,
            Frequency freq, ArrayList<Word> synonym, ArrayList<Word> antonym,
            ArrayList<Word> relatedForm) {
        setWord(word);
        setPron(pron);
        setMeanings(meanings);
        setFreq(freq);
    }
    
    public Word(String word, Pronunciation pron, ArrayList<Definition> meanings,
            Frequency freq) {
        setWord(word);
        setPron(pron);
        setMeanings(meanings);
        setFreq(freq);
    }

    /**
     * Gets the word
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * Sets the new word
     * @param word the word to set
     * @throws IllegalArgumentException when word is empty or null
     */
    public void setWord(String word) throws IllegalArgumentException{
        if (word != null && !word.trim().equals("")) {
            this.word = word;
        } else throw new IllegalArgumentException("The word cannot be empty"
                + "and null");        
    }

    /**
     * Gets the pronunciation of the word
     * @return the pronunciation
     */
    public Pronunciation getPron() {
        return pron;
    }

    /**
     * Sets the pronunciation of the word
     * @param pron the pron to set
     * @throws IllegalArgumentException when the pronunciation is empty or null
     */
    public void setPron(Pronunciation pron) throws IllegalArgumentException{
//        if (pron != null && (!pron.getBritish().trim().equals("") || 
//                !pron.getAmerican().trim().equals(""))) {
//            this.pron = pron;
//        } else throw new IllegalArgumentException("The pronunciation cannot be "
//                + "empty and null");
        this.pron = pron;
    }

    /**
     * Gets the definition of the word
     * @return the meanings
     */
    public ArrayList<Definition> getMeanings() {
        return meanings;
    }

    /**
     * Sets the definition of the word
     * @param meanings the meanings to set
     * @throws IllegalArgumentException when the definition is null or empty
     */
    public void setMeanings(ArrayList<Definition> meanings) throws 
            IllegalArgumentException{
        boolean checkEmpty = true;
        for (Definition list: meanings) {
            if (list.getMeaning().trim().equals("")) {
                checkEmpty = false;
            }
        }
        if (meanings != null && checkEmpty) {
            this.meanings = meanings;
        } else {
            throw new IllegalArgumentException("The Definition cannot be "
                    + "empty or null");
        }
        
    }

    /**
     * Gets the frequency of the word
     * @return the freq
     */
    public Frequency getFreq() {
        return freq;
    }

    /**
     * Sets the frequency of the word
     * @param freq the freq to set
     * @throws IllegalArgumentException when the frequency is null
     */
    public void setFreq(Frequency freq) throws IllegalArgumentException{
        if (freq != null) {
            this.freq = freq;
        } else throw new IllegalArgumentException("The frequency cannot be null");
        
    }

    /**
     * Gets the synonym of the word
     * @return the synonym
     */
    public ArrayList<Word> getSynonym() {
        return synonym;
    }

    /**
     * Sets the synonym of a word, a synonym can be null
     * @param synonym the synonym to set
     * @throws IllegalArgumentException when the synonym is empty if it's 
     * not null
     */
    public void setSynonym(ArrayList<Word> synonym) throws 
            IllegalArgumentException{
        if (synonym == null) {
            this.synonym = synonym;
        }
        boolean checkEmpty = true;
        for (Word list: synonym) {
            if (list.getWord().trim().equals("")) {
                checkEmpty = false;
            }
        }
        if (synonym != null && checkEmpty) {
            this.synonym = synonym;
        }else throw new IllegalArgumentException("Synonym cannot be empty"
                + "if it is not null.");        
    }

    /**
     * Gets the antonym of the word
     * @return the antonym
     */
    public ArrayList<Word> getAntonym() {
        return antonym;
    }

    /**
     * Sets the antonym of a word, a antonym can be null
     * @param antonym the antonym to set    * 
     * @throws IllegalArgumentException when the antonym is empty if it's 
     * not null
     */
    public void setAntonym(ArrayList<Word> antonym) throws 
            IllegalArgumentException{
        if (antonym == null) {
            this.antonym = antonym;
        }
        boolean checkEmpty = true;
        for (Word list: antonym) {
            if (list.getWord().trim().equals("")) {
                checkEmpty = false;
            }
        }
        if (antonym != null && checkEmpty) {
            this.antonym = antonym;
        }else throw new IllegalArgumentException("Antonym cannot be empty"
                + "if it is not null.");          
    }

    /**
     * Get the related form of the word
     * @return the relatedForm
     */
    public ArrayList<Word> getRelatedForm() {
        return relatedForm;
    }

    /**
     * Sets the related form of the word, it can be null
     * @param relatedForm the relatedForm to set
     * @throws IllegalArgumentException when the the related
     * form of the word is empty if it's not null
     */
    public void setRelatedForm(ArrayList<Word> relatedForm) throws 
            IllegalArgumentException{
        if (relatedForm == null) {
            this.relatedForm = relatedForm;
        }
        boolean checkEmpty = true;
        for (Word list: relatedForm) {
            if (list.getWord().trim().equals("")) {
                checkEmpty = false;
            }
        }
        if (relatedForm != null && checkEmpty) {
            this.relatedForm = relatedForm;
        }else throw new IllegalArgumentException("The related form"
                + "of the word cannot be empty if the it is not null."); 
        
    }
        
    /**
     * Gets the topic of the word
     * @return the topic
     */
    public ArrayList<Topic> getTopic() {
        return topic;
    }

    /**
     * Sets the topic of the word
     * @param topic the topic to set
     */
    public void setTopic(ArrayList<Topic> topic) {
        this.topic = topic;
    }

    /**
     * Prints the word meanings and other related information
     * @return a string of that word
     */
    @Override
    public String toString() {
        return String.format("The word: %s, topic: %s, pronunciation: %s, definition: s, "
                + "frequency: %s, synonym: %s, antonym: %s, related form: %s.\n",
                word, topic, pron, freq, synonym, antonym, relatedForm);
    }

    /**
     * Check 2 words that whether are the same or not
     * @param o the word that required to compare
     * @return result of the comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o instanceof Word) {
            Word c = (Word) o;
            return this.word == c.getWord();
        } else {
            return false;
        }
    }

    /**
     * To compare 2 words which one is higher
     * @param w the word that we want to compare with
     * @return 1 if this word is higher, 0 is equal and -1 if less than
     */
    public int compareTo(Word w) {
        return this.word.compareToIgnoreCase(w.getWord());
    }

}
