/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talos.index.logic;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author castillobg
 */
public class WordMapTest {
    
    @Test
    public void testSearchSingleExistentWord(){
        System.out.println("Search single existent word");
        String[] query = {"a"}; //appears 4 times.
        WordMap instance = new WordMap(new String[]{ 
            "A brilliant, festive study of JS Bach uses literature and painting to illuminate his 'dance-impregnated' music, writes Peter Conrad", 
            "Fatima Bhutto on Malala Yousafzai's fearless and still-controversial memoir", 
            "Grisham's sequel to A Time to Kill is a solid courtroom drama about racial prejudice marred by a flawless white hero, writes John O'Connell", 
            "This strange repackaging of bits and pieces does the Man Booker winner no favours, says Sam Leith", 
            "Another book with music related content" 
        });
        //Test number of occurences.
        ArrayList<Word> result = instance.searchWords(query);
        assertEquals(4, result.get(0).getIndexes().size());
        
        //Test occurence data.
        Index i1 = new Index(0, 0);
        assertEquals(i1.getDoc(), result.get(0).getIndexes().get(0).getDoc());
        assertEquals(i1.getPosition(), result.get(0).getIndexes().get(0).getPosition());
        Index i2 = new Index(3, 2);
        assertEquals(i2.getDoc(), result.get(0).getIndexes().get(1).getDoc());
        assertEquals(i2.getPosition(), result.get(0).getIndexes().get(1).getPosition());
        Index i3 = new Index(8, 2);
        assertEquals(i3.getDoc(), result.get(0).getIndexes().get(2).getDoc());
        assertEquals(i3.getPosition(), result.get(0).getIndexes().get(2).getPosition());
        Index i4 = new Index(17, 2);
        assertEquals(i4.getDoc(), result.get(0).getIndexes().get(3).getDoc());
        assertEquals(i4.getPosition(), result.get(0).getIndexes().get(3).getPosition());
    }
    
    @Test
    public void testSearchManyExistentWords() {
        System.out.println("Search many existent words");
        String[] query = {"Bach", "strange"};
        WordMap instance = new WordMap(new String[]{ 
            "A brilliant, festive study of JS Bach uses literature and painting to illuminate his 'dance-impregnated' music, writes Peter Conrad", 
            "Fatima Bhutto on Malala Yousafzai's fearless and still-controversial memoir", 
            "Grisham's sequel to A Time to Kill is a solid courtroom drama about racial prejudice marred by a flawless white hero, writes John O'Connell", 
            "This strange repackaging of bits and pieces does the Man Booker winner no favours, says Sam Leith", 
            "Another book with music related content" 
        });
        //Test number of occurences.
        ArrayList<Word> result = instance.searchWords(query);
        assertEquals(2, result.size());
        
        //Test occurence data.
        Index i1 = new Index(6, 0);
        assertEquals(i1.getDoc(), result.get(0).getIndexes().get(0).getDoc());
        assertEquals(i1.getPosition(), result.get(0).getIndexes().get(0).getPosition());
        Index i2 = new Index(1, 3);
        assertEquals(i2.getDoc(), result.get(1).getIndexes().get(0).getDoc());
        assertEquals(i2.getPosition(), result.get(1).getIndexes().get(0).getPosition());
    }
    
    @org.junit.Test
    public void testSearchNonexistentWord() {
        System.out.println("Search non-existent word");
        String[] query = {"pulp"};
        WordMap instance = new WordMap(new String[]{ 
            "A brilliant, festive study of JS Bach uses literature and painting to illuminate his 'dance-impregnated' music, writes Peter Conrad", 
            "Fatima Bhutto on Malala Yousafzai's fearless and still-controversial memoir", 
            "Grisham's sequel to A Time to Kill is a solid courtroom drama about racial prejudice marred by a flawless white hero, writes John O'Connell", 
            "This strange repackaging of bits and pieces does the Man Booker winner no favours, says Sam Leith", 
            "Another book with music related content" 
        });
        ArrayList<Word> result = instance.searchWords(query);
        assertEquals(0, result.size());
    }
}
