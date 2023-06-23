package Adapter;

import java.util.ArrayList;

public class ActorsServiceAdapter implements ContactsService{

    private ActorsApi actorsApi;

    public ActorsServiceAdapter() {
        this.actorsApi = new ActorsApi();
    }

    @Override
    public String[] getAllNames() {
        String[] fullNames = actorsApi.getFullNames();
        ArrayList<String> namesOnly = new ArrayList<>();
        for (String name : fullNames) {
            String[] split = name.split(" ");
            namesOnly.add(split[0]);
        }
        return namesOnly.toArray(new String[0]);
    }

    @Override
    public String[] getAllLastNames() {
        String[] fullNames = actorsApi.getFullNames();
        ArrayList<String> namesOnly = new ArrayList<>();
        for (String name : fullNames) {
            String[] split = name.split(" ");
            namesOnly.add(split[1]);
        }
        return namesOnly.toArray(new String[0]);
    }
}
