package com.design.abstractfacotry;

public class SpringFactory extends SkinFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new SpringButton();
	}

	@Override
	public Combox createCombox() {
		// TODO Auto-generated method stub
		return new Combox() {
			
			@Override
			public void disPlay() {
				System.out.println("new combox");
			}
		};
	}

	@Override
	public TextFiled createTextFiled() {
		// TODO Auto-generated method stub
		return new SpringTextFiled();
	}
}
