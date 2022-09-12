package hojung.worldSoccerPrediction.domain.member;

import hojung.worldSoccerPrediction.project.domain.match.Match;
import hojung.worldSoccerPrediction.project.domain.match.MatchLeague;
import hojung.worldSoccerPrediction.project.domain.match.MatchResult;
import hojung.worldSoccerPrediction.project.domain.member.Member;
import hojung.worldSoccerPrediction.project.domain.prediction.PredictStatus;
import hojung.worldSoccerPrediction.project.domain.prediction.Prediction;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PredictionTest {

    @Test
    void predictionTest() {
        Match match = Match.builder()
                .homeTeam("토트넘")
                .awayTeam("아스날")
                .league(MatchLeague.EPL)
                .round(13)
                .result(MatchResult.WIN)
                .build();

        Prediction prediction = Prediction.builder()
                .member(new Member())
                .match(match)
                .predictStatus(PredictStatus.WIN) //homeTeam 기준
                .build();

        assertThat(prediction.getMatch().getHomeTeam()).isEqualTo("토트넘");
    }
}
