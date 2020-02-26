package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.List;
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
                .filter(forumUser -> (LocalDate.now().getYear() - forumUser.getDateOfBirsday().getYear()) > 20)
                .filter(forumUser -> forumUser.getQuantityOfPost() > 0)
                .collect(Collectors.toMap(ForumUser :: getIdentityNumerOfUser, forumUser -> forumUser));

         par.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue())
                 .forEach(System.out :: println);
    }
}
