package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	// getAllTopics()
	// getTopic(String Id)
	// updateTopic
	// deleteTopic()

	// Spring database has inbuilt crudrepository

	// we just declare methods here if it is not listed in crudrepository
	// give name to the method accordingly

	// No Need to implement the method, just declare the method by
	// findByProperty name format
	// public List<Course> findByName(String name);

	// public List<Course> findByDescription(String foo);

	// findByTopic would have worked if topic was a string, but it is a class
	// public List<Course> findByTopic(String name);
	public List<Course> findByTopicId(String Id);
}
