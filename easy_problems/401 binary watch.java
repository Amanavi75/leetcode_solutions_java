class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> results = new ArrayList<String>();
        
        for (int hour=0; hour < 12; hour++) {
            for (int min=0; min < 60; min++) {
                if (Integer.bitCount(hour) + Integer.bitCount(min) == turnedOn){
                    if (min < 10) {
                        results.add(String.format("%d:0%d", hour, min));
                    }
                    else{
                        results.add(String.format("%d:%d", hour, min));
                    }
                }
            }
        }
        return results;
    }
}
