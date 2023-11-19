package Pertemuan12.Tugas;

public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += health * 30 / 100;
        } else if (level == 2) {
            health += health * 40 / 100;
        } else if (level == 3) {
            health += health * 50 / 100;
        }else{
            super.heal();
        }
    }

    @Override
    public void destroyed() {
        if (health<=0) {
            System.out.println("Zombie Telah Dihancurkan");
        }else{
            health -= health*10/100;
        }
    }

    @Override
    public String getZombieInfo() {
    
        return "Jumping Zombie Data =\n"+super.getZombieInfo();
    }
}
