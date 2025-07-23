package com.techlabs.LearningMgmt.test;

import com.techlabs.LearningMgmt.model.ArticleContent;
import com.techlabs.LearningMgmt.model.Content;
import com.techlabs.LearningMgmt.model.ContentRenderer;
import com.techlabs.LearningMgmt.model.PodcastContent;
import com.techlabs.LearningMgmt.model.QuizContent;
import com.techlabs.LearningMgmt.model.VideoContent;

public class ContentTest {
public static void main(String[] args) {
	
	Content con = new Content();
	
	ContentRenderer video = new VideoContent();
	ContentRenderer article = new ArticleContent();
	ContentRenderer quiz = new QuizContent();
	ContentRenderer podcast = new PodcastContent();
	
	con.renderContent(video);
	con.renderContent(article);
	con.renderContent(quiz);
	con.renderContent(podcast);
	
}
}
