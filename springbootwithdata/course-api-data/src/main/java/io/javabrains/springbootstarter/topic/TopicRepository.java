package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
	// getAllTopics()
	// getTopic(String Id)
	// updateTopic
	// deleteTopic()
	
	// Spring database has inbuilt crudrepository
	
}
