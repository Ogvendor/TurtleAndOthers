package C1;

public class Bike {
    private boolean isOn;
    private int speed ;
    private int gear;


    public Bike() {

    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean switchOff() {
        return false;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setGear(int gear){
        this.gear = gear;
    }
    public int getGear(){
        return gear;
    }



    public int getSpeed() {
        return speed;

    }

    public boolean switchOn() {
        return true;
    }

    public void accelerate() {
        if (isOn == true && gear == 1 && speed <= 20) {
            speed = speed + 1;
        }
        if (isOn == true && gear == 2 && speed > 20) {
            speed = speed + 2;
        }
        if (isOn == true && gear == 3 && speed > 30) {
            speed = speed + 3;
        }
        if (isOn == true && gear == 4 && speed > 40) {
            speed = speed + 4;
        }


        }

    public void decelerate() {
        if(isOn == true && gear == 4 && speed <=40){
            speed = speed - 4;
        }
        if(isOn == true && gear == 3 && speed <= 30){
            speed = speed - 3;
        }
        if(isOn == true && gear == 2 && speed <=20 ){
             speed = speed - 2;
        }
        if(isOn == true && gear == 1 && speed <= 10){
            speed = speed - 1;
        }
    }
}
