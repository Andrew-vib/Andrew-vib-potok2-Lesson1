package lesson2;

public class MyArraySizeException extends Exception {
        private String text;

        public MyArraySizeException (String text){
        this.text = text;
    }

    public void printText(){
            System.out.println (text);
    }
}
