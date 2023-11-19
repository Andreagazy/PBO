package Pertemuan12.Tugas;

public class Zombie implements Destroyable  {
    protected int health, level;

    public void heal(){
        health +=100;
    }

    @Override
    public void destroyed() {
        health-=100;
    }

    public String getZombieInfo(){
        return "Health = "+this.health+"\nLevel = "+this.level+"\n";
    }
}
