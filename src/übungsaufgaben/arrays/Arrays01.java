package übungsaufgaben.arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int[] x = new int[16];

        for (int i = 0; i <= 15; i++){
            x[i] = (int) Math.pow(2,i);
        }

        for (int ii : x){
            System.out.println(ii);
        }
    }
}
