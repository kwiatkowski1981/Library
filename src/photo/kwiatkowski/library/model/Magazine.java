package photo.kwiatkowski.library.model;

public class Magazine extends Publication {

    private int month;
    private int day;
    private String language;


    public Magazine(int month, int day, String language) {
        this.month = month;
        this.day = day;
        this.language = language;
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
