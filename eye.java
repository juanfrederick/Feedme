import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eye here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eye extends bocilBody
{
    /**
     * Act - do whatever the eye wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int move = 0;
    public void act() 
    {
        move++;
        if(move == 90){
            setImage("wink.png");
        } else if(move == 100){
            setImage("leftEye.png");
        } else if(move == 190){
            setImage("wink.png");
        } else if(move == 200){
            setImage("eye.png");
            move = 0;
        }
    }    
}
