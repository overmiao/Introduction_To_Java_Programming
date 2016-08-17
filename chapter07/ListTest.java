public class ListTest {
    public static void main(String[] args) {
        int[] myList = new int[10];
        for (int i = 0; i <= myList.length - 1; i++) {
            myList[i] = i * i;
        }
        for (int e: myList){
            System.out.println(e);
        }

        int[] myList2 = {1, 3, 4};
        for (int e: myList2){
            System.out.println(e);
        }

        swapFirstTwoInArray(myList2);
        for (int e: myList2){
            System.out.println(e);
        }
    }
    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[2];
        array[2] = temp;
    }
}
