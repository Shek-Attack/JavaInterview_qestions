package Lambdaex;

import java.util.Comparator;

public class LmadbaExamples {
    public static void main(String[] args) {

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        int comparison = stringComparator.compare("hello","world");
        System.out.println(comparison);

        Comparator<String> stringComparatorLambda =
                (String o1, String o2) -> {return o1.compareTo(o2) ; };
        int lambdaComparison = stringComparatorLambda.compare("hello","world");
        System.out.println(lambdaComparison);

    }
}
