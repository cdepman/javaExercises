import java.util.ArrayList;

class RockPaperScissors{

  public static void RPSCombinations(ArrayList<String> playedSoFar, int rounds, ArrayList<ArrayList<String>> results, String[] plays){
    if (playedSoFar.size() == rounds){
      results.add(playedSoFar);
    } else {
      for (int i = 0; i < plays.length; i = i + 1){
        ArrayList<String> playedSoFarCopy = new ArrayList<String>();
        playedSoFarCopy.addAll(playedSoFar);
        playedSoFarCopy.add(plays[i]);
        RPSCombinations(playedSoFarCopy, rounds, results, plays);
      }
    }
  }

  public static void main(String[] args){
    int rounds = 3;

    System.out.println(args[0]);

    if (args[0] != null){
      rounds = Integer.parseInt(args[0]);
    }
    ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
    ArrayList<String> starter = new ArrayList<String>();
    String[] plays = {"Rock", "Paper", "Scissors"};

    RPSCombinations(starter, rounds, results, plays);
    System.out.println(results);
  }
}