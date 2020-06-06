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
    
    public Pronunciation() {
        
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
     */
    public void setAmerican(String american) throws IllegalArgumentException{
        if (american != null && !american.trim().equals("")) {
            this.american = american;
        } else throw new IllegalArgumentException("The American pronunciation "
                + "cannot be empty and null");
    }
    
    @Override
    public String toString() {
        return String.format("British /%s/, American /%s/", british, american);
    }
}
