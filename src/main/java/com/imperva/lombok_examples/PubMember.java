package com.imperva.lombok_examples;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

import java.util.List;
import java.util.Map;

/**
 * Created by Evegeny on 25/06/2017.
 */
@Data
@Builder
public class PubMember {
    private String name;
    @NonNull
    private Integer age;
    @Singular
    private List<String> beers;

    @Singular
    private Map<String,Integer> priorities;


    public static void main(String[] args) {
        PubMember hadas = PubMember.builder().priority("stack",9).priority("salat",4).beer("Leff").beer("Goldstar").name("Hadas").age(12).build();
        System.out.println("hadas = " + hadas);

    }





}







