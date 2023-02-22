package ladder.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlayersTest {

    @Test
    @DisplayName("여러 개의 이름을 입력받고 players를 생성한다")
    void shouldCreatePlayersWhenInputStrings() {
        //given
        List<String> names = new ArrayList<>(List.of("a", "ab", "abc"));
        //when
        //then
        assertDoesNotThrow(() -> Players.generate(names));
    }

    @Test
    @DisplayName("플레이어의 수를 반환한다")
    void shouldReturnSizeWhenRequest() {
        //given
        List<String> names = new ArrayList<>(List.of("a", "ab", "abc"));
        //when
        Players players = Players.generate(names);
        //then
        assertThat(players.getSize()).isEqualTo(3);
    }

    @Test
    @DisplayName("플레이어들의 이름을 문자열로 반환한다")
    void shouldReturnNameValuesWhenRequest() {
        //given
        List<String> names = new ArrayList<>(List.of("a", "ab", "abc"));
        //when
        Players players = Players.generate(names);
        //then
        assertThat(players.getNameValues()).containsExactly("a", "ab", "abc");
    }

    @Test
    @DisplayName("플레이어는 2명 이상이여야 한다")
    void shouldMinimum2PlayersWhenCreate() {
        //given
        List<String> names = new ArrayList<>(List.of("a"));
        //when
        //then
        assertThatThrownBy(() -> Players.generate(names))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("플레이어는 최소 2명 이상이여야 합니다");
    }

    @Test
    @DisplayName("플레이어의 위치는 입력 순이다")
    void shouldPlayersOrderIsSameWithInputOrderWhenCreate() {
        //given
        List<String> names = new ArrayList<>(List.of("a", "ab", "abc"));
        //when
        Players players = Players.generate(names);
        List<Player> playerList = players.toUnmodifiablePlayers();
        //then
        assertAll(
                () -> assertThat(playerList.get(0).getPosition()).isEqualTo(new Position(0)),
                () -> assertThat(playerList.get(1).getPosition()).isEqualTo(new Position(1)),
                () -> assertThat(playerList.get(2).getPosition()).isEqualTo(new Position(2))
        );
    }

    @Test
    @DisplayName("플레이어의 이름으로 위치를 알 수 있다")
    void shouldFindPositionWhenInputName() {
        //given
        List<String> names = new ArrayList<>(List.of("a", "b"));
        //when
        Players players = Players.generate(names);
        //then
        assertThat(players.findPositionBy(new Name("a"))).isEqualTo(new Position(0));
    }
}
