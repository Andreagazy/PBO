package Pertemuan12.Tugas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += health * 10 / 100;
        } else if (level == 2) {
            health += health * 30 / 100;
        } else if (level == 3) {
            health += health * 40 / 100;
        }else{
            super.heal();
        }
    }

    @Override
    public void destroyed() {
        if (health<=0) {
            System.out.println("Zombie Telah Dihancurkan");
        }else{
            health -= health*20/100;
        }
    }

    @Override
    public String getZombieInfo() {
    
        return "Walking Zombie Data =\n"+super.getZombieInfo();
    }
}
