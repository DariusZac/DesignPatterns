package Strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        TournamentBoard sortedByNickNameBoard = new TournamentBoard(new SortByNameStrategy());
        sortedByNickNameBoard.showBoard();

        TournamentBoard sortedByScore = new TournamentBoard(new SortByPlaceStrategy());
        sortedByScore.showBoard();

        TournamentBoard sortedByDate = new TournamentBoard(new SortByDateStrategy());
        sortedByDate.showBoard();
    }
}
