import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static int randBox = 5; //untuk random box nama buah
    public static int startBox = 5; //untuk memulai pertama kali
    public static int moveDelay = 0; //untuk menjalankan delay
    public static int score = 0;
    public static int timer = 5000;
    public static int high = 0;
    public static int printScore = 0;
    GreenfootSound ring = new GreenfootSound("ring.wav");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 700, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {   
        //Body
        kid kid = new kid();
        addObject(kid,250,538);
        mouth mouth = new mouth();
        addObject(mouth,247,640);
        leftHand leftHand = new leftHand();
        addObject(leftHand,71,614);
        rightHand rightHand = new rightHand();
        addObject(rightHand,435,612);

        square square = new square();
        addObject(square,247,192);
        eye eye = new eye();
        addObject(eye,293,553);
        eye eye2 = new eye();
        addObject(eye2,204,552);
    }

    public void act(){
        randomFruit();
        delay();
        endGame();
        //showText("moveDelay:" + moveDelay,320, 100);
        //showText("random:" + randBox,320, 120);
        showText("Score : " + score, 420, 15);
        highScore();
    }

    public void randomFruit(){
        if (Greenfoot.getRandomNumber(100) < 2){
            int rand = Greenfoot.getRandomNumber(5);

            if (rand == 0){
                addObject(new apple(), Greenfoot.getRandomNumber(500),0);
            } else if(rand == 1){
                addObject(new grape(), Greenfoot.getRandomNumber(500),0);
            } else if(rand == 2){
                addObject(new melon(), Greenfoot.getRandomNumber(500),0);
            } else if(rand == 3){
                addObject(new banana(), Greenfoot.getRandomNumber(500),0);
            } else if(rand == 4){
                addObject(new orange(), Greenfoot.getRandomNumber(500),0);
            } 
        }
    }

    public void randomBox(){
        randBox = Greenfoot.getRandomNumber(5);
        if(randBox ==0){
            //showText("Apel" , 320, 15);
        } else if(randBox == 1){
            //showText("Anggur", 320, 15);
        } else if(randBox == 2){
            //showText("Melon", 320, 15);
        } else if(randBox == 3){
            //showText("banana", 320, 15);
        } else if(randBox == 4){
            //showText("orange", 320, 15);
        }
    }

    public void delay(){
        moveDelay++;
        if (moveDelay == startBox){
            randomBox();
            moveDelay = 0;
            startBox = 500;
        }
    }
    
    public void endGame(){
        timer--;
        if (timer == 0){
            time time = new time();
            addObject(time,250,350);
            ring.play();
            Greenfoot.delay(50);
            Greenfoot.setWorld(new endPage());
            printScore = score;
            randBox = 5;
            startBox = 5;
            moveDelay = 0;
            score = 0;
            timer = 5000;
        }
        showText("Timer : " + timer, 60, 15);
    }
    
    public void highScore(){
        if(score > high){
            high = score;
        }
        showText("Highscore : " + high , 420, 40);
    }

}
