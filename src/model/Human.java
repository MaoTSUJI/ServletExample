package model;

import java.io.Serializable;

public class Human implements Serializable{	// ①直列化可能で、②クラスはpublicで修飾
	private String name;	// ④フィールドはカプセル化する
	private int age;

	public Human() {}	// ③publicで引数のないコンストラクタをもつ
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
