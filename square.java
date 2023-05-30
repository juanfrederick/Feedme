import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class square extends Actor
{
    /**
     * Act - do whatever the square wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(MyWorld.randBox == 0){
            setImage("appleSquare.png");
        } else if(MyWorld.randBox == 1){
            setImage("grapeSquare.png");
        } else if(MyWorld.randBox == 2){
            setImage("melonSquare.png");
        } else if(MyWorld.randBox == 3){
            setImage("bananaSquare.png");
        } else if(MyWorld.randBox == 4){
            setImage("orangeSquare.png");
        }
    }    
}
