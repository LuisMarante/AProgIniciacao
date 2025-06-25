package FactoryMethod.ex03;

public class Word extends Document{
    public Word(String nome, String autor) {

        super(nome, autor, ".docx");
    }

    public void open() {


        System.out.println("Correu bem");
    }

    public void close() {

    }

    public void save() {

    }


}
