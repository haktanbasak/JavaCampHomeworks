package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface GameSaleService {
	void gameSell(Game game, Player player, Campaign campaign);
}
