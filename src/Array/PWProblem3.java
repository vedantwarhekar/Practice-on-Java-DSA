package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Remove duplicate from array
public class PWProblem3 {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

          // 1st Logic
//        int[] unique = Arrays.stream(arr).distinct().toArray();
//        System.out.println(Arrays.toString(unique));

        //2nd Logic
//        List<Integer> list = new ArrayList<>();
//        for(int num : arr)
//        {
//            if(!list.contains(num)){
//                list.add(num);
//            }
//        }
//        System.out.println(list);

  //       3rd Logic
        int uniqueCount = 0;
        for(int i = 0; i < arr.length; i++)
        {
            boolean isDuplicate = false;

            for(int j =0; j < uniqueCount;j++)
            {
                if(arr[i] == arr[j])
                {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate)
            {
                arr[uniqueCount++] = arr[i];
            }
        }

        for(int i = 0; i < uniqueCount; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // 4th logic
//        boolean[] seen = new boolean[101]; // assuming element from 0 -100;
//        int result[] = new int[arr.length];
//        int index = 0;
//        for(int num : arr)
//        {
//           if(!seen[num])
//           {
//               seen[num] = true;
//               result[index++] = num;
//           }
//        }
//        for (int i = 0; i < index; i++) {
//            System.out.print(result[i] + " ");
//        }
    }
}
