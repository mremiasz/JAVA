package data;

import java.time.LocalDate;

public class Magazine extends Publication {
    private static final long serialVersionUID = 987987897897987L;

    private String language;

    public int getMonth() {
        return getDate().getMonthValue();
    }

    public int getDay() {
        return getDate().getDayOfMonth();
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Magazine(String title, String publisher, String language, int year, int month, int day) {
        super(year, title, publisher);
        setLanguage(language);
        setDate(LocalDate.of(year,month,day));
    }

    @Override
    public String toString() {
        StringBuilder printer = new StringBuilder(32);
        printer.append(getTitle());
        printer.append("; ");
        printer.append(getPublisher());
        printer.append("; ");
        printer.append(getYear());
        printer.append("-");
        printer.append(getMonth());
        printer.append("-");
        printer.append(getDay());
        printer.append("; ");
        printer.append(getLanguage());

        return printer.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Magazine other = (Magazine) obj;
        if (language == null) {
            if (other.language != null)
                return false;
        } else if (!language.equals(other.language))
            return false;
        return true;
    }
}