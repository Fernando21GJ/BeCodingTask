public class MaxValueAfterOperations {

  public static void main(String[] args) {
    int X = 5; // Size of the list
    int Y = 3; // Number of operations

    int[] list = new int[X + 1]; // Add 1 to accommodate 1-based indexing

    // Example operations: i, j, k
    int[][] operations = {
        { 1, 2, 100 },
        { 2, 5, 100 },
        { 3, 4, 100 }
    };

    for (int i = 0; i < Y; i++) {
      int start = operations[i][0];
      int end = operations[i][1];
      int value = operations[i][2];

      list[start] += value;
      if (end + 1 <= X) {
        list[end + 1] -= value;
      }
    }

    int max = 0;
    int sum = 0;
    for (int num : list) {
      sum += num;
      max = Math.max(max, sum);
    }

    System.out.println(max); // Output should be 200
  }
}
