package com.fengfan.common.result;

import java.util.List;

public class Result<Entity>{
	
	private boolean sucessful;

	private String message;

	private Page page;

	private List<Entity> content;

	/**
	 * The default constructor
	 */
	public Result() {
		super();
	}

	/**
	 * The constructor using fields
	 * 
	 * @param page
	 * @param content
	 */
	public Result(Page page, List<Entity> content) {
		this.page = page;
		this.content = content;
	}

	/**
	 * The constructor using fields
	 * 
	 * @param content
	 */
	public Result(List<Entity> content) {
		this.content = content;
	}


	/**
	 * @return Returns the content.
	 */
	public List<Entity> getContent() {
		return content;
	}

	/**
	 * @return Returns the page.
	 */
	public Page getPage() {
		return page;
	}

	/**
	 * The content to set.
	 * 
	 * @param content
	 */
	public void setContent(List<Entity> content) {
		this.content = content;
	}

	/**
	 * The page to set.
	 * 
	 * @param page
	 */
	public void setPage(Page page) {
		this.page = page;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSucessful() {
		return sucessful;
	}

	public void setSucessful(boolean sucessful) {
		this.sucessful = sucessful;
	}
}
