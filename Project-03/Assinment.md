AT Project
A minivan has two sliding doors. Each door can be opened by either a dashboard switch, its inside handle, or its outside handle. However, the inside handles do not work if a child lock switch is activated. In order for the sliding doors to open, the gear shift must be in park, and the master unlock switch must be activated.

Your task is to simulate a portion of the control software for the vehicle. The input for your program is a sequence of values for the switches and the gear shift, in the following order:

Dashboard switches for left and right sliding door, child lock, and master unlock (0 for off or 1 for activated)
Inside handles on the left and right sliding doors (0 or 1)
Outside handles on the left and right sliding doors (0 or 1)
The gear shift setting (one of P N D 1 2 3 R).

A typical input would be 00010100P (represented as a string of characters).

For your assignment, make sure to address the following requirements:

Your program should include a class called "DoorSystem" that has member variables that represent the state of the dashboard switches, the inside and outside door handles of the sliding doors, and the current gear shift setting.
Your class definition should include a constructor that accepts a String argument that represents the input state of your door system.
Be sure to use an enumerated type to represent the state of your gear shift setting.
You class should have two methods that check whether the sliding doors should open:
isLeftOpen() returns true if the left door should open based on the state of the door system.
isRightOpen() returns true if the right door should open based on the state of the door system.
Your program should print “left door opens” and/or “right door opens” as appropriate. If neither door opens, print “both doors stay closed”.
