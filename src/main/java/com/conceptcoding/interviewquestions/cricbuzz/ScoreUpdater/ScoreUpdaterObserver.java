package main.java.com.conceptcoding.interviewquestions.cricbuzz.ScoreUpdater;

import main.java.com.conceptcoding.interviewquestions.cricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {
    public void update(BallDetails ballDetails);
}
