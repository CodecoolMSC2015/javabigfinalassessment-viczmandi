package common;

import java.util.List;
import java.util.Set;

public class CSVDataReader extends DataReader {

	private String csvDataReader;
	private List<Person> persons;

	public CSVDataReader(String csvDataReader) {
		this.csvDataReader = csvDataReader;
	}

	public Set<Person> getPersons() {
	}
}
