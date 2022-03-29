
class Point {

    private int x;
    private int y;


    public Point() {
        this.x = 320;
        this.y = 200;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int number) {
        this.x = number;
    }

    public int getY() {
        return y;
    }

    public void setY(int number) {

        this.y = number;
    }

    public Point getCoordinates() {

        return new Point(this.x, this.y);
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setCoordinates(Point punkt) {
        this.x = punkt.getX();
        this.y = punkt.getY();
    }

    public double distance(Point X) {

        double x, y, dlugosc;

        x = X.getX();
        y = X.getY();

        dlugosc = Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));

        return dlugosc;
    }
}
