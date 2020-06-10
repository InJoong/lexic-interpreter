package mx.itesm.compiladores;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public abstract class Node {
    protected MongoClientURI uri = new MongoClientURI(
            // cadena de conexión
            "mongodb+srv://admin:admin@cluster0-xzjed.mongodb.net/familia?retryWrites=true&w=majority");
    protected MongoClient mongoClient = new MongoClient(uri);
    protected MongoDatabase db = mongoClient.getDatabase("familia");

    public abstract void gen();
}
