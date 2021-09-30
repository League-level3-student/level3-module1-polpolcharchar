package _06_Meeting_Scheduler;

public class MeetingScheduler {
    /*
     * Your task is to code a method to find a meeting time for two people
     * given their schedules.
     * 
     * Code the method below so that it returns a Schedule object that contains
     * all the times during the week that are in BOTH people's schedules. The
     * Schedule class is included in this package.
     * 
     * Example:
     * person1 availability - Monday at 9, Tuesday at 14, and Friday 10
     * person2 availability - Tuesday at 14, Friday 8, and Monday at 9
     * The returned HashMap should contain: Tuesday 14 and Monday 9
     * 
     * The returned Schedule object represents the times both people are
     * available for a meeting.
     * 
     * Time availability is always at the top of the hour, so 9:30 is not valid
     * Time availability always represents 1 hour
     * Assume both schedules are in the same time zones
     */
	
	
    public static Schedule getMutualAvailability(Schedule person1, Schedule person2) {
    	Schedule result = new Schedule();
        for(String i : person1.getSchedule().keySet()) {//loop through the first person's days
        	
        	if(person2.getSchedule().containsKey(i)) {//check if person2 is avalible on that day
        		//System.out.println("Person 2 contains key");
        		for(int x : person1.getSchedule().get(i)) {
        			
        			if(person2.getSchedule().get(i).contains(x)) {
        				
        				result.addAvailability(i, x);
        				//System.out.println("added");
        				
        			}
        			
        		}
        		
        	}
        	
        }
//        for(String i : result.getSchedule().keySet()) {
//        	for(Integer j : result.getSchedule().get(i)) {
//        		System.out.println(i + " at " + i);
//        	}
//        }
//        System.out.println("\n\n\n\n\n\n");
        return result;
    }
}
