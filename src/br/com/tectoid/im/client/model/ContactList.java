package br.com.tectoid.im.client.model;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
	private Contact me;
	private List<Contact> contacts = new ArrayList<Contact>();

	public ContactList(String name) {
		this.me = new Contact(name);
	}

	public Contact getMe() {
		return this.me;
	}

	public void addContact(Contact contact) {
		contacts.add(contact);
	}

	public int getContactCount() {
		return contacts.size();
	}

	public Contact getContact(int index) {
		return contacts.get(index);
	}
}
