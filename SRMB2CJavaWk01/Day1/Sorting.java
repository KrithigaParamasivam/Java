public class Sorting {
    public void sort(int[] arr){

        int temp = 0;

        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int [] arr = new int [] {13, 7, 6, 45, 21, 9, 101, 102};
        Sorting s=new Sorting();
        s.sort(arr);
        System.out.println();

        System.out.println("Elements of array after sorted : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}


