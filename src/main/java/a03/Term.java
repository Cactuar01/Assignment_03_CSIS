package a03;

import java.util.Comparator;

public class Term implements Comparable<Term>{
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
    public static Comparator<Term> byReverseWeightOrder(){
        return null;
    }
    public static Comparator<Term> byPrefixOrder(int r){
        if(r < 0){
            throw new IllegalArgumentException();
        }
        return null;
    }
    @Override
    public int compareTo(Term o) {
        return this.query.compareToIgnoreCase(o.query);
    }
    public String toString(){
        return null;
    }
}
