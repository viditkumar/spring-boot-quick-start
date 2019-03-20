package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{Id}/courses")
	public List<Course> getAllCourses(@PathVariable String Id){
		return courseService.getAllCourses(Id); 
	}
	
	@RequestMapping("/topics/{topicId}/courses/{Id}")
	public Course getCourse(@PathVariable String Id){
	// Another way:
	// @RequestMapping("topics/{foo}")
	// public Topic getTopic(@PathVariable(*foo*) String Id){
		return courseService.getCourse(Id);
	}
	
	// GET is default for RequestMapping
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId){
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{Id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String Id){
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value ="/topics/{topicId}/courses/{Id}")
	public void deleteCourse(@PathVariable String Id){
		courseService.deleteCourse(Id);
	}
}
