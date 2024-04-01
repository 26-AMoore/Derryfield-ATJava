package org.derryfield.toys;
public class Magic8Ball {
	static final String[] answers = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy, try again", "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};
	static int rolledNum;

	public Magic8Ball() {
		roll();
	}
	public void roll() {
		rolledNum = (int)(Math.random() * answers.length);
	}
	public String read() {
		return answers[rolledNum];
	}
}


