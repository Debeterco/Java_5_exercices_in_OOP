package entities;

public class Tank {
    private Integer tankLevel;

    public Tank(Integer tankLevel) {
        this.tankLevel = tankLevel;
    }

    public Integer getTankLevel() {
        return tankLevel;
    }
    public void setTankLevel(Integer tankLevel) {
        this.tankLevel = tankLevel;
    }

    public void tankSecurity() {
        if(getTankLevel() >= 90) {
            System.out.println("ALERT: Critic level - Open drain valve!");
        }
        else if(getTankLevel() < 10) {
            System.out.println("ALERT: Low level - Activate pump inflaction!");
        }
        else {
            System.out.println("Stable system");
        }
    }
}
