public class BraceletHQ {

    public static void main(String[] args) {
        BraceletHQ myFactory = new BraceletHQ();
    }

    public BraceletHQ() {
        Bracelet yarn; //declare strawberry
        yarn = new Bracelet("yarn", "red + black", true, 10, 2);
        //media, color, adjustable, lifespan, width

        yarn.printInfo();

            Bracelet beads; //declare strawberry
            beads = new Bracelet("beads", "pink + white", false, 2, 5);
            //media, color, adjustable, lifespan, width

        beads.printInfo();

        }
    }


