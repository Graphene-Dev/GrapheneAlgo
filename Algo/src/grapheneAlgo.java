import javax.management.RuntimeErrorException;
import java.util.*;


public class grapheneAlgo {
    private int length;
    private int difficulty;
    private ArrayList<String> toHash;
    private String hash;
    private boolean hashed = false;

    //constructor
    public grapheneAlgo(int length, int difficulty) {
        this.length = length;
    }
    //accesors (no need to access the toHash)
    public int getLength() {
        return length;
    }
    public int getDifficulty() {
        return difficulty;
    }
    public boolean isHashed() {
        return hashed;
    }
    public String getHash() throws Exception {
        if (hashed) {
            return hash;
        } else {
            throw new Exception(null);//Maybe just return -1?
        }

    }



    //add contents
    public void addToHash(String toAdd) {//no position
        toHash.add(toAdd);
    }
    public void addToHash(String toAdd, int position) {//with position
        toHash.add(position, toAdd);
    }

}
