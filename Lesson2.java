package lesson2;


public class Lesson2
{
    public static void main (String[] args) throws Exception{
        try{
            String [][] array = {{"text1", "text2", "text3", "text4"},
                                {"text5", "text6", "text7", "text8"},
                                {"text9", "text10", "text11", "text12"},
                                {"text13", "text14", "text15", "text16"}};

            getArr(array);
        } catch (ArrayStoreException e){
            e.printStackTrace();
        }

    }

    public static void getArr(String [][] arr) {
        int a = 0;

        if (arr.length != 4){
            try {
                throw new MyArraySizeException("Ввели массив неправильной размерностью");
            } catch (MyArraySizeException e){
                System.out.println("Найдено следующее исключение "+ e);
                e.printText();
            }
        } else System.out.println("Все правильно, программа работает дальше");

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
             try {
                 a = a + Integer.parseInt(arr[i][j]);
                 throw new MyArrayDataException("Не удалось перепарсить данные в Integer ");
             } catch (MyArrayDataException e){
                 e.printText();
             }
            }
        }
    }
}
