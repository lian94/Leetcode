public class Min_Cost_Climbing_Stairs {
    public int minCostClimbingStairs(int[] cost) {
        for(int i = cost.length-3;i>=0;i--){
            cost[i] = cost[i]+Math.min(cost[i+1],cost[i+2]);
        }
        return Math.min(cost[0],cost[1]);
    }

//    public int minCostClimbingStairs(int[] cost) {
//        int [] mc = new int[cost.length + 1];
//        mc[0] = cost[0];
//        mc[1] = cost[1];
//
//        for(int i = 2; i <= cost.length; i++){
//            int costV = (i==cost.length)?0:cost[i];
//            mc[i] = Math.min(mc[i-1] + costV, mc[i-2] + costV);
//        }
//        return mc[cost.length];
//    }
}
