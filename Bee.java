import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A very hungry bee
 * 
 * @author Chen
 * @version May 2022
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
        
        eat();
    }
    
    public void eat()
    {
        if (isTouching(Flower.class))
        {
            removeTouching(Flower.class);
            
            MyWorld world = (MyWorld) getWorld();
            world.createFlower();
            
            world.increaseScore();
        }
    }
}
