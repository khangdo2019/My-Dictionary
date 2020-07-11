/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

import java.util.ArrayList;

/**
 * A class defines a definition for a word
 *
 * @author Khang Do, 2020
 */
public class Definition {

    private String meaning;
    private ArrayList<String> collocation;
    private Image img;
    private String keyPoint;
    private ArrayList<Example> ex;
    private boolean isFormal;

    /**
     * A no-agrs constructor of definition of a word
     */
    public Definition() {

    }

    /**
     * A constructor of definition with given meaning, collocation, & example
     * @param meaning
     * @param collocation
     * @param ex 
     */
    public Definition(String meaning, ArrayList<String> collocation, 
            ArrayList<Example> ex) {
        setMeaning(meaning);
        setCollocation(collocation);
        setEx(ex);
    }
    /**
     * Gets the definition of the word
     *
     * @return the meaning of the word
     */
    public String getMeaning() {
        return meaning;
    }

    /**
     * Sets the definition of the word
     *
     * @param meaning the meaning to set
     * @throws IllegalArgumentException when the meaning is null or empty
     */
    public void setMeaning(String meaning) throws IllegalArgumentException {
        if (meaning != null && !meaning.trim().equals("")) {
            this.meaning = meaning;
        } else {
            throw new IllegalArgumentException("Meaning cannot be null"
                    + "or empty");
        }
    }

    /**
     * Gets the collocations of the word
     *
     * @return the collocation
     */
    public ArrayList<String> getCollocation() {
        return collocation;
    }

    /**
     * Sets the collocation of the word for each meaning.
     *
     * @param collocation the collocation to set
     * @throws IllegalArgumentException when collocation is not null, it cannot
     * be empty
     */
    public void setCollocation(ArrayList<String> collocation) throws
            IllegalArgumentException {
        if (collocation != null) {
            if (!collocation.isEmpty()) {
                this.collocation = collocation;
            } else {
                throw new IllegalArgumentException("When collocation is"
                        + "not null, collocation cannot be empty");
            }
        }
        this.collocation = collocation;
    }

    /**
     * Gets an image of the meaning
     *
     * @return the img the image of the meaning
     */
    public Image getImg() {
        return img;
    }

    /**
     * Sets the image of the meaning, the image can be null or empty.
     *
     * @param img the img to set
     */
    public void setImg(Image img) {
        this.img = img;
    }

    /**
     * Gets the Key point of the meaning
     *
     * @return the keyPoint
     */
    public String getKeyPoint() {
        return keyPoint;
    }

    /**
     * Sets the key point of the meaning
     *
     * @param keyPoint the keyPoint to set
     */
    public void setKeyPoint(String keyPoint) throws IllegalArgumentException {
        if (keyPoint != null && !keyPoint.trim().equals("")) {
            this.keyPoint = keyPoint;
        } else {
            throw new IllegalArgumentException("Meaning cannot be null"
                    + "or empty");
        }

    }

    /**
     * Gets the list of example for the meaning
     * @return the ex
     */
    public ArrayList<Example> getEx() {
        return ex;
    }

    /**
     * Sets the list of Example of the meaning
     * @param ex the ex to set
     */
    public void setEx(ArrayList<Example> ex) throws IllegalArgumentException{
        boolean checkEmpty = true;
        for (Example list: ex) {
            if (list.getInstances().isEmpty()) {
                checkEmpty = false;
            }
        }
        if (checkEmpty) {
            this.ex = ex;
        } else {
            throw new IllegalArgumentException("The Example cannot be "
                    + "empty or null");
        }
    }

    /**
     * Gets the formal or informal of the meaning
     * @return the isFormal
     */
    public boolean isIsFormal() {
        return isFormal;
    }

    /**
     * Sets the formal or informal of a meaning
     * @param isFormal the isFormal to set
     */
    public void setIsFormal(boolean isFormal) {
        this.isFormal = isFormal;
    }
    
    /**
     * Sets the content of the meaning of the word
     * @return str that is the display of a meaning of the word
     */
    @Override
    public String toString() {        
        String str = "";
        str += String.format("Key point: %s, meaning: %s.\n", keyPoint, meaning);
        if (isFormal) {
            str += String.format("(FORMAL)\n");
        } else str += String.format("(INFORMAL)\n");
        int count = 1;
//        for (Example list: ex) {            
//            str += String.format("Ex%d: %s.\n", count, list);
//            count++;
//        }
        str += "Collocation: \n";
        for (String list: collocation) {
            str += String.format("-> %s.\n", list);
        }
        return str;
    }
    
    /**
     * Compare 2 definition of a word
     * @param o a definition of the word
     * @return true if 2 definitions are the same and false if they are not 
     * the same.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;                    
        }
        
        if (o == null) {
            return false;
        }
        
        if (o instanceof Definition) {
            Definition c = (Definition) o;
            return meaning == c.getMeaning();
        } else return false;
    }

}
