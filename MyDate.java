public class Mydate implements Comparable<Mydate>{
	private int year;
	private int month;
	private int day;
	
	public Mydate(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "Mydate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	@Override 
	public int compareTo(Mydate o) {
		int yearMinus = year -o.getYear();
		if(yearMinus != 0) {
			return yearMinus;
		}
		int monthMinus =month -o.getMonth();
				if(monthMinus!=0) {
			return monthMinus;
		}
		return day - o.getDay();		
		
	}
}