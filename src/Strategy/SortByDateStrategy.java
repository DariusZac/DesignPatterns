package Strategy;

import java.util.Comparator;
import java.util.List;

public class SortByDateStrategy implements BoardStrategy {
    @Override
    public void showBoard(List<TournamentBoard> boardList) {
        Comparator<TournamentBoard> dateComparator = Comparator.comparing(TournamentBoard::getTournamentDate);
        boardList.sort(dateComparator.reversed());
        System.out.println(boardList);
    }
}
