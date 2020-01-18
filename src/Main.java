import edu.princeton.cs.algs4.In;

public class Main {

    public static void main(String[] args) {
        Integer[] a = new Integer[10];
        int d = 0;
        In in = new In("inputn.txt");
        for (int i = 0; i < 10; i++) {
            a[i] = in.readInt();
        }
        for (int number : a)
            System.out.println(number);

        System.out.println("----------------");

        sort(a);
        for (int number : a)
            System.out.println(number);

    }


    public static void sort(Comparable[] arr) {
        for (int k =0; k<arr.length; k++){

            for (int j=k ; j>0 ; j --)
                if (arr[j].compareTo(arr[j-1])<0 )
                    exch(arr, j, j-1);
                else break;
        }


    }
    public static void exch(Comparable[] a, int i, int j){
        Comparable swap= a[i];
        a[i]=a[j];
        a[j]=swap;
    }
}