package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	// getAllTopics()
	// getTopic(String Id)
	// updateTopic
	// deleteTopic()
	
	// Spring database has inbuilt crudrepository
	
}
