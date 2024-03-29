package com.company.grammar;
import java.util.*;

public class ContextFreeGrammar {
    private Set<String> nonTerminals;
    private Set<String> terminals;
    private Map<String, List<String>> productions;
    private String startSymbol;

    public ContextFreeGrammar() {
        nonTerminals = new HashSet<>();
        terminals = new HashSet<>();
        productions = new HashMap<>();
    }

    public void addNonTerminal(String nonTerminal) {
        nonTerminals.add(nonTerminal);
    }

    public void addTerminal(String terminal) {
        terminals.add(terminal);
    }

    public void addProduction(String nonTerminal, String production) {
        if (!productions.containsKey(nonTerminal)) {
            productions.put(nonTerminal, new ArrayList<>());
        }
        productions.get(nonTerminal).add(production);
    }

    public void setStartSymbol(String startSymbol) {
        this.startSymbol = startSymbol;
    }

    public Set<String> getNonTerminals() {
        return nonTerminals;
    }

    public Set<String> getTerminals() {
        return terminals;
    }

    public Map<String, List<String>> getProductions() {
        return productions;
    }

    public String getStartSymbol() {
        return startSymbol;
    }

}
