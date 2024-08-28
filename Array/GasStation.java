package Array;

public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int index = 0;
        int netAtCurIndex = 0;
        int totalNet = 0;

        for(int i = 0; i<gas.length; i++){
            netAtCurIndex = netAtCurIndex + gas[i] -cost[i];
            totalNet = totalNet + gas[i] - cost[i];
            if(netAtCurIndex<0){
                index = i+1;
                netAtCurIndex = 0;
            }
        }
        return totalNet>=0? index: -1;
    }

    public static void main(String[] args) {
        System.out.println("res: " + canCompleteCircuit(new int []{2,3,4}, new int[]{3,4,3}));
    }
}
