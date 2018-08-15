package data;

import java.io.Serializable;

public class Publication implements Serializable, Comparable <Publication> {
    private static final long serialVersionUID = 1984321894963513156L;
    private int year;
    private String title;
    private String publisher;

    int getYear() {
        return year;
    }
    private void setYear(int year) {
        this.year = year;
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
        setYear(year);
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
        result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + year;
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
        if (year != other.year)
            return false;
        return true;
    }


}
