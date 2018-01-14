public class onebit_and_twobit_Characters {
    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i < bits.length -1){
            if(bits[i] == 1)
                i += 2;
            else
                i ++;
        }
        if(i == bits.length - 1 && bits[i] == 0 )
            return true;
        else
            return false;
    }

}
