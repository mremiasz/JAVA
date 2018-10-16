public class Cabrio {
    private String marka;
    private String nazwa;
    private boolean isMoving;
    private boolean isRoofOpen;

    public Cabrio(String marka, String nazwa, boolean isMoving, boolean isRoofOpen) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.isMoving = isMoving;
        this.isRoofOpen = isRoofOpen;
    }

    @Override
    public String toString() {
        return "Cabrio{" +
                "marka='" + marka + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", isMoving=" + isMoving +
                ", isRoofOpen=" + isRoofOpen +
                '}';
    }

    public Cabrio(String marka, String nazwa) {
        this.marka = marka;
        this.nazwa = nazwa;
    }

    public String getMarka() {
        return marka;

    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public boolean isRoofOpen() {
        return isRoofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        if(isMoving){
            System.out.println("Nie mozna otworzyć dachu gdy auto jest w ruchu.");
        }else {
            isRoofOpen = roofOpen;
        }
    }
}
