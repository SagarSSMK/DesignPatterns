package collections;

import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> words = List.of("Sagar","Mallesh");

        for(String word:words){
            System.out.println(word);
        }

        System.out.println(words.indexOf("Sagar"));
    }
}
