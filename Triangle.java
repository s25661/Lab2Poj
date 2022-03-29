public class Triangle {

    private Point X;
    private Point Y;
    private Point Z;

    public Triangle(Point X, Point Y, Point Z) {

        this.X=X;
        this.Y=Y;
        this.Z=Z;

    }

    public String toString(){

        System.out.println("Triangle[v1=("+X.getX()+","+X.getY()+",v2=("+Y.getX()+","+Y.getY()+",v3=("+Z.getX()+","+Z.getY()+")");

        return null;
    }

    public double getDistances(){

        double XY,YZ,ZX ,obwod;

        XY=Math.sqrt((X.getX()-Y.getX())*(X.getX()-Y.getX())+(Y.getX()-Y.getY())*(Y.getX()-Y.getY()));
        YZ=Math.sqrt((Y.getX()-Y.getY())*(Y.getX()-Y.getY())+(Z.getX()-Z.getY())*(Z.getX()-Z.getY()));
        ZX=Math.sqrt((Z.getX()-Z.getY())*(Z.getX()-Z.getY())+(X.getX()-X.getY())*(X.getX()-X.getY()));
        obwod=(XY+YZ+ZX);

        return (obwod);
    }

    public String getType(){

        double XY,YZ,ZX;

        XY=Math.sqrt((X.getX()-Y.getX())*(X.getX()-Y.getX())+(Y.getX()-Y.getY())*(Y.getX()-Y.getY()));
        YZ=Math.sqrt((Y.getX()-Y.getY())*(Y.getX()-Y.getY())+(Z.getX()-Z.getY())*(Z.getX()-Z.getY()));
        ZX=Math.sqrt((Z.getX()-Z.getY())*(Z.getX()-Z.getY())+(X.getX()-X.getY())*(X.getX()-X.getY()));

        if(XY==YZ && YZ==ZX) return "Trójkąt Równoboczny";
        else if (XY==YZ || YZ==ZX || ZX ==XY) return "Trójkąt Równoramienny";
        else return "Trójkąt Różnoboczny";

    }

    public static void main (String[] args) {

        Point A = new Point(0,0);
        Point B = new Point(3,4);
        Point C = new Point(-3,-4);
        Triangle TR = new Triangle(A,B,C);

        TR.toString();
        System.out.printf("%.1f",TR.getDistances());
        System.out.println("\n" + TR.getType());

    }
}