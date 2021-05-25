package ch07.iteration;



public class ForClass03 {
    public static void main(String[] args) {
        
        int[] arrIntData = new int[5];
        arrIntData[0] = 10;
        arrIntData[1] = 5;
        arrIntData[2] = 3;
        arrIntData[3] = 1;
        arrIntData[4] = 78;

        for(int i = 0; i < arrIntData.length; i++) {
            int getData = arrIntData[i];
            System.out.println("getData : " + getData);

            if(i == 3) {
                break;
            }
        }

        System.out.println();

        int[] arrData1 = new int[5];
        arrData1[0] = 1;
        arrData1[1] = 2;
        arrData1[2] = 3;
        arrData1[3] = 4;
        arrData1[4] = 5;

        for(int getData : arrData1) {
            System.out.println("getData : " + getData);
        }

        System.out.println();

        for(int i = 0; i < 5; i++) {
            if(i % 2 == 0) {
                continue;
            }
            int getData = arrData1[i];
            System.out.println("i : " + i + ", getData : " + getData);
        }
    }
}
