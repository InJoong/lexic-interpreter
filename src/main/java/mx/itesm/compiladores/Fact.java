package mx.itesm.compiladores;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class Fact extends  Node {
    public Predicate predicate;
    public LiteralList literalList;

    public Fact(Predicate predicate, LiteralList literalList) {
        this.predicate = predicate;
        this.literalList = literalList;
    }

    @Override
    public void gen(){
        //Se general el codigo de mongo
        db.createCollection(predicate.predicateString);
        MongoCollection<Document> collection = db.getCollection(predicate.predicateString);

        Document document = new Document();

        for(int i=0; i<literalList.literalList.size(); i++){
            document.append(String.valueOf(i), literalList.literalList.get(i).literal);
        }

        collection.insertOne(document);
    }
}
