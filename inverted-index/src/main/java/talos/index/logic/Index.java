
package talos.index.logic;

/**
 *
 * @author castillobg
 */
public class Index {
    private final int POSITION;
    private final int DOC;

    /**
     * @param position The word's POSITION
     *  @param doc The DOC's index
     */
    public Index(int position, int doc){
        this.DOC = doc;
        this.POSITION = position;
    }
    
    /**
     * @return the index
     */
    public int getPosition() {
        return POSITION;
    }

    /**
     * @return the DOC
     */
    public int getDoc() {
        return DOC;
    }
    
    @Override
    public String toString(){
        String s = "";
        s += "(Doc. " + DOC + ", Pos. " + POSITION + ")\n";
        return s;
    }
}
