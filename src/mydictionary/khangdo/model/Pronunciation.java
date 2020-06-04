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
     * @return the british
     */
    public String getBritish() {
        return british;
    }

    /**
     * @param british the british to set
     */
    public void setBritish(String british) {
        this.british = british;
    }

    /**
     * @return the american
     */
    public String getAmerican() {
        return american;
    }

    /**
     * @param american the american to set
     */
    public void setAmerican(String american) {
        this.american = american;
    }
    
    @Override
    public String toString() {
        return String.format("British /%s/, American /%s/", british, american);
    }
}
