public class SelectionSort {
  public static void main(String[] args){
    List<Integer> input = Arrays.asList({5,7,1,4,3,9});
    List<Integer> output = selectionSorting(input);
    System.out.println(output.toString());
  }

  private List<Integer> selectionSorting(List<Integer> inputList){
    Integer inputArray = inputList.toArray(new Integer[inputList.size()]);
    
  }
}
