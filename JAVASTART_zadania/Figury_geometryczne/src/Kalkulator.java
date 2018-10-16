public class Kalkulator {
    public Double area(Rectangle rec){
        double height;
        double width;

        height = Math.abs(
                Math.sqrt(
                        Math.pow(
                                (rec.getP2().getX()-rec.getP1().getX()),2
                        ) +
                                Math.pow(
                                        (rec.getP2().getY()-rec.getP1().getY()),2
                                )
                )
        );
        width = Math.abs(
                Math.sqrt(
                        Math.pow(
                                (rec.getP3().getX()-rec.getP2().getX()),2
                        ) +
                                Math.pow(
                                        (rec.getP3().getY()-rec.getP2().getY()),2
                                )
                )
        );

        return height*width;
    }

    public Double area(Circle c){
        return Math.PI*c.getR()*c.getR()/2;
    }

    public String isInside(Circle c, Point p){
        if (
                Math.pow((p.getX()-c.getS().getX()),2)+Math.pow((p.getY()-c.getS().getY()),2) < Math.pow(c.getR(),2)
                ) {
            return "Punkt znajduje się w okręgu";
        } else {
            return "Punkt znajduje sie poza okręgiem";
        }
    }
}