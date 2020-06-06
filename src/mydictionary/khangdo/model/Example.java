/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * A class define a sentence of example for a definition
 * @author Khang Do, 2020
 */
public class Example {
    private List<String> instances = new ArrayList<>();
    
    /**
     * A no-args constructor of the examples of the word
     */
    public Example() {
        
    }
    
    /**
     * A constructor with given instances of the word
     * @param instances 
     */
    public Example(List<String> instances) {
        setInstances(instances);
    }

    /**
     * Gets the instances of the word
     * @return the instances
     */
    public List<String> getInstances() {
        return instances;
    }

    /**
     * Sets the instances of the word
     * @param instances the instances to set
     */
    public void setInstances(List<String> instances) throws 
            IllegalArgumentException{
        if (!instances.isEmpty() && instances != null) {
            this.instances = instances;
        } else throw new IllegalArgumentException("Examples cannot be empty"
                + "or null");        
    }
    
    /**
     * Print the list of Examples
     * @return examples of the word
     */
    @Override
    public String toString() {
        String str = "";
        int count = 1;
        for(String list: instances) {
            str += String.format("Ex%d: %s.\n", count, list);
            count++;
        }
        return str;
    }
    
    /**
     * Check 2 sets of examples that whether are the same or not
     * @param o the list of examples that is required to compare
     * @return result of the comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o instanceof Example) {
            Example c = (Example) o;
            return this.instances == c.getInstances();
        } else {
            return false;
        }
    }
}
