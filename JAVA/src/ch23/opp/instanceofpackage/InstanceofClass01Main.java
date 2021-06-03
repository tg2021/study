package ch23.opp.instanceofpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class InstanceofClass01Main {
    public static void main(String[] args) {
        InstanceofClass01 cmpElecs = new InstanceofClass01Electronics();
        InstanceofClass01 cmpShips = new InstanceofClass01Ship();

        Map<String, Object> hashMap = new HashMap<String, Object>();
        Map<String, Object> treeMap = new TreeMap<String, Object>();

        cmpElecs.builtCompany();

        InstanceofClass01Electronics electronics = new InstanceofClass01Electronics();
        electronics.systemDevice();

        boolean boolcompany = cmpElecs instanceof InstanceofClass01;
        System.out.println("같은가? : " + boolcompany);

        System.out.println();

        boolean boolelectronic = electronics instanceof InstanceofClass01;
        System.out.println("같은가? boolelectronic : " + boolelectronic);

        System.out.println();

        InstanceofClass01Ship ships = new InstanceofClass01Ship();
        boolean booleleships = ships instanceof InstanceofClass01;
        System.out.println("같은가? booleleships : " + booleleships);

        if(ships instanceof InstanceofClass01Ship) {
            System.out.println("조선회사가 맞습니다.");
        }
    }
}
