import java.util.HashSet;

public class FindOdd {

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    //this method will find the int in a given array that appears an odd number of times
    public int findIt(int[] intArray) {

        HashSet<Integer> arraySet = new HashSet<>();

        //Store the array in set (as set will store unique elements)
        for (int j : intArray) {
            arraySet.add(j);
        }
        //printing the set
        // System.out.println("arraySet " + arraySet);

        /*
        * @ setValue = The number at element i of arraylist of unique number stored in set
        * @ arraySet = the array of unique values that were stored in a set
        * */
        for (int setValue : arraySet) {
            int count = 0;
            /*
            * @ anInt = The number at element i of original arrayList of ints that was passed as parameter
            * @ intArray = The original int array that was passed as a parameter
            * */
            for (int anInt : intArray) {
                //compare the value of each index in the setArray against the intArray passed and count the occurrence
                if (setValue == anInt) {
                    count++;
                }
            }
            //check if count is odd
            if (isOdd(count)) {
//                System.out.println("count " + set);
                //if count is odd, return the number that is associated with that odd count
            return setValue;
            }
//            System.out.println(set + " occurs " + count + " times");
        } return -1;
    }
}
