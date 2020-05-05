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
}
