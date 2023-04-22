class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length == 0 || r * c != mat.length * mat[0].length)
      return mat;

    int[][] ans = new int[r][c];
    int k = 0;

    for (int[] row : mat)
      for (final int num : row) {
        ans[k / c][k % c] = num;
        ++k;
      }

    return ans;
    }
}
