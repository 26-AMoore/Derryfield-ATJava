### Part A
Suppose you are to design an inheritance hierarchy with the following classes, Snake, Crocodile, Reptile, and Turtle.  
Which of these items is the superclass and why?

A: Snake
B: Turtle
C: Reptile
D: Crocodile

The answer is C, the Reptile class is the superclass because all of the other classes are desendants from it

### Part B
Suppose you have designed an inheritance hierarchy that includes the following relationships:

Guitar is a subclass of Instrument
AcousticGuitar is a subclass of Guitar
ElectricGuitar is a subclass of Guitar

Given the declarations below, which of the objects CANNOT be passed to the method tune(Guitar g) and why??

AcousticGuitar ag;
ElectricGuitar eg;
Guitar myGuitar;
Instrument myInstrument;

The object myInstrument cannot be passed to the method tune(Guitar g) because it is the superclass. Both the ElectricGuitar and the AcousticGuitar are desendants from Guitar, so they can be passed, but Instrument cannot because tune might use methods included in the Guitar class, but not in the Instrument class.
