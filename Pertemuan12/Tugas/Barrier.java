package Pertemuan12.Tugas;

public class Barrier implements Destroyable{
    private int strength;

    public Barrier(int strength){
        this.strength=strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
    if (strength<=0) {
        System.out.println("Barrier Telah Dihancurkan");
    }else{
        strength-=9;
    }
    }

    public String getBarrierInfo(){
        return "Barrier Strength = "+strength+"\n";
    }
    
}