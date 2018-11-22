package lesson2;

public class MyArrayDataException extends Exception {

    private String text;

    public MyArrayDataException (String text){
        this.text = text;
    }

    public void printText(){
        System.out.println(text);
    }
}
