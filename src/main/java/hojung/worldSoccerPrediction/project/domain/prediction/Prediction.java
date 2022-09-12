package hojung.worldSoccerPrediction.project.domain.prediction;

import hojung.worldSoccerPrediction.project.domain.match.Match;
import hojung.worldSoccerPrediction.project.domain.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "prediction")
@Getter
@Setter
public class Prediction {

    @Id @GeneratedValue
    @Column(name = "prediction_id", updatable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "predict")
    private PredictStatus predictStatus;

    @Column(name = "result")
    private Boolean result;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToOne
    @JoinColumn(name = "match_id")
    private Match match;


    @Builder
    public Prediction(Long id, PredictStatus predictStatus, @NonNull Member member, @NonNull Match match) {
        this.id = id;
        this.predictStatus = predictStatus;
        this.member = member;
        this.match = match;
        this.result = null;
    }
}
