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
    
//    private Word instance = new WordImpl();
    private Word instance;
    private String word;
    private Pronunciation pron;
    private ArrayList<Definition> meanings = new ArrayList<Definition>();
    private ArrayList<String> col = new ArrayList<String>();
    private ArrayList<Example> ex = new ArrayList<Example>();
//    private Frequency freq;
//    private ArrayList<Word> synonym; //Synonym can be empty
//    private ArrayList<Word> antonym; //Antonym can be empty
//    private ArrayList<Word> relatedForm; //Word related form can be empty
//    private ArrayList<Topic> topic;

    public WordTest() {
    }

    @Before
    public void setUp() {
        System.out.println("Setting it up!");
        instance = new WordImpl();
        word = "lack";
        pron = new Pronunciation("/lak/");
        
        // Setting up the definition of the test case
        ArrayList<String> exList = new ArrayList<String>();
        String example = "Example - They say they consider him uncorrupted, and "
                + "are impressed by his relative lack of political ambition.";
        exList.add(example);
        col.add("a (relative) lack of something");
        ex.add(new Example(exList));
        Definition meaning = new Definition(word, col, ex);        
        meanings.add(meaning);
        
}

public class WordImpl extends Word {
}

    /**
     * Test of getWord & setWord methods, of class Word. This test gives a good
     * input for setter method of Word, which should return the same string when
     * we call the getter method
     */
    @Test
    public void testWordGood() {
        System.out.println("Test Getter/Setter Word Good");
        String expResult = word;
        instance.setWord(word);
        String result = instance.getWord();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWord & setWord methods, of class Word. This test gives a bad
     * input of an empty string, which is expected to throw an
     * IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testWordBad() {
        System.out.println("Test Getter/Setter Word Bad");
        instance.setWord("");
    }

    /**
     * Test of getPron & setPron methods, of class Word. This test gives a good
     * input for setter method of Pron, which should return the same string when
     * we call the getter method
     */
    @Test
    public void testPronGood() {
        System.out.println("Test Getter/Setter Pron Good");
        String expResult = "/lak/";
        instance.setPron(pron);
        String result = instance.getPron().getAmerican();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPron & setPron methods, of class Word. This test gives a bad
     * input of an empty string, which is expected to throw an
     * IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testPronBad() {
        System.out.println("Test Getter/Setter Pron Bad");
        instance.setPron(new Pronunciation(""));
    }
//
    /**
     * Test of getMeanings & setMeanings methods, of class Word. This test gives
     * a good input for setter method of Meanings, which should return the same
     * Definition Object when we call the getter method
     */
    @Test
    public void testMeaningsGood() {
        System.out.println("Test Getter/Setter Meanings Good");
        Definition expResult = new Definition("lack", col, ex);
        instance.setMeanings(meanings);
        Definition result = instance.getMeanings().get(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMeanings & setMeanings methods, of class Word. This test gives
     * a bad input of an empty string of Definition Meaning, which is expected
     * to throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMeaningsBad() {
        System.out.println("Test Getter/Setter Meanings Bad");
        Definition meaning = new Definition("", col, ex);
        ArrayList<Definition> badMeaning = new ArrayList<Definition>();
        badMeaning.add(meaning);
        instance.setMeanings(badMeaning);
    }
//
//    /**
//     * Test of getFreq & setFreq methods, of class Word. This test gives a good
//     * input for setter method of Freq, which should return the same Freq type
//     * when we call the getter method
//     */
//    @Test
//    public void testFreqGood() {
//        System.out.println("Test Getter/Setter Frequncy Good");
//        Word instance = new WordImpl();
//        Frequency expResult = Frequency.HIGH_FREQUENCY;
//        instance.setFreq(Frequency.HIGH_FREQUENCY);
//        Frequency result = instance.getFreq();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getFreq & setFreq methods, of class Word. This test gives a bad
//     * input of a null object, which is expected to throw an
//     * IllegalArgumentException
//     */
//    @Test(expected = IllegalArgumentException.class)
//    public void testFreqBad() {
//        System.out.println("Test Getter/Setter Frequency Bad");
//        Word instance = new WordImpl();
//        instance.setFreq(null);
//    }
//
//    /**
//     * Test of getSynonym & setSynonym methods, of class Word. This test gives a
//     * good input for setter method of Synonym, which should return the same
//     * Word when we call the getter method
//     */
//    @Test
//    public void testSynonymGood() {
//        System.out.println("Test Getter/Setter Synonym Good");
//        Word instance = new WordImpl();
//        ArrayList<Word> synonym = new ArrayList<Word>();
//        Word expResult = new Noun("lack", new Pronunciation("lack"));
//        synonym.add(expResult);
//        instance.setSynonym(synonym);
//        Word result = instance.getSynonym().get(0);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getSynonym & setSynonym methods, of class Word. This test gives a
//     * bad input of an empty string to a Synonym, which is expected to throw an
//     * IllegalArgumentException
//     */
//    @Test(expected = IllegalArgumentException.class)
//    public void testSynonymBad() {
//        System.out.println("Test Getter/Setter Synonym Bad");
//        Word instance = new WordImpl();
//        ArrayList<Word> synonym = new ArrayList<Word>();
//        Word word = new Noun("", new Pronunciation("lack"));
//        synonym.add(word);
//        instance.setSynonym(synonym);
//    }
//
//    /**
//     * Test of getAntonym & setAntonym methods, of class Word. This test gives a
//     * good input for setter method of Antonym, which should return the same
//     * Word when we call the getter method
//     */
//    @Test
//    public void testAntonymGood() {
//        System.out.println("Test Getter/Setter Antonym Good");
//        Word instance = new WordImpl();
//        ArrayList<Word> antonym = new ArrayList<Word>();
//        Word expResult = new Noun("lack", new Pronunciation("lack"));
//        antonym.add(expResult);
//        instance.setAntonym(antonym);
//        Word result = instance.getAntonym().get(0);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getAntonym & setAntonym methods, of class Word. This test gives a
//     * bad input of an empty string to a Antonym, which is expected to throw an
//     * IllegalArgumentException
//     */
//    @Test(expected = IllegalArgumentException.class)
//    public void testAntonymBad() {
//        System.out.println("Test Getter/Setter Antonym Bad");
//        Word instance = new WordImpl();
//        ArrayList<Word> antonym = new ArrayList<Word>();
//        Word word = new Noun("", new Pronunciation("lack"));
//        antonym.add(word);
//        instance.setAntonym(antonym);
//    }
//
//    /**
//     * Test of getRelatedForm & setRelatedForm methods, of class Word. This test
//     * gives a good input for setter method of RelatedForm, which should return
//     * the same Word when we call the getter method
//     */
//    @Test
//    public void testRelatedFormGood() {
//        System.out.println("Test Getter/Setter Antonym Good");
//        Word instance = new WordImpl();
//        ArrayList<Word> relatedForm = new ArrayList<Word>();
//        Word expResult = new Noun("lack", new Pronunciation("lack"));
//        relatedForm.add(expResult);
//        instance.setRelatedForm(relatedForm);
//        Word result = instance.getRelatedForm().get(0);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getRelatedForm & setRelatedForm methods, of class Word. This test
//     * gives a bad input of an empty string to a RelatedForm, which is expected
//     * to throw an IllegalArgumentException
//     */
//    @Test(expected = IllegalArgumentException.class)
//    public void testRelatedFormmBad() {
//        System.out.println("Test Getter/Setter Antonym Bad");
//        Word instance = new WordImpl();
//        ArrayList<Word> relatedForm = new ArrayList<Word>();
//        Word word = new Noun("", new Pronunciation("lack"));
//        relatedForm.add(word);
//        instance.setRelatedForm(relatedForm);
//    }
//
//    /**
//     * Test of getTopic & setTopic methods, of class Word. This test gives a
//     * good input for setter method of Freq, which should return the same Freq
//     * type when we call the getter method
//     */
//    @Test
//    public void testTopicGood() {
//        System.out.println("Test Getter/Setter Topic Good");
//        Word instance = new WordImpl();
//        Topic expResult = Topic.EDUCATION;
//        ArrayList<Topic> topic = new ArrayList<Topic>();
//        topic.add(Topic.EDUCATION);
//        instance.setTopic(topic);
//        Topic result = instance.getTopic().get(0);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getTopic & setTopic methods, of class Word. This test gives a bad
//     * input of a value that is not in the list, which is expected to throw an
//     * IllegalArgumentException
//     */
//    @Test(expected = IllegalArgumentException.class)
//    public void testTopicBad() {
//        System.out.println("Test Getter/Setter Topic Bad");
//        Word instance = new WordImpl();
//        ArrayList<Topic> topic = new ArrayList<Topic>();
//        topic.add(Topic.valueOf("CAR"));
//        instance.setTopic(topic);
//    }
    
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

    /**
     * Test of toString method, of class Word.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Word instance = new WordImpl();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

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
//}
