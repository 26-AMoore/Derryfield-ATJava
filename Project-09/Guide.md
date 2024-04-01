Unit 09 Programming Project:
For these programming projects, students are encouraged to work together.  Students should not use, however, any AI tools (including ChatGPT) to generate their code for these projects. Also, blind copying is not permitted.  The work that a student submits should accurately represent the student's understanding of the material and their best effort.

Project #1
The magic 8 ball is a popular toy that people use as a fortune telling instrument.  The ball contains a 20-side die that floats inside the body of the 8 ball.  



Users ask a question of the toy ("will I get an A on my Unit 09 programming project?"), then they shake the toy a bit and then flip the device over to view what answer is displayed in the window ("Outlook not so good").

There are 20 possible outcomes of the magic 8 ball:

It is certain
It is decidedly so
Without a doubt
Yes definitely
You may rely on it
As I see it, yes
Most likely
Outlook good
Yes
Signs point to yes
Reply hazy, try again
Ask again later
Better not tell you now
Cannot predict now
Concentrate and ask again
Don't count on it
My reply is no
My sources say no
Outlook not so good
Very doubtful


For this project you will design a class called Magic8Ball and write a program that uses the class to "predict" the user's future.

Part A: 
Document what the public interface (how will people or other objects use your Magic8Ball object?) of the Magic8Ball class looks like.  Specify the class interface below.  Note that you do not need to implement the public methods. You only need to provide the public method declarations in this part of the assignment. 

class Magic8Ball {
    public void roll() {

    }
    public String read() {

    }
}

Place the Magic8Ball class in a package called org.derryfield.toys.

Part B: 
Specify what the data representation of your Magic8Ball class below  (i.e., list what variables you will use to model the state of your magic 8 ball).

static final String[] answers;
static int rolledNum;






Part C:
Implement a constructor for the Magic8Ball class and list the constructor's implementation below:





public Magic8Ball() {
	roll();
}





Part D:
Implement the remaining methods of your Magic8Ball class and write an example Java project that imports the org.derryfield.toys.Magic8Ball class, and demonstrates how the class works.  Keep looping within your program until the user enters a 'q' to quit the application.

Non-AT students should submit their work using MSA.  AT Students should upload their work to GitHub and also submit a link to their repository for this assignment using MSA.


