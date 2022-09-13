package hojung.worldSoccerPrediction.project.service.prediction;

import hojung.worldSoccerPrediction.project.domain.prediction.Prediction;

import java.util.List;

public interface PredictionService {
    Prediction addPrediction(Prediction prediction, Long memberId);// 예측 생성

    List<Prediction> getPredictionByMemberId(Long memberId);// 회원으로 예측 조회 -> Member

    void changePrediction(Prediction prediction);// 예측 수정

    void deletePrediction(Long memberId, Long predictId);// 예측 삭제
}
