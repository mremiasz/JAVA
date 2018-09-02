package data;

import java.io.Serializable;
import java.time.LocalDate;

public class Publication implements Serializable, Comparable <Publication> {
    private static final long serialVersionUID = 1984321894963513156L;
    private LocalDate date;
    private String title;
    private String publisher;

    public LocalDate getDate() {
        return date;
    }
    protected void setDate(LocalDate date){
        this.date = date;
    }

    public int getYear(){
        return date.getYear();
    }
    String getTitle() {
        return title;
    }
    private void setTitle(String title) {
        this.title = title;
    }
    String getPublisher() {
        return publisher;
    }
    private void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    Publication(int year, String title, String publisher) {
        setDate(LocalDate.of(year,1,1));
        setTitle(title);
        setPublisher(publisher);
    }

    public int compareTo(Publication o){
        return title.compareTo(o.getTitle());
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Publication other = (Publication) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (publisher == null) {
            if (other.publisher != null)
                return false;
        } else if (!publisher.equals(other.publisher))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }
}