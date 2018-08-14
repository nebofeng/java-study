package com.nebo.lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        //Prior Java 8 :
        List<String> features = Arrays.asList("Lambdas", "Default Method",
                "Stream API", "Date and Time API");
        for (String feature : features) {
            System.out.println(feature);
        }

        //IN java 8

        features.forEach(n->System.out.println(n));



    }
}
