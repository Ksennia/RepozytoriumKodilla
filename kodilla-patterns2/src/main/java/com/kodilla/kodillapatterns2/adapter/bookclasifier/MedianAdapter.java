package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {

        if (bookSet.size() == 0) return 0;
        int[] years = new int[bookSet.size()];
        int n = 0;
        for (Book book : bookSet) {
            years[n] = book.getPublicationYear();
            n++;
        }
        Arrays.sort(years);
        Arrays.sort(years);
        if (years.length % 2 == 0) {
            return years[(int) (years.length / 2 + 0.5)];
        } else {
            return years[years.length / 2];

        }
    }
}
