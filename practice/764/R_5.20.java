public class R_520 {
    static void organize(int[ ] data, int low, int high) {
        if (low < high) {
            if ((data[high] % 2) == 0) { // even
                int temp = data[high];
                data[high] = data[low];
                data[low] = temp;
                organize(data, low+1, high); // data[low] is known to be even
            } 
            else {
                organize(data, low, high-1); // data[high] is known to be odd
            }
        }
    }

    static void organize(int[ ] data) {
        organize(data, 0, data.length-1);
        }

    public static void main(String[] args) {
        int x[]={1,2,3,4,5,6,7};

        organize(x);
        System.out.println("x = {" + x[0] + ", " + x[1] + ", " + x[2] + ", " + x[3]+ ", " + x[4]+ ", " + x[5]+ ", " + x[6] +"}");

    }

}
