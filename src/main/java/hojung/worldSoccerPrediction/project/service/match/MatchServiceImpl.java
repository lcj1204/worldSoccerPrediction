package hojung.worldSoccerPrediction.project.service.match;

import hojung.worldSoccerPrediction.project.domain.match.Match;
import hojung.worldSoccerPrediction.project.domain.match.MatchLeague;
import hojung.worldSoccerPrediction.project.repository.match.MatchRepository;

import java.util.Optional;

public class MatchServiceImpl implements MatchService{

    private final MatchRepository matchRepository;

    public MatchServiceImpl(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public Match getMatchByTeam(String teamName) {
        // 홈팀에 없다면 어웨이 팀에서 찾고싶다.
        Match match = matchRepository.findByHomeTeam(teamName)
                .orElseThrow();
        return match;
    }

    @Override
    public Match getMatchByRound(int round) {
        Match match = matchRepository.findByRound(round)
                .orElseThrow();
        return match;
    }

    @Override
    public Match getMatchByLeague(MatchLeague league) {
        Match match = matchRepository.findByLeague(league)
                .orElseThrow();
        return match;
    }

    @Override
    public Match getMatchByWeek(int week) {
        Match match = matchRepository.findByWeek(week)
                .orElseThrow();
        return match;
    }
}
