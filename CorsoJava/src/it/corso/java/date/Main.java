package it.corso.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
//		m.esSimpleDateFormat();
//		m.esPeriodDuration();
//		m.esLocalTime();
//		m.esLocalDate();
//		m.esCalendar();
		m.esDate();
	}
	
	private void esSimpleDateFormat() {
		Calendar c = new GregorianCalendar();
		c.set(Calendar.YEAR, 2017);
		c.set(Calendar.MONTH, 4);
		c.set(Calendar.DATE, 29);
		c.set(Calendar.HOUR, 10);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 25);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String data = sdf.format(c.getTime());
		
		System.out.println(data);
		
		sdf = new SimpleDateFormat("dd-MM-yyyy - HH:mm:ss");
		data = sdf.format(c.getTime());
		
		System.out.println(data);
		
		try {
			Date d = sdf.parse("01-02-2017 - 23:10:24");
			System.out.println(d.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

	}
	
	private void esPeriodDuration() {
		Duration d1 = Duration.ofSeconds(10, 40);
		
		System.out.println(d1.getSeconds());
		System.out.println(d1.getNano());
		
		LocalTime ltApMattina = LocalTime.of(9, 30);
		LocalTime ltChMattina = LocalTime.of(13, 30);
		
		Duration d2 = Duration.between(ltApMattina, ltChMattina);
		
		System.out.println(d2.getSeconds());
		System.out.println(d2.getNano());
		
		
	}
	
	/* classe localdatetime = classe congiunta tra localdate e localtime */
	
	private void esLocalTime() {
		LocalTime ltApMattina = LocalTime.of(9, 30);
		LocalTime ltChMattina = LocalTime.of(13, 30);
		
		LocalTime ltApPomeriggio = LocalTime.of(15, 30);
		LocalTime ltChPomeriggio = LocalTime.of(19, 30);
		
		System.out.println(ltApMattina.toString());
		System.out.println(ltChMattina.toString());
		System.out.println(ltApPomeriggio.toString());
		System.out.println(ltChPomeriggio.toString());
		
	}
	
	private void esLocalDate() {
		LocalDate ld = LocalDate.of(2017, 3, 29);

		System.out.println(ld.isLeapYear());
		System.out.println(ld.lengthOfMonth());
		System.out.println(ld.getDayOfWeek());
		
		LocalDate ld2 = ld.withYear(2015);
		System.out.println(ld2.toString());
		
		LocalDate ld3 = ld.plusMonths(3);
		System.out.println(ld3.toString());
		System.out.println(ld3.minusDays(5).toString());
	}
	
	private void esCalendar() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2000);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.DATE, 29);

		System.out.println(cal.getTime());
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		Calendar cal2 = new GregorianCalendar();
		
		cal2.setTime(new Date());
		
		System.out.println(cal2.get(Calendar.YEAR));
	}

	private void esDate() {
		Date data = new Date();
		
		System.out.println(data.getTime());
		
		System.out.println(data.toString());
	}
	
	
}
