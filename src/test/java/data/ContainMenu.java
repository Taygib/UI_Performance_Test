package data;

public enum ContainMenu {
    SERVICESANDPRODUCTS("Услуги и продукты"),
    VACANCIES("Вакансии");

    private final String title;

    ContainMenu(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}