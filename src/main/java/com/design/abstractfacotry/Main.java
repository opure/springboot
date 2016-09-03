package com.design.abstractfacotry;

public class Main {
	public static void main(String[] args) {
		SkinFactory skinFactory = new SpringFactory();
		Button button = skinFactory.createButton();
		button.disPlay();
		TextFiled textFiled = skinFactory.createTextFiled();
		textFiled.disPlay();
		Combox combox = skinFactory.createCombox();
		combox.disPlay();
	}
}
