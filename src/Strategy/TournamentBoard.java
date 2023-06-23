package Strategy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static Utils.Utils.getDate;

public class TournamentBoard {

    private final List<TournamentBoard> DATA_SET = new ArrayList<>();

    private void mockDb() {
        Date date = getDate(2020, 1, 1);
        DATA_SET.add(new TournamentBoard("Nick", 1, date));
        DATA_SET.add(new TournamentBoard("Gordon", 3, date));
        date = getDate(2021, 1, 1);
        DATA_SET.add(new TournamentBoard("Mike", 15, date));
        DATA_SET.add(new TournamentBoard("Nike", 4, date));
        date = getDate(2022, 1, 1);
        DATA_SET.add(new TournamentBoard("David", 6, date));
        DATA_SET.add(new TournamentBoard("Ella", 39, date));
    }

    private String name;
    private int placeInTournament;
    private Date tournamentDate;
    private BoardStrategy strategy;

    public TournamentBoard(BoardStrategy strategy) {
        this.strategy = strategy;
        mockDb();
    }

    public void showBoard() {
        strategy.showBoard(DATA_SET);
    }

    @Override
    public String toString() {
        return "\n" + "HighScoreBoard{" +
                "Name='" + name + '\'' +
                ", Place=" + placeInTournament +
                ", Tournament Date=" + tournamentDate +
                '}';
    }

    private TournamentBoard(String nickName, int highScore, Date tournamentDate) {
        this.name = nickName;
        this.placeInTournament = highScore;
        this.tournamentDate = tournamentDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPlaceInTournament() {
        return placeInTournament;
    }

    public void setPlaceInTournament(int placeInTournament) {
        this.placeInTournament = placeInTournament;
    }

    public Date getTournamentDate() {
        return tournamentDate;
    }

    public void setTournamentDate(Date tournamentDate) {
        this.tournamentDate = tournamentDate;
    }
}
