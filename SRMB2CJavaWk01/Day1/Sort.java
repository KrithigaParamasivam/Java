import java.util.Arrays;
    public class Sort{

        public static void main(String[] args)
        {
            int [] arr = {90, 23, 5, 109, 12, 22, 67, 34};
            Arrays.sort(arr);

            System.out.println("Elements of array after sorted: ");
            for (int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        }
    }

