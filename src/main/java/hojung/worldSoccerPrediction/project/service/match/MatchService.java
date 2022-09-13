package hojung.worldSoccerPrediction.project.service.match;

import hojung.worldSoccerPrediction.project.domain.match.Match;
import hojung.worldSoccerPrediction.project.domain.match.MatchLeague;

import java.util.Optional;

public interface MatchService {
    Match getMatchByTeam(String teamName);

    Match getMatchByRound(int round);

    Match getMatchByLeague(MatchLeague league);

    Match getMatchByWeek(int week);
}
