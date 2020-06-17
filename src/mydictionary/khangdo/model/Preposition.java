/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

/**
 * A class defines a preposition
 * @author Khang Do, 2020
 */
public class Preposition extends Word{
    
    /**
     * A no-args constructor of the preposition
     */
    public Preposition() {
        super();
    }
    
    /**
     * Print the Preposition
     * @return string represent the information of the preposition
     */
    @Override
    public String toString() {
        
        return String.format("The Preposition: %s, pronunciation: %s, definition: "
                + "%s, frequency: %s, synonym: %s, antonym: %s, "
                + "related form: %s.\n",
                super.getWord(), super.getPron(), 
                super.getMeanings(), super.getFreq(), super.getSynonym(), 
                super.getRelatedForm());
    }
    
    /**
     * Compare 2 prepositions
     * @param o the preposition that we need to compare
     * @return true if 2 prepositions are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o instanceof Preposition) {
            Preposition c = (Preposition) o;
            return super.getWord() == c.getWord();
        } else {
            return false;
        }
    }

    /**
     * To compare 2 prepositions which one is higher
     * @param prep the preposition that we want to compare with
     * @return 1 if this preposition is higher, 0 is equal and -1 if less than
     */    
    public int compareTo(Preposition prep) {
        return super.getWord().compareToIgnoreCase(prep.getWord());
    }
}
