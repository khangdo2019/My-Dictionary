/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

import java.util.ArrayList;

/**
 * A class defines a phrasal verb which is a combination of a verb and a
 * preposition or a verb and a adverb
 *
 * @author Khang Do, 2020
 */
public class PhrasalVerb {

    private Verb verb;
    private Adverb adverb;
    private Preposition prep;
    private ArrayList<Definition> meaning;
    private ArrayList<Topic> topic;

    public PhrasalVerb() {

    }

    public PhrasalVerb(Verb verb, Preposition prep) {

    }

    public PhrasalVerb(Verb verb, Adverb adverb) {

    }

    /**
     * Gets the verb of the phrasal verb
     *
     * @return the verb
     */
    public Verb getVerb() {
        return verb;
    }

    /**
     * Sets the verb of the phrasal verb
     *
     * @param verb the verb to set
     * @throws IllegalArgumentException when the verb of the phrasal verb is
     * null or empty
     */
    public void setVerb(Verb verb) throws IllegalArgumentException {
        if (verb != null && !verb.getWord().equals("")) {
            this.verb = verb;
        } else {
            throw new IllegalArgumentException("The verb in the phrasal "
                    + "verb cannot be null or empty.");
        }
    }

    /**
     * Gets the adverb of the phrasal verb
     *
     * @return the adverb
     */
    public Adverb getAdverb() {
        return adverb;
    }

    /**
     * Sets the adverb of the phrasal verb
     *
     * @param adverb the adverb to set
     * @throws IllegalArgumentException when the phrasal verb is verb + adverb,
     * the adverb cannot be empty.
     */
    public void setAdverb(Adverb adverb) throws IllegalArgumentException {
        if (adverb != null) {
            if (!adverb.getWord().equals("")) {
                this.adverb = adverb;
            } else {
                throw new IllegalArgumentException("If phrasal verb is"
                        + "verb + adverb, adverb cannot be empty or null");
            }
        }

    }

    /**
     * Gets the preposition of the phrasal verb
     *
     * @return the prep
     */
    public Preposition getPrep() {
        return prep;
    }

    /**
     * Sets the preposition of the phrasal verb
     *
     * @param prep the prep to set
     * @throws IllegalArgumentException when the phrasal verb is verb +
     * preposition, the preposition cannot be empty.
     */
    public void setPrep(Preposition prep) throws IllegalArgumentException {
        if (prep != null) {
            if (!prep.getWord().equals("")) {
                this.prep = prep;
            } else {
                throw new IllegalArgumentException("If phrasal verb is"
                        + "verb + preposition, preposition cannot be empty or null");
            }
        }

    }

    /**
     * Print the Phrasal Verb
     *
     * @return string represent the information of the phrasal verb
     */
    @Override
    public String toString() {
        String str = "";
        if (adverb != null) {
            str += String.format("The phrasal verb: %s %s,", verb, adverb);
        } else {
            str += String.format("The phrasal verb: %s %s,", verb, prep);
        }
        str += String.format(" %s.\n", topic);
        for (Definition list : meaning) {
            str += String.format("Definition: %s", list);
        }
        return str;
    }

    /**
     * Compare 2 phrasal verb
     *
     * @param o the phrasal verb that we need to compare
     * @return true if 2 phrasal verbs are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o instanceof PhrasalVerb) {
            PhrasalVerb c = (PhrasalVerb) o;
            if (adverb != null) {
                return verb.getWord() == c.getVerb().getWord()
                        && adverb.getWord() == c.getAdverb().getWord();
            } else return verb.getWord() == c.getVerb().getWord()
                        && prep.getWord() == c.getPrep().getWord();
        } else {
            return false;
        }
    }

    /**
     * To compare 2 phrasal verbs which one is higher
     *
     * @param p the phrasal verb that we want to compare with
     * @return 1 if this phrasal verb is higher, 0 is equal and -1 if less than
     */
    public int compareTo(PhrasalVerb p) {
        if (adverb != null) {
                return (verb.getWord().compareToIgnoreCase(p.getVerb().getWord())) 
                        + (adverb.getWord().compareToIgnoreCase(p.getAdverb().getWord()));
            } else return (verb.getWord().compareToIgnoreCase(p.getVerb().getWord())) 
                    + (prep.getWord().compareToIgnoreCase(p.getPrep().getWord()));        
    }
}
