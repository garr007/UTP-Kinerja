package Exception;

abstract class Character{
    private int defense;
    private int attack;
    private int HP;

    public abstract boolean attack();

    public void receiveDamage(int damage){
        int receiveDamage;
        if (damage > defense){
            receiveDamage = damage - defense;
        }else {
            receiveDamage = 0;
        }
        setHP(HP-receiveDamage);

        if (HP < 0){
        setHP(0);
       } 
        
    }

    public void info(){
        System.out.println("HP\t: " + getHP());
        System.out.println("Attack\t: " + getAttack());
        System.out.println("Defense\t: " + getDefense());
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int hP) {
        HP = hP;
    }

    
}
