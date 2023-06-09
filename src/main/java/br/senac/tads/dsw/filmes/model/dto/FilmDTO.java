package br.senac.tads.dsw.filmes.model.dto;

public class FilmDTO {

	private String title;
	private String category;
	private Integer year;

	public FilmDTO() {
		super();
	}

	public FilmDTO(String title, String category, Integer year) {
		super();
		this.title = title;
		this.category = category;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
