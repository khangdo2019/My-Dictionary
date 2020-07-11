/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class WordTest {

    public WordTest() {
    }

    @Before
    public void setUp() {
    }

    public class WordImpl extends Word {
    }

    /**
     * Test of getWord & setWord methods, of class Word. 
     * This test gives a good input for setter method of Word, which should 
     * return the same string when we call the getter method
     */
    @Test
    public void testWordGood() {
        System.out.println("Test Getter/Setter Word Good");
        Word instance = new WordImpl();
        String expResult = "lack";
        instance.setWord("lack");
        String result = instance.getWord();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getWord & setWord methods, of class Word. 
     * This test gives a bad input of an empty string, which is expected to
     * throw an IllegalArgumentException
     */
    @Test (expected=IllegalArgumentException.class)
    public void testWordBad() {
        System.out.println("Test Getter/Setter Word Bad");
        Word instance = new WordImpl();        
        instance.setWord("");          
    }
    
    /**
     * Test of getPron & setPron methods, of class Word. 
     * This test gives a good input for setter method of Pron, which should 
     * return the same string when we call the getter method
     */
    @Test
    public void testPronGood() {
        System.out.println("Test Getter/Setter Pron Good");
        Word instance = new WordImpl();
        String expResult = "/lak/";
        instance.setPron(new Pronunciation("/lak/"));
        String result = instance.getPron().getAmerican();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getWord & setWord methods, of class Word. 
     * This test gives a bad input of an empty string, which is expected to
     * throw an IllegalArgumentException
     */
    @Test (expected=IllegalArgumentException.class)
    public void testPronBad() {
        System.out.println("Test Getter/Setter Pron Bad");
        Word instance = new WordImpl();        
        instance.setPron(new Pronunciation(""));            
    }
    
    /**
     * Test of getPron & setPron methods, of class Word. 
     * This test gives a good input for setter method of Meanings, which should 
     * return the same Definition Object when we call the getter method
     */
    @Test
    public void testMeaningsGood() {
        System.out.println("Test Getter/Setter Meanings Good");
        Word instance = new WordImpl();
        ArrayList<String> col = new ArrayList<String>();
        ArrayList<Example> ex = new ArrayList<Example>();
        ArrayList<String> exList = new ArrayList<String>();
        String example = "Example - They say they consider him uncorrupted, and "
                + "are impressed by his relative lack of political ambition.";
        exList.add(example);
        col.add("a (relative) lack of something");
        ex.add(new Example(exList));
        Definition expResult = new Definition("Lack", col, ex);
        
        Definition meaning = new Definition("Lack", col, ex);
        ArrayList<Definition> meaningList = new ArrayList<Definition>();
        meaningList.add(meaning);
        instance.setMeanings(meaningList);
        
        Definition result = instance.getMeanings().get(0);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getWord & setWord methods, of class Word. 
     * This test gives a bad input of an empty string of Definition Meaning, 
     * which is expected to throw an IllegalArgumentException
     */
    @Test (expected=IllegalArgumentException.class)
    public void testMeaningsBad() {
        System.out.println("Test Getter/Setter Meanings Good");
        Word instance = new WordImpl();
        ArrayList<String> col = new ArrayList<String>();
        ArrayList<Example> ex = new ArrayList<Example>();
        ArrayList<String> exList = new ArrayList<String>();
        String example = "Example - They say they consider him uncorrupted, and "
                + "are impressed by his relative lack of political ambition.";
        exList.add(example);
        col.add("a (relative) lack of something");
        ex.add(new Example(exList));        
        
        Definition meaning = new Definition("", col, ex);
        ArrayList<Definition> meaningList = new ArrayList<Definition>();
        meaningList.add(meaning);
        instance.setMeanings(meaningList);
    }

//    /**
//     * Test of setWord method, of class Word.
//     */
//    @Test
//    public void testSetWord() {
//        System.out.println("setWord");
//        String word = "";
//        Word instance = new WordImpl();
//        instance.setWord(word);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPron method, of class Word.
//     */
//    @Test
//    public void testGetPron() {
//        System.out.println("getPron");
//        Word instance = new WordImpl();
//        Pronunciation expResult = null;
//        Pronunciation result = instance.getPron();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPron method, of class Word.
//     */
//    @Test
//    public void testSetPron() {
//        System.out.println("setPron");
//        Pronunciation pron = null;
//        Word instance = new WordImpl();
//        instance.setPron(pron);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMeanings method, of class Word.
//     */
//    @Test
//    public void testGetMeanings() {
//        System.out.println("getMeanings");
//        Word instance = new WordImpl();
//        ArrayList<Definition> expResult = null;
//        ArrayList<Definition> result = instance.getMeanings();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMeanings method, of class Word.
//     */
//    @Test
//    public void testSetMeanings() {
//        System.out.println("setMeanings");
//        ArrayList<Definition> meanings = null;
//        Word instance = new WordImpl();
//        instance.setMeanings(meanings);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFreq method, of class Word.
//     */
//    @Test
//    public void testGetFreq() {
//        System.out.println("getFreq");
//        Word instance = new WordImpl();
//        Frequency expResult = null;
//        Frequency result = instance.getFreq();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setFreq method, of class Word.
//     */
//    @Test
//    public void testSetFreq() {
//        System.out.println("setFreq");
//        Frequency freq = null;
//        Word instance = new WordImpl();
//        instance.setFreq(freq);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSynonym method, of class Word.
//     */
//    @Test
//    public void testGetSynonym() {
//        System.out.println("getSynonym");
//        Word instance = new WordImpl();
//        ArrayList<Word> expResult = null;
//        ArrayList<Word> result = instance.getSynonym();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSynonym method, of class Word.
//     */
//    @Test
//    public void testSetSynonym() {
//        System.out.println("setSynonym");
//        ArrayList<Word> synonym = null;
//        Word instance = new WordImpl();
//        instance.setSynonym(synonym);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAntonym method, of class Word.
//     */
//    @Test
//    public void testGetAntonym() {
//        System.out.println("getAntonym");
//        Word instance = new WordImpl();
//        ArrayList<Word> expResult = null;
//        ArrayList<Word> result = instance.getAntonym();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAntonym method, of class Word.
//     */
//    @Test
//    public void testSetAntonym() {
//        System.out.println("setAntonym");
//        ArrayList<Word> antonym = null;
//        Word instance = new WordImpl();
//        instance.setAntonym(antonym);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRelatedForm method, of class Word.
//     */
//    @Test
//    public void testGetRelatedForm() {
//        System.out.println("getRelatedForm");
//        Word instance = new WordImpl();
//        ArrayList<Word> expResult = null;
//        ArrayList<Word> result = instance.getRelatedForm();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setRelatedForm method, of class Word.
//     */
//    @Test
//    public void testSetRelatedForm() {
//        System.out.println("setRelatedForm");
//        ArrayList<Word> relatedForm = null;
//        Word instance = new WordImpl();
//        instance.setRelatedForm(relatedForm);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTopic method, of class Word.
//     */
//    @Test
//    public void testGetTopic() {
//        System.out.println("getTopic");
//        Word instance = new WordImpl();
//        ArrayList<Topic> expResult = null;
//        ArrayList<Topic> result = instance.getTopic();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTopic method, of class Word.
//     */
//    @Test
//    public void testSetTopic() {
//        System.out.println("setTopic");
//        ArrayList<Topic> topic = null;
//        Word instance = new WordImpl();
//        instance.setTopic(topic);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class Word.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Word instance = new WordImpl();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of equals method, of class Word.
//     */
//    @Test
//    public void testEquals() {
//        System.out.println("equals");
//        Object o = null;
//        Word instance = new WordImpl();
//        boolean expResult = false;
//        boolean result = instance.equals(o);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of compareTo method, of class Word.
//     */
//    @Test
//    public void testCompareTo() {
//        System.out.println("compareTo");
//        Word w = null;
//        Word instance = new WordImpl();
//        int expResult = 0;
//        int result = instance.compareTo(w);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
}
