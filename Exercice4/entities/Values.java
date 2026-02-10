package entities;

public class Values {
    private int listValues;

    public Values(int listValues) {
        this.listValues = listValues;
    }

    public int getListValues() {
        return listValues;
    }
    public void setListValues(int listValues) {
        this.listValues = listValues;
    }
    
    public boolean operatingValues() {
        return listValues == 1;
    }
}
