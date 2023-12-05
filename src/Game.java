import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Game {

    private int checker;
    private int happiness;
    private int health;
    private boolean lifeStatus;
    private int token;
    private String name;
    private int day;


    public Game() {
        this.health = 100;
        this.happiness = 40;
        this.token = 0;
        this.day = 1;
        this.lifeStatus = true;

        Scanner scan = new Scanner(System.in);
        Shop shop = new Shop(token);//
        TokenSystem TokenSystem = new TokenSystem(token);

        System.out.println("What do you want to name your pet? ");
        name = scan.nextLine();
        //gameMenu();
    }


    public ImageIcon background(ImageIcon x) {

        if (happiness >= 50){
            return new ImageIcon("src/niceboi.jpg");
        }
        else if (happiness >= 40) {
            return new ImageIcon("src/happyBoi.jpg");

        }else if (happiness >= 30)
        {   return new ImageIcon("src/scared.jpg");
        } else if (happiness >= 10)
        {   return new ImageIcon("src/injuredRuben");
        }else{



        return new ImageIcon("src/test.jpg");}
    }


    public void gameMenu() {
        System.out.println("Day: "+day);
        System.out.println("Health: " + health);
        System.out.println("Happiness: " + happiness);


        Scanner scan = new Scanner(System.in);

        TokenSystem ty = new TokenSystem(token);
        Shop shop = new Shop(token);
        System.out.println("Token Amount: "+ token);
        System.out.print("Menu:\n1)Shop\n2)Daily Token");
        int menuInput = scan.nextInt();
        if (menuInput == 1) {


            shop.Shoppify();
            health+=shop.getHealthChange();
            happiness+= shop.getHappinessChange();
            token+=shop.getTokenChange();

            System.out.println("--------------------------------------");


        } else if (menuInput == 2) {

            ty.question();
            token += ty.getTokenEarned();


        }else {
            System.out.print("Error");
        }

        day++;





    }
    public int returnToken(){
        return token;
    }


    public int returnDay(){
        return day;
    }


    public int returnHealth(){
        return health;
    }


    public int returnHappiness(){
        return happiness;
    }


    public int returnRound(){
        return day;
    }


    public void setHealth(int x){
        this.health = x;
    }

    public void setChecker(int x){
        this.checker = x;
    }

    public int returnChecker(){
        return checker;
    }


    public void setRound(int x){
        this.token = x;
    }


    public void setHappiness(int x){
        this.happiness = x;
    }




    public int randNum(){
        int rand = (int)(Math.random()*100)+1;
        return rand;
    }


    public String returnName(){
        return name;
    }


    public void statusCheck(){
        if(happiness>90 && health<=0){
            System.out.println("Your pig lived a fufilling life and died peacfully");


        }
        else if(happiness>50 && health<=0){
            System.out.println("Your pig lived a semi fufilling life and died peacfully");


        }


        else if(happiness>25 && health<=0){
            System.out.println("Your pig lived a barely fufilling life and died tragically. Most people will now look at you diffrently");




        }
        else if(happiness<=25 && health<=0){
            System.out.println("Your pig is dead. You are complete scum and no one no longer likes and you die lonley and alone.");


        }
    }





}


