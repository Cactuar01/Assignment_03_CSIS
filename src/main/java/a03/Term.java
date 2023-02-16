package a03;

import java.util.Comparator;

public class Term implements Comparable<Term> {

    // Initialize a term with the given query string and weight.
    String query;
    double weight;
    public Term(String query, double weight){
        if(query == null){
            throw new NullPointerException();
        }else if(weight < 0){
            throw new IllegalArgumentException();
        }
        this.query = query;
        this.weight = weight;
    }

    // Compare the terms in descending order by weight.
    public static Comparator<Term> byReverseWeightOrder(){
        return null;
    }

    // Compare the terms in lexicographic order but using only the first r characters of each query.
    public static Comparator<Term> byPrefixOrder(int r){
        return null;
    }

    // Compare the terms in lexicographic order by query.
    public int compareTo(Term that){
        return this.query.compareTo(that.query);
    }

    // Return a string representation of the term in the following format:
    // the weight, followed by a tab, followed by the query.
    public String toString(){
        return null;
    }
}
