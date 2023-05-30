import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mouth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mouth extends bocilBody
{
    /**
     * Act - do whatever the mouth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Fruit.class)){
            int rand = Greenfoot.getRandomNumber(2);
            if (rand == 1){
            setImage("chewMouth.png");}
            else{
            setImage("fixMouth.png");}
        }
        }
    }    

