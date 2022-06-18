package Exception;
import java.util.*;
public class Warrior extends Character{

    public int generateRandom(){
        Random rand = new Random();
        int upperbound = 100;
        int random;
        return random = rand.nextInt(upperbound);
    }
   
    public boolean attack(){
        if (generateRandom() > 0 && generateRandom() <= 60){
            return true;
        }else {
            return false;
        }
    }
}
