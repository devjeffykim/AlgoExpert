import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner {
    public String solution1Winner( ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results){
        System.out.println(competitions.toString());
        System.out.println(results.toString());
        String winner ="";
        HashMap<String, Integer> scoreboard = new HashMap<String, Integer>();
        for(int i =0; i<competitions.size(); i++){
            int teamWinner = results.get(i)==1 ? 0:1;
            String matchWinner = competitions.get(i).get(teamWinner);
            if(scoreboard.containsKey(matchWinner)){
                scoreboard.replace(matchWinner, scoreboard.get(matchWinner)+3);
            }else{
                scoreboard.put(matchWinner, 3);
            }
            if(winner ==""){
                winner = matchWinner;
            }else{
                if(scoreboard.get(winner)<scoreboard.get(matchWinner) && !winner.equals(matchWinner)){
                    winner = matchWinner;
                }
            }
        }
        System.out.println(scoreboard.toString());
        System.out.println(winner);
        return winner;
    }
}
