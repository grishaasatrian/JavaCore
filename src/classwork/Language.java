package classwork;

public enum Language {

    HY("Armenia"),
    ENG,
    RU("Russia"),
    FR("France");

    private String country;

    Language(String country) {
        this.country = country;
    }

    Language() {
    }

    public String getCountry() {
        return country;
    }
}