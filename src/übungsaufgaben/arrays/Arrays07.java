package übungsaufgaben.arrays;

public class Arrays07 {
    public static void main(String[] args) {
        int[] one = {1, 2, 3, 4};
        int[] second = {5, 6, 7, 8};

        merge(one,second);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] x = new int[first.length + second.length];

        for (int i = 0; i < first.length; i++){
            x[i] = first[i];
        }

        for (int i = first.length; i < x.length; i++){
            x[i] = second[i - first.length];
        }

        for (int y : x){
            System.out.print( y + " ");
        }

        return x;
    }
}
