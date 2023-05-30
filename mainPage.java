import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainPage extends World
{

    /**
     * Constructor for objects of class mainBackground.
     * 
     */
    GreenfootSound backSound = new GreenfootSound("backSound.wav");
    public static int soundCount = 0;
    public static int soundBug = 2;
    public mainPage()
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
        start start = new start();
        addObject(start,252,355);
        hint hint = new hint();
        addObject(hint,252,469);
        sound sound = new sound();
        addObject(sound,457,40);
    }
    
    public void act(){
        if(soundCount % 2 == 0){
        backSound.playLoop();
    } else if(soundCount % 2 == 1){
        backSound.stop();
    }

    //showText("sound bug: " + soundBug, 15, 15);
    //showText("sound count: " + soundCount, 15, 35);
    }
}
