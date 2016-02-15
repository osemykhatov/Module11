package Module4_1_3;

public class Celsius {

   private static final int BASE = 32;
   private static final float FACTOR = 1.8f;

   private int tempCels;
   private float celsToFahr;
   private float tempFahr;
   private float fahrToCels;

// Градусы по Фаренгейту = (градусы по Цельсию x 1.8) + 32
// Градусы по Цельсию = (градусы по Фаренгейту - 32) / 1.8

    Celsius(int tempCels) {
        this.tempCels = tempCels;
        this.celsToFahr = BASE+(FACTOR * tempCels);

            }

    public float getCelsToFahr()
    {
        return this.celsToFahr;
    }

    Celsius(float tempFahr){
        this.tempFahr = tempFahr;
        this.fahrToCels = Math.round((tempFahr - BASE) / FACTOR);
    }


    public float getFahrToCels() {
        return fahrToCels;
    }







}
