import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeToArray {
    public static void main(String[] args) {
        
        String[] str1={"a","b","c"};
        String[] str2={"a","b","c","d"};

        List<String> list=new ArrayList<>(Arrays.asList(str1));
        list.addAll(Arrays.asList(str2));

        Object[] str3= list.toArray();

        System.out.println(Arrays.toString(str3));

        int[] arr1={1,2,3,4};
        int[] arr2={2,3,4};

        int count=0;
        int[] arr3=new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){

            arr3[i]=arr1[i];
            count++;
        }
        for(int j=0;j<arr2.length;j++){
            arr3[count++]=arr2[j];
        }
       for (int i : arr3) {
        System.out.println(i);
       }

    }
}
