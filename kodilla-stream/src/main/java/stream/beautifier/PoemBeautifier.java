package stream.beautifier;

public class PoemBeautifier {
    public void poemBeautifierer(String s, PoemDecorator poemDecorator){
        String text = poemDecorator.decorate(s);
        System.out.println(text);
    }
}
