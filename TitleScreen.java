import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Title Screen
 * 
 * @author Jason Chen
 * @version May 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("Hungry Bee", 70);
    
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject (titleLabel, getWidth()/2, getHeight()/2); 
        prepare();
    }

    public void act()
    {
        //Starts game if spacebar pressed
        if (Greenfoot.isKeyDown("space"))
        {
            Meadows gameWorld = new Meadows();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,517,206);
        bee.setLocation(96,204);
        bee.setLocation(320,304);
        bee.setLocation(280,299);
        bee.setLocation(282,99);
        Label label = new Label("Use {w, a, s, d} to move", 30);
        addObject(label,323,287);
        label.setLocation(362,277);
        Label label2 = new Label("Press Space To Start", 40);
        addObject(label2,299,334);
        label2.setLocation(318,334);
        bee.setLocation(301,107);
        label.setLocation(104,162);
        label2.setLocation(237,273);
        label2.setLocation(310,355);
        label.setLocation(448,295);
        label.setLocation(289,293);
        label.setLocation(307,290);
    }
}
