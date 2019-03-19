package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	// private List<Topic> topics = new ArrayList<>(Arrays.asList(new
	// Topic("spring", "Framework", "Spring framework"),
	// new Topic("java", "JavaLang", "Learn Java")));

	public List<Topic> getAllTopics() {
		// return topics;

		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String Id) {
		// return topics.stream().filter(t ->
		// t.getId().equals(Id)).findFirst().get();

		return topicRepository.findOne(Id);
	}

	public void addTopic(Topic topic) {
		// topics.add(topic);

		topicRepository.save(topic);
	}

	public void updateTopic(String Id, Topic topic) {
		// for (int i = 0; i<topics.size(); i++){
		// Topic t = topics.get(i);
		// if(t.getId().equals(Id)){
		// topics.set(i, topic);
		// return;
		// }
		// }

		topicRepository.save(topic);
	}

	public void deleteTopic(String Id) {
		// topics.removeIf(t -> t.getId().equals(Id));

		topicRepository.delete(Id);
	}
}
