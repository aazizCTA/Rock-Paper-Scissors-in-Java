import com.cta.training.rockpaperscissors.Game;
import com.cta.training.rockpaperscissors.User;

public class App {
    public static void main(String[] args) {

        User user = new User();
        user.setUser();
        System.out.println("Hi "+user.getUser()+", welcome to the game.");

        Game game = new Game();
        game.playGame();

    }
}
