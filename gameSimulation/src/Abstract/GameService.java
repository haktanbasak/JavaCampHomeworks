package Abstract;

import Entities.Game;

public interface GameService {
	void addGame(Game game);
	void deleteGame(Game game);
	void updateGame(Game game);
}
