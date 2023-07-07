public class BinarySearch {
    public static void main(String[] args) {
        Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(list, 6));

    }

    public static Integer binarySearch(Integer[] list, Integer target) {
        Integer low = 0;
        Integer high = list.length - 1;

        while (low <= high) {
            Integer middle = (low + high) / 2;
            Integer shot = list[middle];

            if (shot == target) {
                return middle;
            }

            else if (shot > target) {
                high = middle - 1;
            }

            else {
                low = middle + 1;
            }
        }

        return null;
    }
}
