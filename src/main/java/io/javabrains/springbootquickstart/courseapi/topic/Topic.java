package io.javabrains.springbootquickstart.courseapi.topic;

public class Topic {
	private String id;
	private String name;
	private String descript;

	public Topic() {

	}

	public Topic(String id, String name, String descript) {
		super();
		this.id = id;
		this.name = name;
		this.descript = descript;
	}

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

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

}
