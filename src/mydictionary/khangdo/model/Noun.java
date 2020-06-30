/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

import java.util.ArrayList;

/**
 * A class defines a noun
 * @author Khang Do, 2020
 */
public class Noun extends Word{
    private String[] countable = new String[2];
    
    /**
     * Create a no-args constructor
     */
    public Noun() {
        super();
    }
    
    /**
     * Sets a constructor of a noun with given word, pronunciation, and definitions
     * @param word the noun
     * @param pron the pronunciation of the noun
     * @param meanings the definition of the noun
     */
    public Noun(String word, Pronunciation pron) {
        super();
        setWord(word);
        setPron(pron);        
    }

    /**
     * Gets the countable or uncountable of the noun
     * @return the countable
     */
    public String[] isCountable() {
        return countable;
    }

    /**
     * Sets the countable and uncountable of the noun
     * @param countable the countable to set
     */
    public void setCountable(String[] countable) {
        this.countable = countable;
    }
    
    /**
     * Print the countable & countable
     * @return 
     */
    public String printCountable() {
        String s = "";
        for (String list: countable) {
            s += list;
        }
        return s;
    }
    
    /**
     * Print the Noun
     * @return string represent the information of the noun
     */
    @Override
    public String toString() {
        
        return String.format("The noun: %s, pronunciation: %s, %s,definition: "
                + "%s, frequency: %s, synonym: %s, antonym: %s, "
                + "related form: %s.\n",
                super.getWord(), super.getPron(), printCountable(), 
                super.getMeanings(), super.getFreq(), super.getSynonym(), 
                super.getRelatedForm());
    }
    
    /**
     * Compare 2 nouns
     * @param o the noun that we need to compare
     * @return true if 2 nouns are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o instanceof Noun) {
            Noun c = (Noun) o;
            return super.getWord() == c.getWord();
        } else {
            return false;
        }
    }

    /**
     * To compare 2 nouns which one is higher
     * @param n the noun that we want to compare with
     * @return 1 if this noun is higher, 0 is equal and -1 if less than
     */    
    public int compareTo(Noun n) {
        return super.getWord().compareToIgnoreCase(n.getWord());
    }
}
