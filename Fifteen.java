import java.util.ArrayList;
import java.util.List;

public class Fifteen {

    public static char[][] getArray(List<char[][]> list){
        char[][] result = new char[5][7 * list.size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 5; j++) {
                System.arraycopy(list.get(i)[j], 0, result[j], i * 7 , list.get(i)[j].length);
            }
        }
        return result;
    }

    public static boolean isDigit(String[] array){
        int[] arrOfDigits = {0,1,2,3,4,5,6,7,8,9};
        boolean flag = false;
        for(int i = 0; i < array.length; i++ ){
            for(int j = 0; j < arrOfDigits.length; j ++){
                try{
                    if (arrOfDigits[j] == Integer.parseInt(array[i])) {
                        flag = true;
                        break;
                    }
                }catch(NumberFormatException e){
                    return false;
                }
            }
        }
        return flag;
    }

    public static List<char[][]> draw(String str){
        List<char[][]> list = new ArrayList<>();
        String[] array = str.split(",");
        if (isDigit(array)) {
            for (String s : array) {
                switch (s) {
                    case ("0"):
                        char[][] arrayForZero = new char[][]{
                                {' ', '*', '*', '*', '*', ' ', ' '},
                                {'*', ' ', ' ', ' ', ' ', '*', ' '},
                                {'*', ' ', ' ', ' ', ' ', '*', ' '},
                                {'*', ' ', ' ', ' ', ' ', '*', ' '},
                                {' ', '*', '*', '*', '*', ' ', ' '}};
                        list.add(arrayForZero);
                        break;
                    case ("1"):
                        char[][] arrForOne = new char[][]{
                                {' ', ' ', '*', '*', ' ', ' ', ' '},
                                {' ', '*', '*', '*', ' ', ' ', ' '},
                                {'*', ' ', '*', '*', ' ', ' ', ' '},
                                {' ', ' ', '*', '*', ' ', ' ', ' '},
                                {'*', '*', '*', '*', '*', '*', ' '}};
                        list.add(arrForOne);
                        break;
                    case ("2"):
                        char[][] arrForTwo = new char[][]{
                                {' ', '*', '*', '*', '*', ' ', ' '},
                                {'*', ' ', ' ', ' ', '*', '*', ' '},
                                {' ', ' ', '*', '*', ' ', ' ', ' '},
                                {' ', '*', '*', ' ', ' ', ' ', ' '},
                                {'*', '*', '*', '*', '*', '*', ' '}};
                        list.add(arrForTwo);
                        break;
                    case ("3"):
                        char[][] arrForThree = new char[][]{
                                {' ', '*', '*', '*', '*', ' ', ' '},
                                {'*', ' ', ' ', ' ', '*', '*', ' '},
                                {' ', ' ', ' ', '*', ' ', ' ', ' '},
                                {'*', ' ', ' ', ' ', '*', '*', ' '},
                                {' ', '*', '*', '*', '*', ' ', ' '}};
                        list.add(arrForThree);
                        break;
                    case ("4"):
                        char[][] arrForFour = new char[][]{
                                {'*', '*', ' ', ' ', '*', '*', ' '},
                                {'*', '*', ' ', ' ', '*', '*', ' '},
                                {'*', '*', '*', '*', '*', '*', ' '},
                                {' ', ' ', ' ', ' ', '*', '*', ' '},
                                {' ', ' ', ' ', ' ', '*', '*', ' '}};
                        list.add(arrForFour);
                        break;
                    case ("5"):
                        char[][] arrForFive = new char[][]{
                                {'*', '*', '*', '*', '*', '*', ' '},
                                {'*', '*', ' ', ' ', ' ', ' ', ' '},
                                {'*', '*', '*', '*', '*', ' ', ' '},
                                {' ', ' ', ' ', ' ', '*', '*', ' '},
                                {'*', '*', '*', '*', '*', ' ', ' '}};
                        list.add(arrForFive);
                        break;
                    case ("6"):
                        char[][] arrForSix = new char[][]{
                                {' ', '*', '*', '*', '*', ' ', ' '},
                                {'*', '*', ' ', ' ', ' ', ' ', ' '},
                                {'*', '*', '*', '*', '*', ' ', ' '},
                                {'*', '*', ' ', ' ', '*', '*', ' '},
                                {' ', '*', '*', '*', '*', ' ', ' '}};
                        list.add(arrForSix);
                        break;
                    case ("7"):
                        char[][] arrForSeven = new char[][]{
                                {'*', '*', '*', '*', '*', '*', ' '},
                                {' ', ' ', ' ', '*', '*', ' ', ' '},
                                {' ', ' ', '*', '*', ' ', ' ', ' '},
                                {' ', '*', '*', ' ', ' ', ' ', ' '},
                                {'*', '*', ' ', ' ', ' ', ' ', ' '}};
                        list.add(arrForSeven);
                        break;
                    case ("8"):
                        char[][] arrForEight = new char[][]{
                                {' ', '*', '*', '*', '*', ' ', ' '},
                                {'*', '*', ' ', ' ', '*', '*', ' '},
                                {' ', ' ', '*', '*', ' ', ' ', ' '},
                                {'*', '*', ' ', ' ', '*', '*', ' '},
                                {' ', '*', '*', '*', '*', ' ', ' '}};
                        list.add(arrForEight);
                        break;
                    case ("9"):
                        char[][] arrForNine = new char[][]{
                                {' ', '*', '*', '*', '*', ' ', ' '},
                                {'*', '*', ' ', ' ', '*', '*', ' '},
                                {' ', '*', '*', '*', '*', '*', ' '},
                                {' ', ' ', ' ', ' ', '*', '*', ' '},
                                {' ', '*', '*', '*', '*', ' ', ' '}};
                        list.add(arrForNine);
                        break;
                }
            }
        }
        return list;
    }
}
