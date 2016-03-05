/**
 * 
 */
package org.vashonsd.pirateshipClient;

/**
 * @author andy
 * This represents the information the sender of the message knows about itself.
 * At a bare minimum, the Player sends its own username.
 * 
 * Probably we will want to include the session token, but check with the XMPP client library
 * to see how this might be parsed.
 */
public class PlayerState {
	private String username;

	public PlayerState(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
