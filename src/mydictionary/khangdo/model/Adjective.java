/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

/**
 * A class defines an adjective
 * @author Khang Do, 2020
 */
public class Adjective extends Word{
    private Adjective comparative;
    private Adjective superlative;
    
    /**
     * A no-args constructor of an adjective
     */
    public Adjective() {
        
    }

    /**
     * Gets the comparative form the adjective
     * @return the comparative
     */
    public Adjective getComparative() {
        return comparative;
    }

    /**
     * Sets the comparative form of the adjective
     * @param comparative the comparative to set
     * @throws IllegalArgumentException when the comparative form of the 
     * adjective is null or empty
     */
    public void setComparative(Adjective comparative) throws 
            IllegalArgumentException{
        if (comparative != null && !comparative.getWord().equals("")) {
            this.comparative = comparative;
        }else throw new IllegalArgumentException("The comparative form of the "
                + "adjective cannot be null or empty.");
        
    }

    /**
     * Gets the superlative form of the adjective
     * @return the superlative
     */
    public Adjective getSuperlative() {
        return superlative;
    }

    /**
     * Sets the superlative form of the adjective
     * @param superlative the superlative to set
     * @throws IllegalArgumentException when the superlative form of the 
     * adjective is null or empty
     */
    public void setSuperlative(Adjective superlative) throws 
            IllegalArgumentException{
        if (superlative != null && !superlative.getWord().equals("")) {
            this.superlative = superlative;
        }else throw new IllegalArgumentException("The comparative form of the "
                + "adjective cannot be null or empty.");
        
    }
    
    /**
     * Print the adjective
     * @return a string represent the information of the adjective
     */
    @Override
    public String toString() {
        return String.format("The Adjective: %s, pronunciation: %s, definition: "
                + "%s, frequency: %s, synonym: %s, antonym: %s, "
                + "related form: %s.\nComparative: %s, Superlative: %s.\n",
                super.getWord(), super.getPron(), super.getMeanings(), 
                super.getFreq(), super.getSynonym(), super.getRelatedForm(), 
                comparative.getWord(), superlative.getWord());
    }
    
    /**
     * Compare 2 adjectives
     * @param o the adjective that we need to compare
     * @return true if 2 adjectives are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o instanceof Adjective) {
            Adjective c = (Adjective) o;
            return super.getWord() == c.getWord();
        } else {
            return false;
        }
    }

    /**
     * To compare 2 adjectives which one is higher
     * @param adj the adjective that we want to compare with
     * @return 1 if this adjective is higher, 0 is equal and -1 if less than
     */    
    public int compareTo(Noun adj) {
        return super.getWord().compareToIgnoreCase(adj.getWord());
    }
}
