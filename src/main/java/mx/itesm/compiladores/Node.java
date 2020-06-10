package mx.itesm.compiladores;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public abstract class Node {

    public abstract void gen();
}
