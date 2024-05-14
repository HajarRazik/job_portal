package com.jobportal.dto;

import java.util.ArrayList;
import java.util.List;

import com.jobportal.models.JobCategory;

public class CategoryResponseDto extends CommonApiResponse {

	private List<JobCategory> categories = new ArrayList<>();

	public List<JobCategory> getCategories() {
		return categories;
	}

	public void setCategories(List<JobCategory> categories) {
		this.categories = categories;
	}

}
