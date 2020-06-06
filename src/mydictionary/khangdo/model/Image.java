/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

/**
 * A class defines an image for a word
 * @author Khang Do, 2020
 */
public class Image {
    private String url;
    
    public Image() {
        
    }

    /**
     * Gets the URL of the image
     * @return the url of the image
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the URL of the image
     * @param url the url to set
     */
    public void setUrl(String url) throws IllegalArgumentException{
        if (url != null && !url.trim().equals("")) {
            this.url = url;
        } else throw new IllegalArgumentException("The word cannot be empty"
                + "and null");
    }
    
    
}
