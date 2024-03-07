package übungsaufgaben.enumerations;

public enum Engine {
    DIESEL("Disel"),
    PETROL("Benzin"),
    GAS("Autogas"),
    ELECTRO("Elektro");
    private String description;
    Engine(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
}
