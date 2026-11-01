class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int result = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                matrix[row][col] += matrix[row][col - 1];
            }
        }

        for (int startCol = 0; startCol < cols; startCol++) {
            for (int curCol = startCol; curCol < cols; curCol++) {

                HashMap<Integer , Integer> map = new HashMap<>();
                map.put(0 , 1);
                int prexSum = 0;

                for(int row = 0 ; row < rows ; row++){

                    prexSum += matrix[row][curCol] - (startCol > 0 ? matrix[row][startCol-1] : 0);
                    
                    if(map.containsKey(prexSum - target)){
                        result += map.get(prexSum - target);
                    }

                    map.put(prexSum , map.getOrDefault(prexSum , 0) +1);
                }

            }
        }

        return result;
    }
}