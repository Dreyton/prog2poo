package ex2.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private String title;
	private String content;
	private Integer likes;
	private LocalDateTime moment;
	private List<Comment> comments = new ArrayList<>();

	public void addComment(Comment c) {
		comments.add(c);
	}

	public void removeComment(Comment c) {
		comments.remove(c);
	}

	public Post(String title, String content, Integer likes, LocalDateTime moment) {
		super();
		this.title = title;
		this.content = content;
		this.likes = likes;
		this.moment = moment;
		// this.comments = new ArrayList<>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

}
