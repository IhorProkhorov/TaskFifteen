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

    public static void main(String[] args) {
        String s = "2,4,4,6,5";
        List<char[][]> list = draw(s);

        char[][] result = getArray(list);

        for (char[] element: result
        ) {
            System.out.println(element);
        }
    }

    public static boolean isDigit(String[] array){
        try{
            for (int i = 0; i < array.length; i++){
                Integer.parseInt(array[i]);
            }
        }catch (NumberFormatException e){
            return false;
        }
        return true;
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
