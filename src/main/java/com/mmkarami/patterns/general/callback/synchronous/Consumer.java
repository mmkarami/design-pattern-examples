package com.mmkarami.patterns.general.callback.synchronous;

public class Consumer {

	private Listener listener;

	public Consumer(Listener listener) {
		this.listener = listener;
	}

	public String doSynchronousAction() {
		return listener.onTrigger();
	}
}