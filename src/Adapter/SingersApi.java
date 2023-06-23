package Adapter;

public class SingersApi implements ContactsService{

    private final String[] MOCK_DB_NAMES = {
            "Mehmet", "Chaya", "Kiran", "Iwan", "Kiara"
    };
    private final String[] MOCK_DB_LAST_NAMES = {
            "Cotton", "Vang", "Bauer", "Cervantes", "Estrada"
    };

    @Override
    public String[] getAllNames() {
        return MOCK_DB_NAMES;
    }

    @Override
    public String[] getAllLastNames() {
        return MOCK_DB_LAST_NAMES;
    }
}
