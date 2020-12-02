package io.javabrains.springbootquickstart.courseapi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	public List<Topic> topics = Arrays.asList(new Topic("spring", "springframework", "springframework desc"),
			new Topic("java", "core java", "java desc"), new Topic("java", "core java", "java desc"));

	public List<Topic> getAllTopics1() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
	// to delete the data we use upper command
}
