package C1;

public class Driller {
    private int calculatePricePerCopy;


    public int calculatePricePerCopy(int copy){

        if ( copy >= 1 && copy <= 4) {
            calculatePricePerCopy = 2 * 2000;
        }
            else if(copy >= 5 && copy <=9){
                calculatePricePerCopy = 6 * 1800;
        }
            else if(copy >= 10 && copy <= 29){
                calculatePricePerCopy = 11 * 1600;
        }
            else if(copy >= 30 && copy <= 49){
                calculatePricePerCopy = 32 * 1500;
        }
            else if(copy >= 50 && copy <= 99){
                calculatePricePerCopy = 52 * 1300;
        }
            else if(copy >= 100 && copy <= 199){
                calculatePricePerCopy = 180 * 1200;
        }
            else if(copy >= 200 && copy <=499){
                calculatePricePerCopy = 220 * 1100;
        }
            else if(copy >= 500){
                calculatePricePerCopy = 100000 * 1000;
        }
        return calculatePricePerCopy;
    }



}
