package com.design.Observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
	public String getName();
	public void setName(String name);
	public void help();
	public void beAttachd(AllyControlCenter acc);
}

class Player implements Observer {
	private String name;
	
	@Override
	public String getName() {
		return this.name;
	}
	
	public Player(String name) {
		// TODO Auto-generated constructor stub
		this.name =name ;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public void help() {
		System.out.println("坚持住，" + this.name + "来救你！");
	}

	@Override
	public void beAttachd(AllyControlCenter acc) {
		  System.out.println(this.name + "被攻击！");
	      acc.notifyObserver(name);		
	}
	
}

abstract class AllyControlCenter {
	protected String allName;
	protected List<Observer> observers = new ArrayList<>();
	public String getAllName() {
		return allName;
	}
	public void setAllName(String allName) {
		this.allName = allName;
	}
	
	public void join(Observer observer) {
		System.out.println(observer.getName() + "加入" + this.allName + "战队！");
		observers.add(observer);
	}
	
	public abstract void notifyObserver(String name);
	
}

class ConcreteAllyControlCenter extends AllyControlCenter {
	public ConcreteAllyControlCenter(String allyName) {
		System.out.println(allyName + "战队组建成功！");
		System.out.println("----------------------------");
		this.allName = allyName;
	}
	
	@Override
	public void notifyObserver(String name) {
		System.out.println(this.allName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
	      //遍历观察者集合，调用每一个盟友（自己除外）的支援方法
	      for(Object obs : observers) {
	          if (!((Observer)obs).getName().equalsIgnoreCase(name)) {
	              ((Observer)obs).help();
	          }
	      }		
	}
}

