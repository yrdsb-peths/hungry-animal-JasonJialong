import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("d"))
        {
            move(3);
        }
        
        if (Greenfoot.isKeyDown("a"))
        {
            move(-3);
        }
        
        if (isTouching(Flower.class))
        {
            removeTouching(Flower.class);
        }
    }
}
