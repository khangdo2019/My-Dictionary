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

    private Word instance;
    private String word;
    private Pronunciation pron;
    private ArrayList<Definition> meanings = new ArrayList<Definition>();
    private ArrayList<String> col = new ArrayList<String>();
    private ArrayList<Example> ex = new ArrayList<Example>();
    private Frequency freq;
    private ArrayList<Word> synonym = new ArrayList<Word>();
    private ArrayList<Word> antonym = new ArrayList<Word>();
    private ArrayList<Word> relatedForm = new ArrayList<Word>();
    private ArrayList<Topic> topic = new ArrayList<Topic>();

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
        
        freq = Frequency.HIGH_FREQUENCY;
        synonym.add(new Noun(word, pron));
        antonym.add(new Noun(word, pron));
        relatedForm.add(new Noun(word, pron));
        topic.add(Topic.EDUCATION);
        String str = String.format("The word: %s, topic: %s, pronunciation: %s, definition: %s, "
                + "frequency: %s, synonym: %s, antonym: %s, related form: %s.\n",
                word, topic, pron, meanings, freq, synonym, antonym, relatedForm);
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

    /**
     * Test of getFreq & setFreq methods, of class Word. This test gives a good
     * input for setter method of Freq, which should return the same Freq type
     * when we call the getter method
     */
    @Test
    public void testFreqGood() {
        System.out.println("Test Getter/Setter Frequncy Good");
        Frequency expResult = Frequency.HIGH_FREQUENCY;
        instance.setFreq(freq);
        Frequency result = instance.getFreq();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFreq & setFreq methods, of class Word. This test gives a bad
     * input of a null object, which is expected to throw an
     * IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFreqBad() {
        System.out.println("Test Getter/Setter Frequency Bad");
        instance.setFreq(null);
    }

    /**
     * Test of getSynonym & setSynonym methods, of class Word. This test gives a
     * good input for setter method of Synonym, which should return the same
     * Word when we call the getter method
     */
    @Test
    public void testSynonymGood() {
        System.out.println("Test Getter/Setter Synonym Good");
        Word expResult = new Noun("lack", new Pronunciation("/lak/"));
        instance.setSynonym(synonym);
        Word result = instance.getSynonym().get(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSynonym & setSynonym methods, of class Word. This test gives a
     * bad input of an empty string to a Synonym, which is expected to throw an
     * IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSynonymBad() {
        System.out.println("Test Getter/Setter Synonym Bad");
        Word word = new Noun("", new Pronunciation("lack"));
        synonym.add(word);
        instance.setSynonym(synonym);
    }

    /**
     * Test of getAntonym & setAntonym methods, of class Word. This test gives a
     * good input for setter method of Antonym, which should return the same
     * Word when we call the getter method
     */
    @Test
    public void testAntonymGood() {
        System.out.println("Test Getter/Setter Antonym Good");
        Word expResult = new Noun("lack", new Pronunciation("/lak/"));
        instance.setAntonym(antonym);
        Word result = instance.getAntonym().get(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAntonym & setAntonym methods, of class Word. This test gives a
     * bad input of an empty string to a Antonym, which is expected to throw an
     * IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAntonymBad() {
        System.out.println("Test Getter/Setter Antonym Bad");
        Word word = new Noun("", new Pronunciation("lack"));
        antonym.add(word);
        instance.setAntonym(antonym);
    }

    /**
     * Test of getRelatedForm & setRelatedForm methods, of class Word. This test
     * gives a good input for setter method of RelatedForm, which should return
     * the same Word when we call the getter method
     */
    @Test
    public void testRelatedFormGood() {
        System.out.println("Test Getter/Setter Related Form Good");
        Word expResult = new Noun("lack", new Pronunciation("lack"));
        instance.setRelatedForm(relatedForm);
        Word result = instance.getRelatedForm().get(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of getRelatedForm & setRelatedForm methods, of class Word. This test
     * gives a bad input of an empty string to a RelatedForm, which is expected
     * to throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRelatedFormmBad() {
        System.out.println("Test Getter/Setter Related Form Bad");
        Word word = new Noun("", new Pronunciation("lack"));
        relatedForm.add(word);
        instance.setRelatedForm(relatedForm);
    }

    /**
     * Test of getTopic & setTopic methods, of class Word. This test gives a
     * good input for setter method of Freq, which should return the same Freq
     * type when we call the getter method
     */
    @Test
    public void testTopicGood() {
        System.out.println("Test Getter/Setter Topic Good");
        Topic expResult = Topic.EDUCATION;
        instance.setTopic(topic);
        Topic result = instance.getTopic().get(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTopic & setTopic methods, of class Word. This test gives a bad
     * input of a value that is not in the list, which is expected to throw an
     * IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testTopicBad() {
        System.out.println("Test Getter/Setter Topic Bad");
        topic.add(Topic.valueOf("CAR"));
        instance.setTopic(topic);
    }

//    /**
//     * Test of toString method, of class Word.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
////        Word instance = new WordImpl();
//        String expResult = String.format("The word: %s, topic: %s, pronunciation: %s, definition: %s, "
//                + "frequency: %s, synonym: %s, antonym: %s, related form: %s.\n",
//                word, topic, pron, meanings, freq, synonym, antonym, relatedForm);
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//}
    
    /**
     * Test of equals methods, of class Word. This test gives a
     * good input for equals method, which should return true
     */
    @Test
    public void testEqualsGood() {
        System.out.println("Test equals Good");
        Object o = instance;
        Word newInstance = new WordImpl();
        newInstance.setWord(word);
        boolean expResult = true;
        boolean result = newInstance.equals(o);
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of equals methods, of class Word. This test gives a
     * bad input for equals method of a null object, which should return false
     */
    @Test
    public void testEqualsBad() {
        System.out.println("Test equals Bad");
        Object o = null;
        Word instance = new WordImpl();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);        
    }
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
