package a03;

import java.util.Comparator;

public class BinarySearchDeluxe {

    // Return the index of the first key in a[] that equals the search key, or -1 if no such key.
    public static <Key> int firstIndexOf(Key[] a, Key key, Comparator<Key> comparator) {
        if(a == null || key == null || comparator == null){
            throw new NullPointerException();
        }
        int low = 0;
        int high = a.length -1;
        int mid;
        if (comparator.compare(a[low], key) == 0) {
            return low;
        }
        while(low <= high){
            mid = low + (high - low) / 2;
            if(comparator.compare(key, a[mid]) < 0){
                high = mid - 1;
            }else if(comparator.compare(key, a[mid]) > 0){
                low = mid + 1;
            }else if(mid < a.length - 1 && comparator.compare(key, a[mid - 1]) == 0) {
                high = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    // Return the index of the last key in a[] that equals the search key, or -1 if no such key.
    public static <Key> int lastIndexOf(Key[] a, Key key, Comparator<Key> comparator){
        if(a == null || key == null || comparator == null){
            throw new NullPointerException();
        }
        int low = 0;
        int high = a.length -1;
        int mid;
        if (comparator.compare(a[high], key) == 0) {
            return high;
        }
        while(low <= high){
            mid = low + (high - low) / 2;
            if(comparator.compare(key, a[mid]) < 0){
                high = mid - 1;
            }else if(comparator.compare(key, a[mid]) > 0){
                low = mid + 1;
            }else if(mid < a.length - 1 && comparator.compare(key, a[mid + 1]) == 0) {
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};

        int lastIndex = lastIndexOf(arr, 3, Comparator.naturalOrder());
        System.out.println("Last index of 3 in {1, 2, 3, 4, 5}: " + lastIndex);

        lastIndex = lastIndexOf(arr, 6, Comparator.naturalOrder());
        System.out.println("Last index of 6 in {1, 2, 3, 4, 5}: " + lastIndex);

        lastIndex = lastIndexOf(arr, 1, Comparator.naturalOrder());
        System.out.println("Last index of 1 in {1, 2, 3, 4, 5}: " + lastIndex);

        lastIndex = lastIndexOf(arr, 5, Comparator.naturalOrder());
        System.out.println("Last index of 5 in {1, 2, 3, 4, 5}: " + lastIndex);

        System.out.println();

        int firstIndexOf = firstIndexOf(arr, 3, Comparator.naturalOrder());
        System.out.println("First index of 3 in {1, 2, 3, 4, 5}: " + firstIndexOf);

        firstIndexOf = firstIndexOf(arr, 6, Comparator.naturalOrder());
        System.out.println("First index of 6 in {1, 2, 3, 4, 5}: " + firstIndexOf);

        firstIndexOf = firstIndexOf(arr, 1, Comparator.naturalOrder());
        System.out.println("First index of 1 in {1, 2, 3, 4, 5}: " + firstIndexOf);

        firstIndexOf = firstIndexOf(arr, 5, Comparator.naturalOrder());
        System.out.println("First index of 5 in {1, 2, 3, 4, 5}: " + firstIndexOf);
    }

}
