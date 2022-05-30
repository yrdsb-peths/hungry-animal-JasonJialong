import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meadows extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public int score = 0;
    Label scoreLabel;
    
    public Meadows()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        //Create a new Bee object
        Bee hungryBoy = new Bee();
        addObject(hungryBoy, 100, 300);
        
        //Create a new Bomb object
        Bomb explodyBoy = new Bomb();
        addObject(explodyBoy, 200, 0);
        
        //Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createFlower();
    }
    
    /**
     * Ends the game and draws 'Game Over'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    /**
     * Increases score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    
    /**
     * Creates a new food at random location at top of the screen
     */
    public void createFlower()
    {
        Flower flower = new Flower();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(flower, x, y);
    }

}
