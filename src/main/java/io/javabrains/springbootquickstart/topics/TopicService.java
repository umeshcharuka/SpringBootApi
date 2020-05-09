package io.javabrains.springbootquickstart.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics=new ArrayList<> (Arrays.asList(
			new Topic("1","umesh1","Topic1"),
			new Topic("2","umesh2","Topic2"),
			new Topic("3","umesh3","Topic3"),
			new Topic("4","umesh4","Topic4"),
			new Topic("5","umesh5","Topic5"),
			new Topic("6","umesh6","Topic6"),
			new Topic("7","umesh7","Topic7"),
			new Topic("8","umesh8","Topic8")
			
			
			));
	public List<Topic> GetALLTopic(){
		
		return topics;
		
	}
	
	public Topic GetTopicById(String id) {
		
		return topics.stream().filter(p->p.getId().equals(id)).findFirst().get();
		
	}
	
	public void Addtopics(Topic e) {
		topics.add(e); 
	}

	public void Updatetopics(Topic data,String id) {
    for(int i=0;i< topics.size();i++) {
	Topic t=topics.get(i);
	if(t.getId().equals(id))
	{
		topics.set(i, data);
	}
	
}
		// TODO Auto-generated method stub
		
	}

	public void DeleteTopicById(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(p->p.getId().equals(id));
	}
	

}
