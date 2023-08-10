package com.mmkarami.patterns.general.callback.asynchronous;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerImpl implements ActionListener {

	private boolean actionPerformed = false;

	public boolean isActionPerformed() {
		return actionPerformed;
	}

	public void setActionPerformed(boolean actionPerformed) {
		this.actionPerformed = actionPerformed;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setActionPerformed(true);
	}
}
