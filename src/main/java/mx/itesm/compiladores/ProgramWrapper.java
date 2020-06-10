package mx.itesm.compiladores;

public class ProgramWrapper extends Node {
    Facts facts;
    Rules rules;
    Query query;

    public ProgramWrapper(Facts facts, Rules rules, Query query) {
        this.facts = facts;
        this.rules = rules;
        this.query = query;
    }

    @Override
    public void gen() {
        if(facts != null){
            facts.gen();
        }

        if(rules != null){
            rules.gen();
        }

        query.gen();
    }
}
