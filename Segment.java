public class Segment {

    private Point X;
    private Point Y;

    public Segment(Point X,Point Y) {
        this.X = X;
        this.Y = Y;
    }

    public String toString() {

      System.out.println("Segment[v1=("+ X.getX()+","+X.getY()+"),v2=("+Y.getX()+","+Y.getY()+")");

        return null;
    }
    public double getLength(){

        return Math.sqrt((X.getX()- Y.getX())*(X.getX()-Y.getX()))+((X.getY()-Y.getY())*(X.getY()-Y.getY()));
    }
    public static void main (String[] args){
        Point A = new Point(1,2);
        Point B = new Point(3,1);
        Segment ST = new Segment(A,B);

        ST.toString();
        System.out.println(ST.getLength());

    }
}
