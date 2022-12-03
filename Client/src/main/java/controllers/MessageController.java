package controllers;

import java.util.ArrayList;
import java.util.HashSet;

import models.Id;
import models.Message;

public class MessageController { //we need to create a constructor?
    private Message message; //caro: added instance
    private HashSet<Message> messagesSeen;
    // why a HashSet?? Messages come in batches

//    public MessageController(HashSet<Message> messagesSeen, Message message) { //caro: created constructor
//        this.messagesSeen = messagesSeen; //auto generated
//        this.message = message; //added in constructor
//    }
//
//    public MessageController() { //caro: created nullery
//
//    }


    public ArrayList<Message> getMessages() {
        return null;
    } //why return an arraylist
    public ArrayList<Message> getMessagesForId(Id Id) {
        return null;
    }
    public Message getMessageForSequence(String seq) {
        return null;
    }
    public ArrayList<Message> getMessagesFromFriend(Id myId, Id friendId) {
        return null;
    }

    public Message postMessage(Id myId, Id toId, Message msg) {
        return null;
    }
 
}