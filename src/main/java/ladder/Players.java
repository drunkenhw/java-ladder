package ladder;

import java.util.List;
import java.util.stream.Collectors;

public class Players {
    private final List<Player> players;

    public Players(List<String> names) {
        this.players = generatePlayer(names);
    }

    private List<Player> generatePlayer(List<String> names) {
       return names.stream()
                .map(Player::new)
               .collect(Collectors.toList());
    }
}
