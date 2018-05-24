package ro.angel.classes.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import ro.angel.classes.Audio;
import ro.ase.interfaces.Streamable;

public class StreamAudio extends Audio implements Streamable{

	Vector<Integer> stream;
	
	public StreamAudio(String denumire, float lungime, int semnaturaUnica,
			int calitate,Vector<Integer> stream) throws Exception {
		super(denumire, lungime, semnaturaUnica, calitate);
		
		this.stream = stream;
	}
	
	

	public Vector<Integer> getStream() {
		return stream;
	}



	public void setStream(Vector<Integer> stream) {
		this.stream = stream;
	}

	


	@Override
	public void citesteStreamFisier(String numeFisier) {
		try {
			FileReader fileReader = new FileReader(new File(numeFisier));
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line = "";
			while((line = bufferedReader.readLine()) != null) {
				
			}
			
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
