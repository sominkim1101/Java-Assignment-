
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
       for(int i = 0; i <= array.length; i++) {
            if(array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
      public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];
        
        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length-1-i];
        }
        
        return reverse;
    }
    

    
    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reverseArr = reverse(array);
        String[] regArr = new String[array.length];
        for(int i= 0; i < array.length; i++){
            regArr[i] = array[i];
                if(regArr[i] == reverseArr[i]) {
                    return true;
                }
            }
        return false;
    }
    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                      "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                      "w", "x", "y", "z" };
        
        boolean pangramic = true;
                 
        for (String letter : abc) {
            boolean thisLetterFound = false;
            for (String string : array) {
                if (string.toLowerCase().contains(letter)) {
                    thisLetterFound = true;
                    break;
                }
            }
            if (!thisLetterFound) {
                pangramic = false;
                break;
            }
        }

        return pangramic;
    }
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }

  
    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
       int numOccurrences = getNumberOfOccurrences(array, valueToRemove);
       String[] arrRemoved;
       if (numOccurrences == 0) {
           arrRemoved = array;
    }
        else {
            arrRemoved = new String[array.length - numOccurrences];
            int removedArrPos = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != valueToRemove) {
                    arrRemoved[removedArrPos] = array[i];
                    removedArrPos++;
                }
        }
    }
    return arrRemoved;
}
    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String prevString = null;
        int consecDupCount = getConsecDupCount(array);
        String[] removedArr = new String[array.length - consecDupCount];
        
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(prevString)){
                removedArr[position] = array[i];
                prevString = array[i];
                position++;
            }
        }
        
        return removedArr;
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int consecDupCount = getConsecDupCount(array);
        String[] packedArr = new String[array.length - consecDupCount];;
        
        String prevString = array[0];
        packedArr[0] = array[0];
        int position = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(prevString)) {
                packedArr[position] += prevString;
            }
            else {
                position++;
                packedArr[position] = array[i];
                prevString = array[i];
            }
        }
        
        return packedArr;
    }
    
    private static int getConsecDupCount(String[] array) {
        String prevString = null;
        int count = 0;
        
        for (String string : array) {
            if (string.equals(prevString)){
                count++;
            }
            prevString = string;
        }
        
        return count;
    }

}

        


