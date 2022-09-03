package hojung.worldSoccerPrediction.domain.match;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "match")
@Getter
//@NoArgsConstructor
public class Match {

    @Id @GeneratedValue
    @Column(name = "match_id", updatable = false)
    private Long id;

    @Column(name = "home_team")
    private String homeTeam;

    @Column(name = "away_team")
    private String awayTeam;

    @Column(name = "match_datetime")
    private LocalDateTime matchDateTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "league")
    private MatchLeague league;

    @Column(name = "round")
    private int round;

    @Enumerated(EnumType.STRING)
    @Column(name = "result")
    private MatchResult result;

    @Builder
    public Match(Long id, String homeTeam, String awayTeam, MatchLeague league, int round, MatchResult result) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.matchDateTime = LocalDateTime.now();
        this.league = league;
        this.round = round;
        this.result = MatchResult.READY;
    }

    public void winTeam(String winTeam) {
        if (winTeam.equals(homeTeam)){
            this.result = MatchResult.WIN;
        }
        else if(winTeam.equals(awayTeam)){
            this.result = MatchResult.LOSE;
        }
        else this.result = MatchResult.DRAW;
    }

    public void setResult(MatchResult result) {
        this.result = result;
    }

    public Match(Long id, String awayTeam, LocalDateTime matchDateTime, MatchLeague league) {
        this.id = id;
        this.awayTeam = awayTeam;
        this.matchDateTime = matchDateTime;
        this.league = league;
    }

    public void getResult(MatchResult result) {
        this.result = getResult();

    }
}
