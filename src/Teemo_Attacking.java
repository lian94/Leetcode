public class Teemo_Attacking {
    //wrong version
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        int i = 0;
        if(timeSeries.length == 1){
            return duration;
        }
        if(timeSeries.length == 0){
            return 0;
        }
        for (i = 0; i < timeSeries.length -1; i++) {
            if(timeSeries[i+1] - timeSeries[i] >= duration) {
                total += duration;
            }else{
                total += duration + timeSeries[i+1] - timeSeries[i];
            }
        }
        if(timeSeries[i] - timeSeries[i-1] >= duration) {
            total += duration;
        }
        return total;
    }
}

//    public int findPoisonedDuration(int[] timeSeries, int duration) {
//        if (timeSeries == null || timeSeries.length == 0 || duration == 0) return 0;
//
//        int result = 0, start = timeSeries[0], end = timeSeries[0] + duration;
//        for (int i = 1; i < timeSeries.length; i++) {
//            if (timeSeries[i] > end) {
//                result += end - start;
//                start = timeSeries[i];
//            }
//            end = timeSeries[i] + duration;
//        }
//        result += end - start;
//        return result;
//    }
