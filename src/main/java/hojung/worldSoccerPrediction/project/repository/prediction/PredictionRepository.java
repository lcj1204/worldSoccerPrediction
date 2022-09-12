package hojung.worldSoccerPrediction.project.repository.prediction;

import hojung.worldSoccerPrediction.project.domain.prediction.PredictStatus;
import hojung.worldSoccerPrediction.project.domain.prediction.Prediction;

import java.util.Optional;

public interface PredictionRepository {
    Prediction save(Prediction prediction, Long memberId);

    Optional<Prediction> findById(Long id);
    Optional<Prediction> findByPredictStatus(PredictStatus predictStatus);
    Optional<Prediction> findByResult(Boolean result);

    void deletePredictionById(Long id);
}
