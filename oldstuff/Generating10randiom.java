public class Generating10randiom {
    public static void main(String[] args) {
        double number;
        double totalavg = 0;
        int f;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int zero = 0;
        for (f = 0; f < 1000; f++){
            number = Math.random() * 10;
            totalavg = (totalavg + number);
            //System.out.printf("%10f %10f%n",number, totalavg);
            if ((int) number == 1){one++;
            } else if ((int) number == 2){two++;
            } else if ((int) number == 3){three++;
            } else if ((int) number == 4){four++;
            } else if ((int) number == 5){five++;
            } else if ((int) number == 6){six++;
            } else if ((int) number == 7){seven++;
            } else if ((int) number == 8){eight++;
            } else if ((int) number == 9){nine++;
            } else if ((int) number == 0){zero++;
            }
        }
        System.out.println(totalavg / (f));
		System.out.println(f);
        System.out.printf("1: %d 2: %d 3: %d 4: %d 5: %d 6: %d 7: %d 8: %d 9: %d 0: %d%n",one,two,three,four,five,six,seven,eight,nine,zero);
    }
}
