package main.java.com.conceptcoding.interviewquestions.cricbuzz.Inning;

import main.java.com.conceptcoding.interviewquestions.cricbuzz.MatchType;
import main.java.com.conceptcoding.interviewquestions.cricbuzz.Team.Player.PlayerDetails;
import main.java.com.conceptcoding.interviewquestions.cricbuzz.Team.Team;

import java.util.ArrayList;
import java.util.List;

public class InningDetails {
    Team battingTeam;
    Team bowlingTeam;
    MatchType matchType;
    List<OverDetails> overs;

    public InningDetails(Team battingTeam, Team bowlingTeam, MatchType matchType){
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.matchType = matchType;
        overs = new ArrayList<>();
    }

    public void start(int runsToWin){
        //set batting players
        try {
            battingTeam.chooseNextBatsMan();
        }catch (Exception e){

        }

        int noOfOvers = matchType.noOfOvers();
        for(int overNumber =1; overNumber<=noOfOvers; overNumber++){

            // choose bowler
            bowlingTeam.chooseNextBowler(matchType.maxOverCountBowlers());

            OverDetails over = new OverDetails(overNumber, bowlingTeam.getCurrentBowler());
            overs.add(over);

            try{
                boolean won = over.startOver(battingTeam, bowlingTeam, runsToWin);
                if(won == true){
                    break;
                }
            }catch (Exception e){
                break;
            }

            PlayerDetails temp = battingTeam.getStriker();
            battingTeam.setStriker(battingTeam.getNonStriker());
            battingTeam.setNonStriker(temp);
        }
    }

    public int getTotalRuns(){
        return battingTeam.getTotalRuns();
    }
}
