package org.vashonsd.pirateshipClient.message;

import java.io.Serializable;

/*
 * The body of the message is what is sent to the server, and what is received from the server.
 * In its simplest form, it is just a wrapper for a String.
 */
public class Message {
	private String body;

	public Message(String body) {
		super();
		this.body = body;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
