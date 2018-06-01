public class reverseArray {
    
    public static int[] reverseArr(int[] list) {

    int[] result = new int[list.length];

    for(int i=0,j=result.length;i<result.length;i++,j--) {
            result[j] = list[i];
    }

    return result;

    }

    public static void main(String[] args) {
        System.out.println(reverseArr(new int[]{3,0,2,9}));
    }
}