package common;

import java.util.List;
import java.util.Set;

public class CSVDataReader extends DataReader {

	private String csvDataReader;
	private List<Person> persons;

	public CSVDataReader(String csvDataReader) {
		this.csvDataReader = csvDataReader;
	}

	@Override
	public Set<Person> getPersons(String searchCriteria, SearchType searchType) {

	}
}
