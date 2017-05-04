import org.newdawn.slick.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Class extends BasicGame {

    public Class(String title) {
        super(title);
    }

    public void init(GameContainer gameContainer) throws SlickException {

    }

    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }

    public static void main(String[] args) {
        try{
            AppGameContainer appGameContainer;
            appGameContainer = new AppGameContainer(new Class("simple slick game"));
            appGameContainer.setDisplayMode(1280,720,false);
            appGameContainer.start();
        } catch (SlickException e) {
            Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
