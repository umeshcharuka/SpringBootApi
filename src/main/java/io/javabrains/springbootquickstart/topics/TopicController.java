package io.javabrains.springbootquickstart.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/alltopics")
	public List<Topic> getalltopics() {
		
		return topicService.GetALLTopic();
	}
	
	@RequestMapping("/gettopicbyid/{id}")
	public Topic getTopicById(@PathVariable String id) {
		
		return topicService.GetTopicById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/posttopics")
	public void saveTopics(@RequestBody Topic data) {
		
		topicService.Addtopics(data); 
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/posttopics/{id}")
	public void updateTopics(@RequestBody Topic data,@PathVariable String id) {
		
		topicService.Updatetopics(data,id); 
	}
	
	@RequestMapping("/deletetopicbyid/{id}")
	public void deleteTopicById(@PathVariable String id) {
		
		 topicService.DeleteTopicById(id);
	}
	
	
}
