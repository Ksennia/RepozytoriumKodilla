package stream;

import stream.beautifier.PoemBeautifier;
import stream.forumuser.Forum;
import stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        //7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.poemBeautifierer("Princess", String::toUpperCase);
        poemBeautifier.poemBeautifierer("Lion", String::toLowerCase);
        poemBeautifier.poemBeautifierer("Mirele", (s) -> "ABC" + s + "ABC");
        poemBeautifier.poemBeautifierer("Moovie", (s) -> "^_^ " + s);


        //7.3
        Forum theForum = new Forum();
        Map<Integer, Object> par = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                //.filter(forumUser -> ChronoUnit.YEARS.between(LocalDate.now(), forumUser.getDateOfBirsday()) > 20)
                .filter(forumUser -> (LocalDate.now().getYear() - forumUser.getDateOfBirsday().getYear()) > 20)
                .filter(forumUser -> forumUser.getQuantityOfPost() > 0)
                .collect(Collectors.toMap(ForumUser:: getIdentityNumerOfUser, forumUser -> forumUser));

         par.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue())
                 .forEach(System.out :: println);
    }
}
