/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talos.inverted.index;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import talos.index.logic.*;

/**
 *
 * @author castillobg
 */
public class Main {
    
    private static String[] data = new String[]{ 
        "A brilliant, festive study of JS Bach uses literature and painting to illuminate his 'dance-impregnated' music, writes Peter Conrad", 
        "Fatima Bhutto on Malala Yousafzai's fearless and still-controversial memoir", 
        "Grisham's sequel to A Time to Kill is a solid courtroom drama about racial prejudice marred by a flawless white hero, writes John O'Connell", 
        "This strange repackaging of bits and pieces does the Man Booker winner no favours, says Sam Leith", 
        "Another book with music related content" 
    };
    
    public static void main(String[] args){
        
        WordMap map = new WordMap(data);
        
        String[] query = new String[]{"Bach", "Strange"};
        ArrayList<Word> res = map.searchWords(query);
        for(Word word : res){
            System.out.println(word);
        }
    }
}
