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
    
    /**
     * A no-args constructor of the image
     */
    public Image() {
        
    }
    
    /**
     * A constructor with a given URL of the image
     * @param url 
     */
    public Image(String url) {
        setUrl(url);
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
    
    /**
     * The URL of the image represents the word
     * @return the url of the image
     */
    @Override
    public String toString() {
        return String.format("The URL of the picture is %s.\n", url);
    }
    
    /**
     * Check 2 images that whether are the same or not
     * @param o the image that we need to compare with
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

        if (o instanceof Image) {
            Image c = (Image) o;
            return this.url == c.getUrl();
        } else {
            return false;
        }
    }
}
