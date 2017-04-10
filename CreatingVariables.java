public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, years;
		double seconds, e, checking, savings;
		String firstName, lastName, title, memberSince;
		
		x = 10;
		y = 400;
		age = 39;
		years = 5;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		savings = 2000.01;
		
		firstName = "Graham ";
		lastName = "Mitchell ";
		title = "Mr "; 
		memberSince = "December 1st 1992";
		
		System.out.println ( "The variable x contains " + x );
		System.out.println ( "The value " + y + " is stored in the variable y" );
		System.out.println ( "The experiment took " + seconds + " seconds.");
		System.out.println ( "A favorite irrational # is Euler's number: " + e );
		System.out.println ( "Hopefully you have more than $" + checking + "!" ); 
		System.out.println ( "My name's " + title + " " + firstName + lastName );
		System.out.println ( title + firstName + lastName + " has been a member since " + memberSince + " totalling " + years + " years" );
		System.out.println ( "and has a total savings of $" + savings );
		}
	}