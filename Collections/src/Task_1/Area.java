package Task_1;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Area {
    private final NavigableSet<Point> xIndex = new TreeSet<Point>(new Comparator<Point>(){

        @Override
        public int compare(Point point1, Point point2) {
            if(point1.x - point2.x == 0){
                return point1.y - point2.y;
            }else{
                return point1.x - point2.x;
            }
        }
    });
    private final NavigableSet<Point> yIndex = new TreeSet<Point>(new Comparator<Point>() {
        @Override
        public int compare(Point point1, Point point2) {
            if(point1.y - point2.y == 0){
                return point1.x - point2.x;
            }else{
                return point1.y - point2.y;
            }
        }
    });

    void addPoint(Point point){
        xIndex.add(point);
        yIndex.add(point);
    }

    Collection<Point> selectPoints(
            int leftX, int rightX, int bottomY, int topY){

        Point leftEdge = new Point(leftX,0);
        Point rightEdge = new Point(rightX,0);
        Point bottomEdge = new Point(0,bottomY);
        Point topEdge = new Point(0,topY);

            Collection<Point> xSelection = xIndex.subSet(leftEdge, true, rightEdge,true);
            Collection<Point> ySelection =yIndex.subSet(bottomEdge,true,topEdge,true);
            xSelection.retainAll(ySelection);
            return xSelection;
    }
}

