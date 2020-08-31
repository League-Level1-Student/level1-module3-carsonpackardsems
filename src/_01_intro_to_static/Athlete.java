package _01_intro_to_static;

public class Athlete {
	    static int nextBibNumber;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Athlete (String name, int speed, int bibNumber){
	        this.name = name;
	        this.speed = speed;
	        this.bibNumber = bibNumber;
	    }

	    public static void main(String[] args) {
	        //create two athletes
	    	Athlete M = new Athlete("Moe", 35, 1);
	    	Athlete E = new Athlete("Mentum", 45, 2);
	        //print their names, bibNumbers, and the location of their race.
	    	System.out.println(raceLocation + ", " + raceStartTime + ". Runner number " + E.bibNumber + ", " + E.name + " and number " + M.bibNumber + ", "+ M.name + " are ready to race.");
	    }
	}
