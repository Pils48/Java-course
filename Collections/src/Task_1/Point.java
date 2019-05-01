package Task_1;

public class Point {
    int x,y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "Point[x = " + x + " y = " + y + "]";
    }

    @Override
    public int hashCode(){
        return x * 31 + y * 39;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }

        Point that = (Point) obj;
        return (this.y == that.y) && (this.x == that.x);
    }
}