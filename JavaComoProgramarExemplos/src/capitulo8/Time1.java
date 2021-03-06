package capitulo8;

public class Time1 {
	
	private int hour;
	private int min;
	private int sec;
	
	public void setTime(int hour, int min, int sec) {
		
		if (hour < 0 || hour >=24 || min < 0 || min >=60 || sec < 0 || sec >=60) 
		{
			throw new IllegalArgumentException("Hour, minute and/or second was out of range");	
		}
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	public String toUniversalSring() 
	{
		return String.format("%02d:%02d:%02d", hour,  min, sec);
	}
	
	@Override
	public String toString() 
	{
		return String.format("%d:%02d:%02d %s", 
				((hour == 0 || hour == 12) ? 12  :  hour % 12),
				min, sec, (hour < 12 ? "AM" : "PM"));		
	}

}
