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
    private String[] countable = new String[2];
    
    public Noun() {
        super();
    }

    /**
     * @return the countable
     */
    public String[] isCountable() {
        return countable;
    }

    /**
     * @param countable the countable to set
     */
    public void setCountable(String[] countable) {
        this.countable = countable;
    }
    
    public String printCountable() {
        String s = "";
        for (String list: countable) {
            s += list;
        }
        return s;
    }
           
    @Override
    public String toString() {
        
        return String.format("The noun: %s, pronunciation: %s, %s,definition: "
                + "%s, "
                + "frequency: %s, synonym: %s, antonym: %s, related form: %s.",
                super.getWord(), super.getPron(), printCountable(), 
                super.getMeanings(), super.getFreq(), super.getSynonym(), 
                super.getRelatedForm());
    }
}
