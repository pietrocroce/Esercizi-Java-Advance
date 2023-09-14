

import java.util.*;

public class CollectionsExercise {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: Complete the function that removes any duplicates by using a set
     * then recreates a new list of unique items
     * <p>
     * You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));
        Set<String> set = new LinkedHashSet<>(list);
        List<String> listWithoutDuplicates = new ArrayList<>(set);
        System.out.println(listWithoutDuplicates);
        // Your code here
        list = listWithoutDuplicates;

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     * the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        toSet(list); //<-- uncomment
        toSet(set); //<-- uncomment
    }

    // Write your method for exercise 2 here
    public static Set<String> toSet(Collection<String> collezioni) {
        Set<String> insieme = new HashSet<>(collezioni);
        return insieme;
    }


    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here
        int counter = 0;
        for(String word : words){
            counter++;
            wordCount.put("",counter);
        }
        System.out.println(wordCount.values());
    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer:List perchè avrò una registrazione ordinata
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer:Mappa dove per ogni classe(chiave) avrò una lista di oggetti studenti e i loro voti
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer:hashMap come chiave userò il nome del paese e come valore la sua età
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer:posso usare mappa oppure un insieme di oggetti product con i corrispettivi prezzi
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer:un arraylist la vedo bene per quando vuoi immagazinare dati in modo ordinato
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer:Mappa dove le chiavi saranno gli stati e i valori, un insieme di oggetti citta con la loro popolazione
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer:Direi una lista(treelist) perchè potrei tenere ordinati per ordine alfabetico
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer:mappa con chiave l'università e potrei usare sia un treelist o un treeset per i vari corsi
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer:Mappa con chiave i generi di film e come valore una lista che tenga in ordine tenendo in considerazione il rating e data di rilascio
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer:un insieme di oggetti voli con le loro caratteristiche
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer:list di oggetti articoli(magari un treelist che tenga in considerazione la data o un arraylist se li inserisco di volta in volta)
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer:mappa con chiave l'artista e valori le sue opere
     */

}
