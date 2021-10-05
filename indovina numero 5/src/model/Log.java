package model;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Log {
	FileWriter fw;
	SimpleDateFormat formatter;
	Calendar cal;

	public Log() {

		formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss:SS ");

	}

	public void writeLog(String msg) {
		cal = Calendar.getInstance();
		String strDate = formatter.format(cal.getTime());
		try {
			fw = new FileWriter("Testo.txt", true);
			fw.write(strDate + msg + "\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
