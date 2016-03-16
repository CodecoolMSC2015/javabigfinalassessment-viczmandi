package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVDataReader extends DataReader {

	private String csvDataReader;

	public CSVDataReader(String csvDataReader) {
		this.csvDataReader = csvDataReader;
	}

	@Override
	public List<Person> getPersons() throws IOException {
		List<Person> persons = new ArrayList<Person>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("/Documentation/persons.csv")));
			String line;
			while ((line = br.readLine()) != null) {
				String[] entries = line.split(",");
				if (entries[5] != null) {
					persons.add(new Employee(entries[0], entries[1]));
				} else if (entries[5] == null) {
					persons.add(new Person(entries[0], entries[1]));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return persons;

	}
}
