package main.java.com.conceptcoding.interviewquestions.cricbuzz.Team;

import main.java.com.conceptcoding.interviewquestions.cricbuzz.Inning.BallDetails;
import main.java.com.conceptcoding.interviewquestions.cricbuzz.Inning.OverDetails;
import main.java.com.conceptcoding.interviewquestions.cricbuzz.Team.Player.PlayerDetails;

import java.security.PublicKey;

public class Wicket {
    public WicketType wicketType;
    public PlayerDetails takenBy;
    public OverDetails overDetails;
    public BallDetails ballDetails;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, OverDetails overDetails, BallDetails ballDetails) {
        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetails = overDetails;
        this.ballDetails = ballDetails;
    }
}
