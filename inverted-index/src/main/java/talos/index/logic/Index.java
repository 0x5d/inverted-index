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
public class Index {
    private ArrayList<Integer> positions;
    private int doc;

    /**
     * @param position The word's position
     *  @param doc The doc's index
     */
    public Index(int position, int doc){
        this.doc = doc;
        positions = new ArrayList<>();
        positions.add(position);
    }
    
    /**
     * @return the index
     */
    public ArrayList getPositions() {
        return positions;
    }

    /**
     * @return the doc
     */
    public int getDoc() {
        return doc;
    }
    
    @Override
    public String toString(){
        String s = "";
        for (Integer position : positions) {
            s += "[Doc. " + doc + ", Pos. " + position + "]\n";
        }
        return s;
    }
}
