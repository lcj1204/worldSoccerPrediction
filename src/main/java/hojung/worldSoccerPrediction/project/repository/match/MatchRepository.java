package hojung.worldSoccerPrediction.project.repository.match;

import hojung.worldSoccerPrediction.project.domain.match.Match;
import hojung.worldSoccerPrediction.project.domain.match.MatchLeague;

import java.util.Optional;

public interface MatchRepository {
    Match save(Match match);

    Optional<Match> findById(Long id);
    Optional<Match> findByHomeTeam(String name);
    Optional<Match> findByAwayTeam(String name);
    Optional<Match> findByRound(int round);
    Optional<Match> findByLeague(MatchLeague league);
    Optional<Match> findByWeek(int week);
}
