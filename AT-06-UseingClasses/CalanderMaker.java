import java.time.LocalDate;
import java.time.DayOfWeek;

public class CalanderMaker {

	public static void main(String[] args) {
		LocalDate rightNow = LocalDate.now();
		int today = rightNow.getDayOfMonth();
		LocalDate date = rightNow.minusDays(today - 1);
		int firstNum;
		int rowNum = 1;
		int columNum = 1;
		int lastDay = rightNow.lengthOfMonth();

		DayOfWeek firstDay = date.getDayOfWeek();

		if (firstDay == DayOfWeek.MONDAY) {
			firstNum = 1;
		} else if (firstDay == DayOfWeek.TUESDAY) {
			firstNum = 2;
		} else if (firstDay == DayOfWeek.WEDNESDAY) {
			firstNum = 3;
		} else if (firstDay == DayOfWeek.THURSDAY) {
			firstNum = 4;
		} else if (firstDay == DayOfWeek.FRIDAY) {
			firstNum = 5;
		} else if (firstDay == DayOfWeek.SATURDAY) {
			firstNum = 6;
		} else if (firstDay == DayOfWeek.SUNDAY) {
			firstNum = 7;
		} else {
			firstNum = 0;
		}

		//setting the header up
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		today = 1;
		while (today <= lastDay) {
			if (today == rightNow.getDayOfMonth()){
				System.out.printf("%-2d* ",today);
				today++;
				columNum++;
			} else {
				if (rowNum == 1) {
					if (columNum < firstNum) {
						System.out.printf("    ",columNum);
						columNum++;
					} else if (columNum <= 7){
						System.out.printf("%-4d", today);
						today++;
						columNum++;
					} if (columNum > 7) {
						columNum = 0;
						rowNum++;
						System.out.println("");
					}
				} else if (rowNum != 1){
					if (columNum < 7){
						System.out.printf("%-4d", today);
						today++;
						columNum++;
					} else if (columNum >= 7) {
						columNum = 0;
						rowNum++;
						System.out.println("");
					}
				}
			}
		}
	}
}
