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
    private ArrayList<Word> synonym;
    private ArrayList<Word> antonym;
    private ArrayList<Word> relatedForm;

    public Word() {

    }

    public Word(String word, Pronunciation pron, ArrayList<Definition> meanings,
            Frequency freq, ArrayList<Word> synonym, ArrayList<Word> antonym,
            ArrayList<Word> relatedForm) {

    }

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return the pron
     */
    public Pronunciation getPron() {
        return pron;
    }

    /**
     * @param pron the pron to set
     */
    public void setPron(Pronunciation pron) {
        this.pron = pron;
    }

    /**
     * @return the meanings
     */
    public ArrayList<Definition> getMeanings() {
        return meanings;
    }

    /**
     * @param meanings the meanings to set
     */
    public void setMeanings(ArrayList<Definition> meanings) {
        this.meanings = meanings;
    }

    /**
     * @return the freq
     */
    public Frequency getFreq() {
        return freq;
    }

    /**
     * @param freq the freq to set
     */
    public void setFreq(Frequency freq) {
        this.freq = freq;
    }

    /**
     * @return the synonym
     */
    public ArrayList<Word> getSynonym() {
        return synonym;
    }

    /**
     * @param synonym the synonym to set
     */
    public void setSynonym(ArrayList<Word> synonym) {
        this.synonym = synonym;
    }

    /**
     * @return the antonym
     */
    public ArrayList<Word> getAntonym() {
        return antonym;
    }

    /**
     * @param antonym the antonym to set
     */
    public void setAntonym(ArrayList<Word> antonym) {
        this.antonym = antonym;
    }

    /**
     * @return the relatedForm
     */
    public ArrayList<Word> getRelatedForm() {
        return relatedForm;
    }

    /**
     * @param relatedForm the relatedForm to set
     */
    public void setRelatedForm(ArrayList<Word> relatedForm) {
        this.relatedForm = relatedForm;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("The word: %s, pronunciation: $s, definition: %s, "
                + "frequency: %s, synonym: %s, antonym: %s, related form: %s.",
                word, pron, meanings, freq, synonym, relatedForm);
    }

    /**
     *
     * @param o
     * @return
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
     *
     * @param w
     * @return
     */
    public int CompareTo(Word w) {
        return this.word.compareToIgnoreCase(w.getWord());
    }
}
