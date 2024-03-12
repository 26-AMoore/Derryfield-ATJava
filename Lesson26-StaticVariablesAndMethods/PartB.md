class Item {
   private int value;
   public void setValue(int value) {
       value = value;
   }
   public int getValue() {
       return value;
   }
}

public class ThisDemo {
   public static void main(String[] args) {
       Item myItem = new Item();
       System.out.print(myItem.getValue() + " | ");
       myItem.setValue(13);
       System.out.println(myItem.getValue());
   }
}


The code above will return the wrong value, because in the setValue() method you set "value = value" which is trying to set a variable to itself. The idea is to change the value, but this does not work, because the first initiated value takes precedent. To fix this code just replace getValue(int value) with getValue(int newValue).
