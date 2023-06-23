package Strategy;

import java.util.Comparator;
import java.util.List;

public class SortByPlaceStrategy implements BoardStrategy{
    @Override
    public void showBoard(List<TournamentBoard> boardList) {
        Comparator<TournamentBoard> placeComparator = Comparator.comparing(TournamentBoard::getPlaceInTournament);
        boardList.sort(placeComparator);
        System.out.println(boardList);
    }
}
