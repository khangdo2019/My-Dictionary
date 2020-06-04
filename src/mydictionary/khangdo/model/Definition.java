/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

import java.util.ArrayList;

/**
 * A class defines a definition for a word
 * @author Khang Do, 2020
 */
public class Definition {
    private String meaning;
    private ArrayList<String> collocation;
    private Image img;
    private String keyPoint;
    private ArrayList<Example> ex;
    private boolean isFormal;
    
    public Definition() {
        
    }

    /**
     * @return the meaning
     */
    public String getMeaning() {
        return meaning;
    }

    /**
     * @param meaning the meaning to set
     */
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    /**
     * @return the collocation
     */
    public ArrayList<String> getCollocation() {
        return collocation;
    }

    /**
     * @param collocation the collocation to set
     */
    public void setCollocation(ArrayList<String> collocation) {
        this.collocation = collocation;
    }

    /**
     * @return the img
     */
    public Image getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(Image img) {
        this.img = img;
    }

    /**
     * @return the keyPoint
     */
    public String getKeyPoint() {
        return keyPoint;
    }

    /**
     * @param keyPoint the keyPoint to set
     */
    public void setKeyPoint(String keyPoint) {
        this.keyPoint = keyPoint;
    }

    /**
     * @return the ex
     */
    public ArrayList<Example> getEx() {
        return ex;
    }

    /**
     * @param ex the ex to set
     */
    public void setEx(ArrayList<Example> ex) {
        this.ex = ex;
    }

    /**
     * @return the isFormal
     */
    public boolean isIsFormal() {
        return isFormal;
    }

    /**
     * @param isFormal the isFormal to set
     */
    public void setIsFormal(boolean isFormal) {
        this.isFormal = isFormal;
    }
    
    
}
