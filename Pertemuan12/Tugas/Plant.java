package Pertemuan12.Tugas;

public class Plant {
    public void doDestroy(Destroyable d){
        if (d instanceof WalkingZombie) {
            WalkingZombie wz = (WalkingZombie)d;
            wz.destroyed();
        }else if (d instanceof JumpingZombie) {
            JumpingZombie jz = (JumpingZombie)d;
            jz.destroyed();
        }else if (d instanceof Barrier) {
            Barrier br = (Barrier)d;
            br.destroyed();
        }
    }
}
