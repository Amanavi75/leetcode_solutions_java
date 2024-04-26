class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum = 0;
        int numOfLines = 1;

        for (char c : s.toCharArray())
        {
            int width = widths[c - 'a'];
            
            if (sum + width <= 100) sum += width;
            else 
            {
                numOfLines++;
                sum = width;
            }

        }

        return new int[]{numOfLines, sum};
        
    }
}
