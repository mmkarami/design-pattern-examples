package com.mmkarami.patterns.general.callback.synchronous;

public class ListenerImpl implements Listener {

	@Override
	public String onTrigger() {
		return "My action is performed.";
	}
}