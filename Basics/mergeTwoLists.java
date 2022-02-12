public class Main {

    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
      
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        firstList.add(5);
        secondList.add(6);
        secondList.add(7);
        secondList.add(8);
        secondList.add(9);
        secondList.add(10);
      
        List<Integer> mergedLists = new ArrayList<>(firstList);
        mergedLists.addAll(secondList);
    }
}
