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
    
    /**
     * A no-args constructor of a verb
     */
    public Verb() {
        super();
    }

    /**
     * Gets the verb in past tense
     * @return the pastTense
     */
    public Verb[] getPastTense() {
        return pastTense;
    }

    /**
     * Sets the verb past tense
     * @param pastTense the pastTense to set
     */
    public void setPastTense(Verb[] pastTense) {
        this.pastTense = pastTense;
    }

    /**
     * Gets the present participle form
     * @return the presentParticiple
     */
    public Verb getPresentParticiple() {
        return presentParticiple;
    }

    /**
     * Sets the present participle form
     * @param presentParticiple the presentParticiple to set
     * @throws IllegalArgumentException if the present participle of 
     * the verb is null or empty
     */
    public void setPresentParticiple(Verb presentParticiple) throws 
            IllegalArgumentException{
        if (presentParticiple != null && !presentParticiple.getWord().equals("")){
            this.presentParticiple = presentParticiple;
        }else throw new IllegalArgumentException("The present participle form "
                + "of the verb cannot be null or empty");        
    }

    /**
     * Gets the simple tense of the verb
     * @return the simpleTense
     */
    public Verb[] getSimpleTense() {
        return simpleTense;
    }

    /**
     * Sets the simple Tense of the verb
     * @param simpleTense the simpleTense to set
     * @throws IllegalArgumentException when the simple tense forms of the verb
     * are null or empty.
     */
    public void setSimpleTense(Verb[] simpleTense) throws 
            IllegalArgumentException{
        boolean check = true;
        for (Verb list: simpleTense) {
            if (list.getWord().equals("") && list == null) {
                check = false;
            }
        }
        if (check) {
            this.simpleTense = simpleTense;
        }else throw new IllegalArgumentException("The simple tense of the verb "
                + "cannot be null or empty");        
    }
    
    /**
     * Print the Verb
     * @return string represent the information of the verb
     */
    @Override
    public String toString(){
        String str = "";
        str += String.format("The Verb: %s, pronunciation: %s, definition: "
                + "%s, "
                + "frequency: %s, synonym: %s, antonym: %s, related form: %s.\n",
                super.getWord(), super.getPron(), super.getMeanings(), 
                super.getFreq(), super.getSynonym(), super.getRelatedForm());
        str += String.format("The simple tense:\nI,they: %s\nHe, she: %s.\n",
                simpleTense[0].getWord(), simpleTense[1].getWord());
        str += String.format("The present participle: %s.\n", presentParticiple);
        str += String.format("The past tense: %s %s %s.\n", 
                pastTense[0].getWord(), pastTense[1].getWord(),
                pastTense[2].getWord());
        return str;
    }
    
    /**
     * Compare 2 verbs
     * @param o the verb that we need to compare
     * @return true if 2 verbs are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o instanceof Verb) {
            Verb c = (Verb) o;
            return super.getWord() == c.getWord();
        } else {
            return false;
        }
    }

    /**
     * To compare 2 verbs which one is higher
     * @param v the verb that we want to compare with
     * @return 1 if this verb is higher, 0 is equal and -1 if less than the 
     * compared verb
     */    
    public int compareTo(Verb v) {
        return super.getWord().compareToIgnoreCase(v.getWord());
    }
}
