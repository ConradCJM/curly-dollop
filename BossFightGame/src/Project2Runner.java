import java.util.ArrayList;

public class Project2Runner {
    
    /*
     * Name: CJ Mejia
     * Student ID: 501303918
     * 
     ******** Project Description ********
     * 
     * Describe in plain English the overall program/program in a paragraph or 2.
     * 
     *
     * 
     ******** Swing Requirement ********
     * 
     * Describe in 1 paragraph how your program satisfies the requirement that
     * there is at least 3 unique components. Be clear to identify in what
     * files and the lines number (just the starting line is fine) that the
     * components are defined on.
     * 
     * 
     * 
     ******** 2D Graphics Requirement ********
     *
     * Describe in 1 paragraph how your program satisfies the requirement that
     * there is at least 1 JPanel used for drawing something. Be clear to
     * identify in what files and the line numbers that this panel is defined on.
     * 
     * 
     * 
     ******** Event Listener Requirement ********
     *
     * Describe in 1 paragraph how your program satisfies the requirement that
     * there is at least one ActionListener, and there is additionally at least
     * one MouseListener or ActionListener. Be clear to identify in what file
     * and the line numbers that these listeners are defined in.
     */

    public static void main(String[] args) {
        
        //Declare Objects
        GameWindow game;
        GameOverMenu endMenu;

        
        //create start menu
        StartMenu menu = new StartMenu();

        //loop game until player wants to stop using end menu quit button
        do{

            //pause until player input
            menu.pause();

            //play game
            game = new GameWindow();
            game.animate();

            //Pause before giving final menu
            try {
                Thread.sleep(1500);
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }

            //Gameover  menu
            endMenu = new GameOverMenu();

            //pause until player input
            endMenu.pause();
            
            game.close();
            

            //loop until user quits using the quit button
        }while(true);
    }
}
