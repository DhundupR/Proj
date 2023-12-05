import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean start = false;

        JFrame frame = new JFrame(); // sets up background
        ImageIcon icon = new ImageIcon("src/Start.jpg"); // sets initial image
        JLabel label = new JLabel(icon);
        frame.add(label);
        label.setIcon(icon);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // everything after this makes sure that the image can be seen
        frame.pack();
        frame.setVisible(true); // final viable code

        while(!start){
            System.out.println("Welcome to the game type y to start ");
            if (scan.nextLine().equals("y")){ start = true;}
        }

        icon = new ImageIcon("src/babyPig.jpg");
        label.setIcon(icon);

        Game gm = new Game();

        while (gm.returnHealth() > 0) {
            if (gm.returnDay() == 1) {
                System.out.println("You just found you forever buddy " + gm.returnName());
                icon = new ImageIcon("src/babyPig.jpg");
                label.setIcon(icon);
            }

            scan.nextLine();// because of this

            icon = new ImageIcon("src/store.jpg");
            label.setIcon(icon);


            gm.gameMenu();

            icon = gm.background(icon);
            label.setIcon(icon);
            scan.nextLine();
            Event ne = new Event(gm);
            System.out.print("Event:");
            ne.randEvent();
            System.out.println("New token amount after day "+ (gm.returnDay()-1) +" is " + gm.returnToken() );
            System.out.println("--------------------------------------");


        }
        icon = new ImageIcon("src/dead.jpg");
        label.setIcon(icon);

        gm.statusCheck();
        System.out.println("Happiness: " + gm.returnHappiness());
        System.out.println("Days Lived: " + (gm.returnDay()-1));
    }

}
