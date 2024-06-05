public class Main {

    public static <T> boolean compareArrays(T[] arrayFirst, T[] arraySecond) {
        if(arrayFirst.length != arraySecond.length) {
            return false;
        }

        for (int i = 0; i < arrayFirst.length; i++) {
            if(!arrayFirst[i].equals(arraySecond[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(Calculator.sum(5.1, 7));
        System.out.println(Calculator.divide(3, 5));
        System.out.println(Calculator.multiply(3.4, 5.1));
        System.out.println(Calculator.subtract(9, -4));

        Integer[] intArray0 = {1, 2, 3};
        Integer[] intArray1 = {1, 2, 3};
        Integer[] intArray3 = {1, 2, 4};

        String[] strArray = {"a", "b", "c"};
        Object[] objArray = {"a", "b", "c"};

        System.out.println(compareArrays(intArray0, intArray1));
        System.out.println(compareArrays(intArray0, intArray3));
        System.out.println(compareArrays(intArray0, strArray));
        System.out.println(compareArrays(strArray, objArray));

        Pair<Integer, String> pair = new Pair<>(18, "word");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }


}