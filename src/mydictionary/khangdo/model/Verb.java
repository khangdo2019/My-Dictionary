/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

/**
 * A class defines a verb
 * @author Khang Do, 2020
 */
public class Verb extends Word{
    private Verb[] pastTense = new Verb[3]; //
    private Verb presentParticiple;
    private Verb[] simpleTense = new Verb[2]; //I|they & he|she|it
    
    public Verb() {
        super();
    }

    /**
     * @return the pastTense
     */
    public Verb[] getPastTense() {
        return pastTense;
    }

    /**
     * @param pastTense the pastTense to set
     */
    public void setPastTense(Verb[] pastTense) {
        this.pastTense = pastTense;
    }

    /**
     * @return the presentParticiple
     */
    public Verb getPresentParticiple() {
        return presentParticiple;
    }

    /**
     * @param presentParticiple the presentParticiple to set
     */
    public void setPresentParticiple(Verb presentParticiple) {
        this.presentParticiple = presentParticiple;
    }

    /**
     * @return the simpleTense
     */
    public Verb[] getSimpleTense() {
        return simpleTense;
    }

    /**
     * @param simpleTense the simpleTense to set
     */
    public void setSimpleTense(Verb[] simpleTense) {
        this.simpleTense = simpleTense;
    }
    
    
}
