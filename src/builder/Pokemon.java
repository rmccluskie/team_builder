package builder;

import java.util.ArrayList;

public class Pokemon {
    private String name; // Pokemon's name
    private Integer id; // Pokemon's national pokedex id
    private ArrayList<Move> possibleMoves; // all possible moves for this pokemon todo: separate into egg/tutor/learned/tm/etc?
    private ArrayList<Move> moves; // the chosen moveset for the pokemon
    private ArrayList<Ability> possiblyAbilities; // possible abilites for this pokemon
    private Ability ability; // chosen ability for this pokemon
    private Type type1; // pokemon's primary type
    private Type type2; // pokemon's secondary type
}
