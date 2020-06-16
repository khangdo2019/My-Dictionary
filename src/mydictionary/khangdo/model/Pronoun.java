/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

/**
 * A class defines a pronoun
 * @author Khang Do, 2020
 */
public class Pronoun extends Word{
    
    public Pronoun() {
        super();
    }
    
    /**
     * Print the Pronoun
     * @return string represent the information of the pronoun
     */
    @Override
    public String toString() {
        
        return String.format("The Pronoun: %s, pronunciation: %s, definition: "
                + "%s, frequency: %s, synonym: %s, antonym: %s, "
                + "related form: %s.\n",
                super.getWord(), super.getPron(), 
                super.getMeanings(), super.getFreq(), super.getSynonym(), 
                super.getRelatedForm());
    }
    
    /**
     * Compare 2 pronouns
     * @param o the pronoun that we need to compare
     * @return true if 2 pronouns are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o instanceof Pronoun) {
            Pronoun c = (Pronoun) o;
            return super.getWord() == c.getWord();
        } else {
            return false;
        }
    }

    /**
     * To compare 2 pronouns which one is higher
     * @param pron the pronoun that we want to compare with
     * @return 1 if this pronoun is higher, 0 is equal and -1 if less than
     */    
    public int compareTo(Pronoun pron) {
        return super.getWord().compareToIgnoreCase(pron.getWord());
    }
}
