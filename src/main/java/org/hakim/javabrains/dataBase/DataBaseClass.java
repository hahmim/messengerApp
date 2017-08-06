/**
 * 
 */
package org.hakim.javabrains.dataBase;

import java.util.HashMap;
import java.util.Map;

import org.hakim.javabrains.messenger.model.Message;
import org.hakim.javabrains.messenger.model.Profile;

/**
 * @author Kamilia_PC
 *
 */
public class DataBaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
	
	
}
