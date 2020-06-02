/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

/**
 * A class defines a noun
 * @author Khang Do, 2020
 */
public class Noun extends Word{
    private boolean countable;
    
    public Noun() {
        super();
    }

    /**
     * @return the countable
     */
    public boolean isCountable() {
        return countable;
    }

    /**
     * @param countable the countable to set
     */
    public void setCountable(boolean countable) {
        this.countable = countable;
    }
    
    
}
