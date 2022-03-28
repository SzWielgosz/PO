import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer> IntegerList = new ArrayList<>();
        IntegerList.add(1);
        IntegerList.add(5);
        IntegerList.add(4);
        IntegerList.add(2);
        IntegerList.add(9);
        System.out.println(ArrayUtil.isSorted(IntegerList));
        System.out.println(ArrayUtil.binSearch(IntegerList, 2));

        ArrayList<LocalDate> LocalDateList = new ArrayList<>();
        LocalDateList.add(LocalDate.of(2001, 10, 20));
        LocalDateList.add(LocalDate.of(1999, 2, 10));
        LocalDateList.add(LocalDate.now());

        System.out.print("Przed selectionSort: ");
        for(int i = 0; i < IntegerList.size(); i++)
        {
            System.out.print(IntegerList.get(i) + " ");
        }
        ArrayUtil.selectionSort(IntegerList);
        System.out.print("Po selectionSort: ");
        for(int i = 0; i < IntegerList.size(); i++)
        {
            System.out.print(IntegerList.get(i) + " ");
        }

        System.out.print("\nPrzed selectionSort: ");
        for(int i = 0; i < LocalDateList.size(); i++)
        {
            System.out.print(LocalDateList.get(i) + " ");
        }
        ArrayUtil.selectionSort(LocalDateList);
        System.out.print("Po selectionSort: ");
        for(int i = 0; i < LocalDateList.size(); i++)
        {
            System.out.print(LocalDateList.get(i) + " ");
        }
//        System.out.print("\n" + ArrayUtil.isSorted(LocalDateList));
        System.out.println("\n" + ArrayUtil.binSearch(LocalDateList, LocalDate.now()));


        ArrayList<Integer> IntegerList2 = new ArrayList<>();
        IntegerList2.add(2);
        IntegerList2.add(8);
        IntegerList2.add(5);
        IntegerList2.add(10);
        IntegerList2.add(4);

        System.out.print("\nPrzed mergeSort: ");
        for(int i = 0; i < IntegerList2.size(); i++)
        {
            System.out.print(IntegerList2.get(i) + " ");
        }
        ArrayUtil.mergeSort(IntegerList2);
        System.out.print("Po mergeSort: ");
        for(int i = 0; i < IntegerList2.size(); i++)
        {
            System.out.print(IntegerList2.get(i) + " ");
        }

        ArrayList<LocalDate> LocalDateList2 = new ArrayList<>();
        LocalDateList2.add(LocalDate.of(2001, 10, 20));
        LocalDateList2.add(LocalDate.of(1999, 2, 10));
        LocalDateList2.add(LocalDate.now());

        System.out.print("\nPrzed mergeSort: ");
        for(int i = 0; i < LocalDateList2.size(); i++)
        {
            System.out.print(LocalDateList2.get(i) + " ");
        }
        ArrayUtil.mergeSort(LocalDateList2);
        System.out.print("Po mergeSort: ");
        for(int i = 0; i < LocalDateList2.size(); i++)
        {
            System.out.print(LocalDateList2.get(i) + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();



        ArrayList<Comparable<Comparable>> comparables = new ArrayList<>();

        System.out.println(ArrayUtil.isSorted(comparables));


        ArrayList<Double> dable = new ArrayList<>();
        dable.add(2.5);
        dable.add(3.5);
        dable.add(4.);

        System.out.println(ArrayUtil.isSorted(dable));


    }
}
