import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> list) //T lub rodzic T
    {
        ArrayList<T> x = new ArrayList<>(list);
        Collections.sort(x);
        return list.equals(x);
    }

    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> list, T gen) {
        if (ArrayUtil.isSorted(list)) {
            int left = 0;
            int right = list.size() - 1;
            int center;
            while (left <= right) {
                center = (left + right) / 2;
                if (list.get(center).compareTo(gen) == 0) {
                    return center;
                } else if (list.get(center).compareTo(gen) < 0) {
                    left = center + 1;
                } else {
                    right = center - 1;
                }
            }
        }
        return -1;
    }

    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            T min = list.get(i);
            int minIndex = i;
            for(int j = i; j < list.size(); j++)
            {
                if(min.compareTo(list.get(j)) > 0)
                {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            if(min.compareTo(list.get(i)) < 0)
            {
                T tmp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, tmp);
            }
        }
    }

    private static <T extends Comparable<? super T>> void merge(ArrayList<T> list, ArrayList<T> half1, ArrayList<T> half2)
    {
        int half1Size = half1.size();
        int half2Size = half2.size();

        int i = 0, l = 0, r = 0;

        while(l < half1Size && r < half2Size)
        {
            if(half1.get(l).compareTo(half2.get(r)) <= 0)
            {
                list.set(i, half1.get(l));
                l++;
            }
            else
            {
                list.set(i, half2.get(r));
                r++;
            }
            i++;
        }

        while(l < half1Size)
        {
            list.set(i, half1.get(l));
            i++;
            l++;
        }

        while(r < half2Size)
        {
            list.set(i, half2.get(r));
            i++;
            r++;
        }
    }

    public static <T extends Comparable<? super T>> void mergeSort(ArrayList<T> list)
    {
        int length = list.size();
        if(length < 2)
        {
            return;
        }
        int mid = list.size() / 2;
        ArrayList<T>half1 = new ArrayList<>(mid);
        ArrayList<T>half2 = new ArrayList<>(list.size() - mid);

        for(int i = 0; i < mid; i++)
        {
            half1.add(list.get(i));
        }

        for(int i = mid; i < list.size(); i++)
        {
            half2.add(list.get(i));
        }

        mergeSort(half1);
        mergeSort(half2);

        merge(list, half1, half2);

    }
}
