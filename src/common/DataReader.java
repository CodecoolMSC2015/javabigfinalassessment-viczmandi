package common;

import java.util.Set;

public class DataReader {

	private String searchCriteria;
	private SearchType searchType;

	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	public void setSearchType(SearchType searchType) {
		this.searchType = searchType;
	}

	public Set<Person> getPersons(String searchCriteria, SearchType searchType) {
	}
}
