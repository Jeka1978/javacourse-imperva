package com.imperva.guess_game;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Evegeny on 28/06/2017.
 */
@Data
@AllArgsConstructor
public class Player {
    private String name;
    private double score;
}
