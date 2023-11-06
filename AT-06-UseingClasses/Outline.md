In order to solve this programming challenge, it's helpful to breakdown the problem into smaller 
more manageable tasks:

Print the column headers of the calendar
Each column is four characters wide.
The column header has a three day abbreviation and trailing blank space.
Figure out what day of the week the 1st of this month falls on.
Your calendar should start on the first of the month.
You have to determine what day of the week the first of the month falls on.
You can use the minusDays() method to create an object that represents the first of the current month.
Print blank spaces until we get to the 1st of the month (you can use a loop to do this).
Start at the 1st of the month and repeat until it's next month (use a loop)
Print the current calendar day
Use printf to do a formatted print statement.
Specify that the column width is 3 characters wide.
Check if the if the current calendar day equals today, 
If so, print an asterisk
Otherwise, print a blank space
Increase the current day by one.
If the current calendar day falls on the 1st day of the week, print a newline.
Print a newline at the end of the month.

The LocalDate Class
For this assignment you will want to use the LocalDate class to create objects that represent dates on a calendar.  LocalDate is part of the java.time package.  You will need to import java.time.LocalDate into your program in order to be able to use this class.
The LocalDate class is interesting because it does not have a public constructor method that you can use.  So, if you want to create an instance of the LocalDate class you will have to use one of the available methods to create an instance and return a reference to that newly created object.
The following code example declares a variable called rightNow and creates an instance of the LocalDate object using the static now() method.  
LocalDate rightNow = LocalDate.now();
The object created by the now() method is then assigned to the rightNow variable.  After this assignment has been made, the rightNow variable refers to (points to) the newly created LocalDate object.
Invoking Instance Methods
Once you've created an instance of the LocalDate object and assigned it to a variable, you can use its instance methods to interact with the object. The following code uses the getDayOfMonth() method to get the day of the month for the object that is referred to by the variable rightNow.
// get the day of the month for today.
int today = rightNow.getDayOfMonth();
Creating Additional Objects
For this programming challenge, you will also need to create other new LocalDate objects.  
For example, in order to generate a calendar for the current month, you will want to create an object of LocalDate type that refers to the first day of the current month.
If the variable rightNow represents today, then the following code will create a new LocalDate object that represents the first day of the current month:
// declare a variable called date of LocalDate type.
// start at the beginning of the month.
LocalDate date = rightNow.minusDays(today - 1);


The call to the method, minusDays(today - 1), creates a new LocalDate object that is a copy of the rightNow object, but that occurs (today - 1) days in the past.  So if today is the 3rd day of the month, the variable date will refer to a LocalDate object that represents the day that occurs 2 days earlier than today.
You can use the variable date to "point to" (or refer to) the current date that you are printing in your calendar.
The following code can be used if you want to update the variable date in your program so that it points to the next day in the calendar,
// update date.
date = date.plusDays(1);


Mon Tue Wed Thu Fri Sat Sun
                          1 
  2   3   4   5   6   7   8 
  9  10  11  12  13  14  15 
 16  17* 18  19  20  21  22 
 23  24  25  26  27  28  29
 30  31

