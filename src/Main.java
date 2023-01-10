import java.io.OptionalDataException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {



        //task3 b

//        int[] arr = new int[10];
//        System.out.println("Массив до сортировки: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(10);
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//
//        int[] arr1 = sortArrgrowth(arr);       // Сортировка массива
//        System.out.println("Массив после сортировки по возростанию: ");
//        printArray(arr1);
//
//        int[] arr2 = sortArrdecrease(arr);       // Сортировка массива
//        System.out.println("Массив после сортировки по убыванию: ");
//        printArray(arr2);
    //task3 end

        //task4 b
        double z = powerMethod(3, 4);

        double sqrt = sqrt3Method(81);

        System.out.println("Input: z = " + z);
        System.out.println("Input: sqrt = " + sqrt);



        //task4 end


        //task2 b


//         createArray(10, 10);
//         System.out.println();
//

//

//

        Scanner scanner = new Scanner(System.in);
//
//        //task1
//
//        while (true){           // Классический пример бесконечного цикла
//            System.out.println("Введите операцию: \n" +      // Выводим варианты запросов
//                    "Сумма - +\n" +
//                    "Разница - -\n"  +
//                    "Умножение - *\n" +
//                    "Деление - /\n" +
//                    "Выход - e \n");
//            char ch = scanner.next().charAt(0);          // Считываем запрос
//            if (ch == '+') {                  //Обрабатываем запросы
//                System.out.println("Введите первое число: ");
//                int i = scanner.nextInt();
//                System.out.println("Введите второе число: ");
//                int i1 = scanner.nextInt();
//                System.out.println("Результат: " +  sum(i, i1) + "\n");
//
//            }
//            else if(ch == '-'){
//                System.out.println("Введите первое число: ");
//                int i = scanner.nextInt();
//                System.out.println("Введите второе число: ");
//                int i1 = scanner.nextInt();
//                System.out.println("Результат: " +  dif(i, i1) + "\n");
//            }
//            else if(ch == '*'){
//                System.out.println("Введите число: ");
//                int i = scanner.nextInt();
//                System.out.println("Введите второе число: ");
//                int i1 = scanner.nextInt();
//                System.out.println("Результат: " +  multiply(i, i1) + "\n");
//            }
//            else if(ch == '/'){
//                System.out.println("Введите число: ");
//                int i = scanner.nextInt();
//                System.out.println("Введите второе число: ");
//                int i1 = scanner.nextInt();
//                System.out.println("Результат: " +  div(i, i1) + "\n");
//            }
//
//            if(ch == 'e'){     // Выходим из цикла
//                break;
//            }
//        }
//
//
////        int[] arr = new int[0];
////        printArray(arr);
    }
//
//    private static void printArray(int[] arr) {
//    }
//
//    private static int sum(int i, int i1) {
//        return i+i1;
//    }
//    private static int dif(int i, int i1) {
//        return i-i1;
//    }
//    private static int multiply(int i, int i1) {
//        return i*i1;
//    }
//    private static int div(int i, int i1) {
//        return i/i1;
//    }
    //task2

//    public static void printArray(int[] arr){   // Принимаем массив
//        for (int i = 1; i < arr.length; i++) {
//            arr[i] = i;
//            System.out.print(arr[i] + " ");   // Выводим элемент на консоль с пробелом
//        }
//        System.out.println();     // В конце вывода переходим на новую строку
//    }

//    public static int[] createArray(int size, int bound){
//        int[] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(bound);
//            System.out.print(arr[i]);
//        }
//        return arr;
//    }
//    public static void printArray (int size, int bound){
//        OptionalDataException arr = null;
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
////    }
//
//    }
// Сортировка пузырьком
    //TASK 3

    // Сортировка пузырьком
    private static int[] sortArrgrowth(int[] arr) {

        int temp;                  // Вспомогательная переменная, которая будет хранить в себе значение замененной переменной
        for (int i = 0; i < arr.length; i++) {   // Перебираем массив
            for (int j = 0; j < arr.length; j++) {  // Во втором цикле сравниваем каждый элемент со всеми элементами
                if (arr[i] < arr[j]) {       // Сравниваем элемент с каждым элементом, если удовлетворенно условие, делаем замену
                    temp = arr[i];     // Запоминаем переносимое значение
                    arr[i] = arr[j];  // Меняем значение
                    arr[j] = temp;   // Записываем запомненное значение в новую позицию
                }
            }

        }
        return arr;    // Возвращаем отсортированный массив
    }

    private static int[] sortArrdecrease(int[] arr) {

        int temp;                  // Вспомогательная переменная, которая будет хранить в себе значение замененной переменной
        for (int i = 0; i < arr.length; i++) {   // Перебираем массив
            for (int j = 0; j < arr.length; j++) {  // Во втором цикле сравниваем каждый элемент со всеми элементами
                if (arr[i] > arr[j]) {       // Сравниваем элемент с каждым элементом, если удовлетворенно условие, делаем замену
                    temp = arr[i];     // Запоминаем переносимое значение
                    arr[i] = arr[j];  // Меняем значение
                    arr[j] = temp;   // Записываем запомненное значение в новую позицию
                }
            }

        }
        return arr;    // Возвращаем отсортированный массив
    }

    // Создаем метод, который выводит массив на консоль
    public static void printArray(int[] arr) {   // Принимаем массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");   // Выводим элемент на консоль с пробелом
        }
        System.out.println();     // В конце вывода переходим на новую строку
    }


    private static double sqrt3Method(int x) {
        double z = 1.0/3.0;
        return Math.pow(x, z);
    }

    private static double powerMethod(int x, int y) {

        return Math.pow(x, y);

    }
}