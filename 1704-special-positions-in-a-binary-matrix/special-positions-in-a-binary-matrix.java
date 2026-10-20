class Solution {

    public boolean check(int[][] mat, int a, int b) {
        int flag = 0;

        for (int i = 0; i < mat.length; i++) {
            if (i == a)
                continue;

            if (mat[i][b] != 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) return false;

        for (int j = 0; j < mat[a].length; j++) {
            if (j == b)
                continue;

            if (mat[a][j] != 0){
                flag = 1;
                break;
            }
        }

        return flag != 1;
    }

    public int numSpecial(int[][] mat) {
        int m = mat.length;

        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    boolean ck = check(mat, i, j);
                    if (ck) count++;
                }
            }
        }

        return count;
    }
}