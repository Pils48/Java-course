package Task_1;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Tester {
    public static void main(String[] args) {
        Area area = new Area();
//        area.addPoint(new Point(100,101));
//        area.addPoint(new Point(902,103));
//        area.addPoint(new Point(104,905));
//        area.addPoint(new Point(906,907));

        area.addPoint(new Point(100,100));
        area.addPoint(new Point(900,100));
        area.addPoint(new Point(100,900));
        area.addPoint(new Point(900,900));

        System.out.println(area.selectPoints(200,700,300,800));
        System.out.println(area.selectPoints(0,500,0,500));
        System.out.println(area.selectPoints(0,500,-1000,100000));
        System.out.println(area.selectPoints(400,2000,500,5000));
        System.out.println(area.selectPoints(-100,1100,-100,1100));
    }
}
