package übungsaufgaben.arrays;

public class Arrays06 {
    public static void main(String[] args) {
        int[][] multiDimArray = {
                {5,8,2,7},
                {9,6,10,8},
                {10,2,7,5},
                {1,9,5,4}
        };

        for (int i = 0; i<multiDimArray.length; i++) {
            int hV = multiDimArray[i][0];
            int lV = multiDimArray[i][0];

            for (int j = 0; j< multiDimArray.length; j++){
                lV = lV > multiDimArray[i][j] ? multiDimArray[i][j] : lV;
                hV = hV < multiDimArray[i][j] ? multiDimArray[i][j] : hV;
            }
            System.out.printf("%d - %d%n",lV,hV);
        }
    }
}
