package Strategy;

import java.util.Comparator;
import java.util.List;

public class SortByNameStrategy implements BoardStrategy {
    @Override
    public void showBoard(List<TournamentBoard> boardList) {
        Comparator<TournamentBoard> nameComparator = Comparator.comparing(TournamentBoard::getName);
        boardList.sort(nameComparator);
        System.out.println(boardList);
    }
}
