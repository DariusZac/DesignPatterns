package Adapter;

public class ActorsApi {

    private final String[] MOCK_DB_FULL_NAMES = {
            "Jan Richards", "Demi Reid", "Jane Schroeder", "Orla Friedman", "Kirsten Becker"
    };

    public String[] getFullNames() {
        return MOCK_DB_FULL_NAMES;
    }
}
