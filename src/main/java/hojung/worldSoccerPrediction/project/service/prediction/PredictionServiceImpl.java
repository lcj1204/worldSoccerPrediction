package hojung.worldSoccerPrediction.project.service.prediction;

import hojung.worldSoccerPrediction.project.domain.member.Member;
import hojung.worldSoccerPrediction.project.domain.prediction.Prediction;
import hojung.worldSoccerPrediction.project.repository.member.MemberRepository;
import hojung.worldSoccerPrediction.project.repository.prediction.PredictionRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class PredictionServiceImpl implements PredictionService{

    private final PredictionRepository predictionRepository;
    private final MemberRepository memberRepository;

    public PredictionServiceImpl(PredictionRepository predictionRepository, MemberRepository memberRepository) {
        this.predictionRepository = predictionRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public Prediction addPrediction(Prediction prediction, Long memberId) {
        predictionRepository.save(prediction, memberId);
        return null;
    }

    @Override
    public List<Prediction> getPredictionByMemberId(Long memberId) {
        Member findMember = memberRepository.findById(memberId)
                .orElseThrow(() -> {throw new NoSuchElementException();});
        findMember.getPredictions();
        return null;
    }

    @Override
    public void changePrediction(Prediction prediction) {
        Long memberId = prediction.getMember().getId();
        predictionRepository.save(prediction, memberId);
    }

    @Override
    public void deletePrediction(Long memberId, Long predictId) {
        Prediction findPrediction = predictionRepository.findById(predictId)
                .orElseThrow(() -> {
                    throw new NoSuchElementException();
                });

        if(memberId.equals(findPrediction.getMember().getId()))
            predictionRepository.deletePredictionById(predictId);
    }
}
