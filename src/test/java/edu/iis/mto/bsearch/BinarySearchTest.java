package edu.iis.mto.bsearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import static org.hamcrest.MatcherAssert.assertThat;


class BinarySearchTest {

    int key=6;
    @Test void ifIsInSequence() {
        int seq[]={6};//dlugosc sekwencji = jeden
        SearchResult sr = BinarySearch.create().search(key,seq);
        assertTrue(sr.isFound());//asercja sprawdzajaca prawdziwosc warunku
        assertEquals(seq.length-1,sr.getPosition()); //i = getPosition()
        assertEquals(key,seq[seq.length-1]); //key=seq[i]
    }

    @Test void ifIsNotInSequence() {
        int seq[]={4};//dlugosc sekwencji = jeden
        SearchResult sr = BinarySearch.create().search(key,seq);
        assertFalse(sr.isFound());
        assertEquals(-1,sr.getPosition());
    }

    @Test void ifIsTheFirstElement() { //liczac pozycje od 0
        int seq[]={6,7,8,9,10};
        SearchResult sr = BinarySearch.create().search(key,seq);
        assertTrue(sr.isFound()); //true
        assertEquals(0,sr.getPosition()); //i = getPosition()
        assertEquals(key,seq[0]); //key=seq[i]
    }
    @Test void ifIsTheLastElement() { //liczac pozycje od 0
        int seq[]={2,3,4,5,6};
        SearchResult sr = BinarySearch.create().search(key,seq);
        assertTrue(sr.isFound()); //true
        assertEquals(seq.length-1,sr.getPosition()); //i = getPosition()
        assertEquals(key,seq[seq.length-1]); //key=seq[i]
    }
}
