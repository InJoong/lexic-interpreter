package mx.itesm.compiladores;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Delete extends Node {

    @Override
    public void gen() {
        Main.db.drop();
        MongoClientURI uri = new MongoClientURI(
                // cadena de conexión
                "mongodb+srv://admin:admin@cluster0-xzjed.mongodb.net/familia?retryWrites=true&w=majority");

        MongoClient mongoClient = new MongoClient(uri);
        Main.db = mongoClient.getDatabase("familia");
    }
}
