public class Main {

    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();   
        
        firstList.add(1);
        secondList.add(2);
 
        List<Integer> mergedLists = new ArrayList<>(firstList);
        mergedLists.addAll(secondList);
    }
}
