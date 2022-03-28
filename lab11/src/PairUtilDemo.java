public class PairUtilDemo {

    public static void main(String[] args)
    {
        Pair<Integer> pair = new Pair<>(1, 2);
        System.out.println(pair.getFirst() + " " + pair.getSecond());
        Pair<Integer> newPair = PairUtil.swap(pair);
        System.out.println(newPair.getFirst() + " " + newPair.getSecond());
    }
}
