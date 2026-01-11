package main.java.com.conceptcoding.interviewquestions.cricbuzz.Team.Player;

import java.util.*;

public class PlayerBowlingController {
    Deque<PlayerDetails> bowlerList;
    Map<PlayerDetails, Integer> bowlerVsOverCount;
    PlayerDetails currentBowler;

    public PlayerBowlingController(List<PlayerDetails> bowlers){
        setBowlersList(bowlers);
    }

    private void setBowlersList(List<PlayerDetails> bowlersList) {
        this.bowlerList = new LinkedList<>();
        bowlerVsOverCount = new HashMap<>();
        for(PlayerDetails bowler : bowlersList){
            this.bowlerList.add(bowler);
            bowlerVsOverCount.put(bowler, 0);
        }
    }

    public void getNextBowler(int maxOverCountPerBowler){
        PlayerDetails playerDetails = bowlerList.poll();
        if(bowlerVsOverCount.get(playerDetails)+1 == maxOverCountPerBowler)
        {
            currentBowler = playerDetails;
        }else {
            currentBowler = playerDetails;
            bowlerList.addLast(playerDetails);
            bowlerVsOverCount.put(playerDetails, bowlerVsOverCount.get(playerDetails)+1);
        }
    }

    public PlayerDetails getCurrentBowler() {
        return currentBowler;
    }
}
