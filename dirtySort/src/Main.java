import java.util.Random;

public class Main {
    private static int[] integerarray = new int[10];
    public static void main(String[] args) {
        Random r = new Random();
        for(int i = 0 ; i < integerarray.length; i++){
            integerarray[i]= r.nextInt(10);
            System.out.print(integerarray[i] + " ");
            for(int j = 0; j <= integerarray[i]; j++){
                if(j == integerarray[i]){
                    System.out.print("\n");
                }else{
                    System.out.print("#");
                }
            }
        }
        integerarray = dirtySort(integerarray);
    }


    private static int[] dirtySort(int[] intList){
        int[] sortedList;
        for(int j=0; j < intList.length; j++){
            for(int i = 0; i < intList.length-1; i++){
                if(intList[i] > intList[i+1]){
                    //System.out.println("Betrachtete Zahlen:" + intList[i] + " und " + intList[i+1]);
                    int tempint = intList[i];
                    intList[i] = intList[i+1];
                    intList[i+1] = tempint;
                }
            }
        }
        System.out.println("\nHokus Pokus!\n");
        for(int p = 0; p < intList.length; p++){
            System.out.print(intList[p] + " ");
            for(int j = 0; j <= intList[p]; j++){
                if(j == intList[p]){
                    System.out.print("\n");
                }else{
                    System.out.print("#");
                }
            }
        }
        sortedList = intList;
        return sortedList;

    }


}
