import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class orange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class orange extends Fruit
{
    /**
     * Act - do whatever the orange wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        pmScore();
        if (getWorld() == null) return;
        fruitMove();
    }
    
    public void pmScore(){
        if(MyWorld.randBox == 0){
            if(isTouching(mouth.class)){
                ugh.play();
                MyWorld.score -= 50;
                if (getWorld() == null) return;
                getWorld().removeObject(this);
            }
        } else if(MyWorld.randBox == 1){
            if(isTouching(mouth.class)){
                ugh.play();
                MyWorld.score -= 50;
                if (getWorld() == null) return;
                getWorld().removeObject(this);
            }
        } else if(MyWorld.randBox == 2){
            if(isTouching(mouth.class)){
                ugh.play();
                MyWorld.score -= 50;
                if (getWorld() == null) return;
                getWorld().removeObject(this);
            }
        } else if(MyWorld.randBox == 3){
            if(isTouching(mouth.class)){
                ugh.play();
                MyWorld.score -= 50;
                if (getWorld() == null) return;
                getWorld().removeObject(this);
            }
        } else if(MyWorld.randBox == 4){
            if(isTouching(mouth.class)){
                bite.play();
                MyWorld.score += 100;
                if (getWorld() == null) return;
                getWorld().removeObject(this);
            }
        }
    }
}
