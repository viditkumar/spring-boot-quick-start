package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Framework", "Spring framework"),
			new Topic("java", "JavaLang", "Learn Java")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String Id){
		return topics.stream().filter(t -> t.getId().equals(Id)).findFirst().get();
	}
	
	public void addTopic(Topic topic){
		topics.add(topic);
	}
}
