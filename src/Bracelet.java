public class Bracelet {

    public String media;
    public String color;
    public boolean adjustable;
    public int lifeSpan;
    public int width;

    public void printInfo() {
        System.out.println("The bracelet's medium is: " + media);
        System.out.println("The bracelet's colors are: " + color);
        if (adjustable == true) {
            System.out.println("The bracelet is adjustable");
        } else {
            System.out.println("The bracelet is not adjustable");
        }
        System.out.println("In years, the bracelet will last for: " + lifeSpan);
        System.out.println("The width of the bracelet in centimeters is: " + width + "\n");


    }

    public Bracelet(String paramMedia, String paramColor, boolean paramAdjustable, int paramLifeSpan, int paramWidth) {
        media = paramMedia;
        color = paramColor;
        adjustable = paramAdjustable;
        lifeSpan = paramLifeSpan;
        width = paramWidth;


    }

}
