package hojung.worldSoccerPrediction.project.domain.member;

import hojung.worldSoccerPrediction.project.domain.prediction.Prediction;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="member")
@Getter
@Setter
@NoArgsConstructor
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id", updatable = false)
    private Long id;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "success_count")
    private int successCount;

    @Column(name = "fail_count")
    private int failCount;

    @OneToMany(mappedBy = "member")
    private List<Prediction> predictions;

    @Builder
    public Member(Long id, String nickname, String email, String password) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.successCount = 0;
        this.failCount = 0;
        this.predictions = new ArrayList<>();
    }
}
