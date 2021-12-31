import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TournamentWinnerTest {
    private final TournamentWinner tournamentWinner = new TournamentWinner();
    //Initializing all the test cases for the tournament winner. We can use this to reuse it for the different solutions
    private static final ArrayList<ArrayList<String>> case1Competitions = new ArrayList<ArrayList<String>>();
    private static final ArrayList<Integer> case1Results = new ArrayList<>();

    private static final ArrayList<ArrayList<String>> case2Competitions = new ArrayList<ArrayList<String>>();
    private static final ArrayList<Integer> case2Results = new ArrayList<>();

    private static final ArrayList<ArrayList<String>> case3Competitions = new ArrayList<ArrayList<String>>();
    private static final ArrayList<Integer> case3Results = new ArrayList<>();

    @BeforeAll
    static void initAll() {
        case1Competitions.add(new ArrayList<String>(Arrays.asList("HTML", "C#")));
        case1Competitions.add(new ArrayList<String>(Arrays.asList("C#", "Python")));
        case1Competitions.add(new ArrayList<String>(Arrays.asList("Python", "HTML")));
        case1Results.add(0);
        case1Results.add(0);
        case1Results.add(1);

        case2Competitions.add(new ArrayList<String>(Arrays.asList("HTML", "Java")));
        case2Competitions.add(new ArrayList<String>(Arrays.asList("Java", "Python")));
        case2Competitions.add(new ArrayList<String>(Arrays.asList("Python", "HTML")));
        case2Results.add(0);
        case2Results.add(1);
        case2Results.add(1);

        case3Competitions.add(new ArrayList<String>(Arrays.asList("HTML", "Java")));
        case3Competitions.add(new ArrayList<String>(Arrays.asList("Java", "Python")));
        case3Competitions.add(new ArrayList<String>(Arrays.asList("Python", "HTML")));
        case3Competitions.add(new ArrayList<String>(Arrays.asList("C#", "Python")));
        case3Competitions.add(new ArrayList<String>(Arrays.asList("Java", "C#")));
        case3Competitions.add(new ArrayList<String>(Arrays.asList("C#", "HTML")));
        case3Results.add(0);
        case3Results.add(1);
        case3Results.add(1);
        case3Results.add(1);
        case3Results.add(0);
        case3Results.add(1);
    }
    @Test
    void solution1Case1() {
        assertEquals("Python", tournamentWinner.solution1Winner(case1Competitions, case1Results));
    }
    @Test
    void solution1Case2() {
        assertEquals("Java", tournamentWinner.solution1Winner(case2Competitions, case2Results));
    }

    @Test
    void solution1Case3() {
        assertEquals("C#", tournamentWinner.solution1Winner(case3Competitions, case3Results));
    }
}