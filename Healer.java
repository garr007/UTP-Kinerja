package Exception;
import java.util.*;

public class Healer extends Character{

    public int generateRandom(){
        Random rand = new Random();
        int upperbound = 100;
        int random;
        return random = rand.nextInt(upperbound);
    }
   
    public boolean attack(){
        if (generateRandom() > 0 && generateRandom() <= 85){
            return true;
        }else {
            return false;
        }
    }

    public void heal(){
        setHP(getHP() + 25);
    }
}
