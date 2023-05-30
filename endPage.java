import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class endPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endPage extends World
{

    /**
     * Constructor for objects of class endPage.
     * 
     */
    public endPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 700, 1); 
        prepare();
    }

    public void act(){
        score();
        
    }

    public void score(){
        if (MyWorld.printScore == MyWorld.high){
            highscore highscore = new highscore();
            addObject(highscore,377,159);
        }
        
        showText("Score : " + MyWorld.printScore, 250, 340);
        showText("Highscore : " + MyWorld.high, 250, 380);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        exit exit = new exit();
        addObject(exit,202,455);
        retry retry = new retry();
        addObject(retry,301,455);

    }
}
