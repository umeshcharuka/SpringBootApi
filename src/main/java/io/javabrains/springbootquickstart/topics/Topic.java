package io.javabrains.springbootquickstart.topics;

public class Topic {

	
	private String id;
	private String name;
	private String title;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Topic(String id, String name, String title) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
	}
	
	public Topic() {
	
	}
}
