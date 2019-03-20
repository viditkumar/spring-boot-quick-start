package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

@Entity
public class Course {

	@javax.persistence.Id
	private String Id;
	private String name;
	private String description;

	// How do we tell spring that this topic is foreign key to the primary key
	// of Topic table
	
	// Many course can be related to this topic
	// This is Many-to-One relation
	
	@ManyToOne
	private Topic topic;

	public Course() {

	}

	public Course(String id, String name, String description, String topicId) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
