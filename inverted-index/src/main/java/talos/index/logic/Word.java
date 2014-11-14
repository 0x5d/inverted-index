/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talos.index.logic;

import java.util.ArrayList;

/**
 *
 * @author castillobg
 */
public class Word implements Comparable<Word>{
    
    private String string;
    private ArrayList<Index> indexes;

    public Word(String string){
        this.string = string;
        this.indexes = new ArrayList<>();
    }
    
    public void addIndex(Index i){
        indexes.add(i);
    }
    
    /**
     * @return the indexes
     */
    public ArrayList<Index> getIndexes() {
        return indexes;
    }

    /**
     * @param indexes the indexes to set
     */
    public void setIndexes(ArrayList indexes) {
        this.indexes = indexes;
    }

    /**
     * @return the string
     */
    public String getString() {
        return string;
    }

    /**
     * @param string the string to set
     */
    public void setString(String string) {
        this.string = string;
    }
    
    @Override
    public String toString(){
        String s = "";
        s += "Word " + string + ":\n";
        s += "Present in ";
        if(indexes.size() > 0){
            s += indexes.toString();
        }
        else{
            s += "no documents.";
        }
        return s;
    }

    @Override
    public int compareTo(Word w) {
        return w.getString().compareTo(this.string);
    }
}
