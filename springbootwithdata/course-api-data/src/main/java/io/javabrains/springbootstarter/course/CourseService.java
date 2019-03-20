package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	// private List<Topic> topics = new ArrayList<>(Arrays.asList(new
	// Topic("spring", "Framework", "Spring framework"),
	// new Topic("java", "JavaLang", "Learn Java")));

	public List<Course> getAllCourses(String topicId) {
		// return topics;

		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);;
		return courses;
	}

	public Course getCourse(String Id) {
		// return topics.stream().filter(t ->
		// t.getId().equals(Id)).findFirst().get();

		return courseRepository.findOne(Id);
	}

	public void addCourse(Course course) {
		// topics.add(topic);

		courseRepository.save(course);
	}

	public void updateCourse(Course topic) {
		// for (int i = 0; i<topics.size(); i++){
		// Topic t = topics.get(i);
		// if(t.getId().equals(Id)){
		// topics.set(i, topic);
		// return;
		// }
		// }

		courseRepository.save(topic);
	}

	public void deleteCourse(String Id) {
		// topics.removeIf(t -> t.getId().equals(Id));

		courseRepository.delete(Id);
	}
}
