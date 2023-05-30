import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fruit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruit extends Actor
{
    /**
     * Act - do whatever the Fruit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound bite = new GreenfootSound("bite.wav");
    GreenfootSound ugh = new GreenfootSound("ugh.wav");
    public void act() 
    {
        
    }
    
    public void fruitMove(){
        setLocation(getX(), getY()+3);
        turn(3);
        
        if(Greenfoot.mouseClicked(this)){
            
            Greenfoot.playSound("click.wav");
            getWorld().removeObject(this);
            
        }
    }
}
