package hojung.worldSoccerPrediction.domain.member;

import hojung.worldSoccerPrediction.project.domain.match.Match;
import hojung.worldSoccerPrediction.project.domain.match.MatchLeague;
import org.junit.jupiter.api.Test;

public class MatchTest {

    @Test
    void matchBuilderTest() {
        Match match = Match.builder()
                .homeTeam("토트넘")
                .awayTeam("아스날")
                .league(MatchLeague.EPL)
                .round(13)
                .build();
    }
}
