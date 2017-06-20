import java.util.Scanner;

class Clock {

	private Display hour;
	private Display minute;
	private Display second;
	
	public Clock(){
		this.hour = new Display(24);
		this.minute =new Display(60);
		this.second =new Display(60);	
	}
	
	public Clock(int hour, int minute, int second){
		this.hour = new Display(hour,24);
		this.minute =new Display(minute,60);
		this.second =new Display(second,60);	
	}

	public void tick(){
		second.increase();
		if (second.getvalue() == 0){
			minute.increase();
			if (minute.getvalue() == 0){
				hour.increase();
			}
		}
	}
	
	public String toString(){

		return String.format("%02d:%02d:%02d",hour.getvalue(),minute.getvalue(),second.getvalue());	
	}
	
	public void start(){
		while (true){
			minute.increase();
			if (minute.getvalue() == 0){
				hour.increase();
			}
			System.out.printf("%02d:%02d\n", hour.getvalue(),minute.getvalue());
		}
	} 
}

 class Display {

	private int value = 0;
	private int limit = 0;
	
	public Display (int limit){
		this.limit = limit;
	}

	public Display (int value,int limit){
		this.limit = limit;
		this.value = value;
	}
	
	public void increase(){
		value ++;
		if ( value == limit ){
			value = 0;
		}
	}

	public void increase( Display h){
		value ++;
		if ( value == limit ){
			value = 0;
			h.increase();
		}
	}

	
	public int getvalue() {
		return value;
	}

}

public class Homework222 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}
}