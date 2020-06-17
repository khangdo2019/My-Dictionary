/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

/**
 * A class stores pronunciation of a word in both British and American way.
 * @author Khang Do, 2020
 */
public class Pronunciation {
    private String british;
    private String american;
    
    /**
     * A no-args constructor of the pronunciation of a word
     */
    public Pronunciation() {
        
    }
    
    /**
     * A constructor with a given British and American pronunciation for 
     * the word
     * @param british British pronunciation
     * @param american American pronunciation
     */
    public Pronunciation(String british, String american) {
        setBritish(british);
        setAmerican(american);
    }

    /**
     * Gets the british pronunciation of the word
     * @return the british
     */
    public String getBritish() {
        return british;
    }

    /**
     * Sets the British pronunciation for the word
     * @param british the british to set
     * @throws IllegalArgumentException when British pronunciation is empty 
     * or null
     */
    public void setBritish(String british) throws IllegalArgumentException{
        if (british != null && !british.trim().equals("")) {
            this.british = british;
        } else throw new IllegalArgumentException("The British pronunciation "
                + "cannot be empty and null");
    }

    /**
     * Gets the American pronunciation of the word
     * @return the american
     */
    public String getAmerican() {
        return american;
    }

    /**
     * Sets the pronunciation of the word
     * @param american the american to set
     * @throws IllegalArgumentException when American pronunciation is empty 
     * or null
     */
    public void setAmerican(String american) throws IllegalArgumentException{
        if (american != null && !american.trim().equals("")) {
            this.american = american;
        } else throw new IllegalArgumentException("The American pronunciation "
                + "cannot be empty and null");
    }
    
    /**
     * Prints the pronunciation of the word includng british & american 
     * pronunciation
     * @return 
     */
    @Override
    public String toString() {
        return String.format("British /%s/, American /%s/", british, american);
    }
    
    /**
     * To check whether 2 pronunciation is the same or not
     * @param o the pronunciation that user want to check
     * @return result of the comparison.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null) {
            return false;
        }
        
        if (o instanceof Pronunciation) {
            Pronunciation c = (Pronunciation) o;
            return (this.british == c.getBritish() || 
                    this.american == c.getAmerican());
        } else return false;
    }
}
