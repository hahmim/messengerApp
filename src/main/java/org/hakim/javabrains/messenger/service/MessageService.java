/**
 * 
 */
package org.hakim.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hakim.javabrains.dataBase.DataBaseClass;
import org.hakim.javabrains.messenger.model.Message;

/**
 * @author Kamilia_PC
 *
 */
public class MessageService {
	
	private Map<Long, Message> messages = DataBaseClass.getMessages();
	
	public MessageService(){
		messages.put(1L,new Message(1, "Hello World!","Hakim"));
		messages.put(2L, new Message(2,"Jersey World!","Hakim"));
	}
	
	public List<Message> getAllMessages(){

		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if (message.getId()<=0){
			return null;
		}
		messages.put((message).getId(), message);
		return message;
	}
	public Message removeMessage(long id){
		
		return messages.remove(id);
	}
}
