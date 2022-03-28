public class PairDemo {

    public static void main(String[] args)
    {
        Pair<Integer> para = new Pair<>(1, 2);
        System.out.println(para.getFirst() + " " + para.getSecond());
        para.swap();
        System.out.println(para.getFirst() + " " + para.getSecond());
    }
}
