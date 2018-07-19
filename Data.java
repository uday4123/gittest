package com.posidex.linkdlink.dao;

import java.util.ArrayList;

public class Data {
	private ArrayList<Object> returnflights;
	private ArrayList<Onwardflight> onwardflights;

	public ArrayList<Object> getReturnflights() {
		return this.returnflights;
	}

	public void setReturnflights(ArrayList<Object> returnflights) {
		this.returnflights = returnflights;
	}

	public ArrayList<Onwardflight> getOnwardflights() {
		return this.onwardflights;
	}

	public void setOnwardflights(ArrayList<Onwardflight> onwardflights) {
		this.onwardflights = onwardflights;
	}
}