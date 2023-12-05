public class Event {

    private Game x;
    public Event(Game x) {
        this.x = x;

    }

    public int randNum() {
        int rand = (int) (Math.random() * 100) + 1;
        return rand;
    }

    public void randEvent() {
        int val = randNum();

        if (val >= 80) {
            System.out.println("Your pig fell down the stairs while trying to fly (-10hp)");
            int stuff = (x.returnHealth() - 10);
            x.setHealth(stuff);

        } else if (val >= 60) {
            System.out.println("Your pig got attacked by a wild dog (-30hp)");
            int stuff = (x.returnHealth() - 30);
            x.setHealth(stuff);

        } else if (val >= 40){
            System.out.println("You found medicine and used it!(+5hp)");
            int stuff = (x.returnHealth() + 5);
            x.setHealth(stuff);

        } else if (val >= 20){
            System.out.println("Nothing happened");

        } else if (val == 1){
            System.out.println("Your Pig Died?(Game Over :c");
            x.setHealth(0);

        } else {
            System.out.println("The weather was very good! Today and nothing unusual happened.");

        }


    }



}