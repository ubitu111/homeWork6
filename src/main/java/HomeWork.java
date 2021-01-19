import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HomeWork {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getNewArrayAfterNumberFour(new int[]{1, 3, 3, 4, 5, 7, 1, 23, 2})));
//        System.out.println(Arrays.toString(getNewArrayAfterNumberFour(new int[]{1, 3,4, 3, 4, 5, 7, 1, 23, 2})));
//        System.out.println(Arrays.toString(getNewArrayAfterNumberFour(new int[]{1, 3, 3, 5, 7, 1, 23, 2})));

//        System.out.println(isArrayContainsOnlyNumberOneAndFour(new int[]{1,1,1,4,4,4,4}));
//        System.out.println(isArrayContainsOnlyNumberOneAndFour(new int[]{1,1,1}));
//        System.out.println(isArrayContainsOnlyNumberOneAndFour(new int[]{4,4,4,4}));
//        System.out.println(isArrayContainsOnlyNumberOneAndFour(new int[]{4,4,4,4,1,1,1,3}));
    }


    public static int[] getNewArrayAfterNumberFour(int[] array) {
        //преобразую входной массив в лист integer
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        //вычисляю, сколько четверок есть в листе
        int size = (int) list.stream().filter(number -> number == 4).count();
        //если четверок нет, бросаю исключение
        if (size == 0) {
            throw new RuntimeException("В списке нет числа 4");
        } else {
            //в другом случае, переворачиваю лист
            Collections.reverse(list);
            //достаю из листа индекс четверки
            OptionalInt index = IntStream.range(0, list.size()).filter(i -> list.get(i) == 4).findFirst();
            if (index.isPresent()) {
                //преобразую лист в результирующий массив до четверки
                int[] resultArray = Arrays.copyOfRange(list.stream().mapToInt(n -> n).toArray(), 0, index.getAsInt());
                //преобразую результирующий массив в лист
                List<Integer> newList = Arrays.stream(resultArray).boxed().collect(Collectors.toList());
                //переворачиваю лист
                Collections.reverse(newList);
                return newList.stream().mapToInt(n -> n).toArray();
            }
        }
        //это выражение недостижимо, но компилятор ругается, что нет return
        return null;
    }

    public static boolean isArrayContainsOnlyNumberOneAndFour(int[] array) {
        //преобразую входной массив в лист integer
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        //считаю количество неверных чисел, которые не равны 1 и 4
        int countOfWrongNumbers = (int) list.stream().filter(number -> number != 1 && number != 4).count();
        //если неверные числа есть, возвращаю false
        if (countOfWrongNumbers > 0) {
            return false;
        }
        //считаю количество четверок
        int countOfFour = (int) list.stream().filter(number -> number == 4).count();
        //считаю количество единиц
        int countOfOne = (int) list.stream().filter(number -> number == 1).count();

        return countOfOne > 0 && countOfFour > 0;
    }
}
