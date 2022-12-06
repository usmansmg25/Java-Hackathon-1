
  Cricket :


Note : Strictly adhere to the object oriented specifications given as a part of the problem statement.

Use the same class names and member variable names.
Follow the naming conventions mentioned for getters / setters.
Create 3 separate classes in 3 separate files.
 

Consider that the climax of the cricket match is going on (i.e second innings of the match) and we need to calculate the required run rate for the team to win.

If we consider cricket match there are 3 international formats ---  Test ,ODI and T20, each has 90overs per day, 50 overs and 20 overs respectively.  Each over has 6 balls. In our scenario we will consider as its 5th day of the Test match, so the team need to achieve the particular runs in 90 overs.

Create an abstract class named Match with 3 private data member varibales
 
 
Data Type       Member Variable Name
 
int              currentScore
float            currentOver
int              targetScore


Include appropriate getters and setters.
Include the following public methods.

Method Name                                  Method Description
 
 
float calculateRunrate()                   This is an abstract method.
int calculateBalls()                       This is an abstract method.
void display(double reqRunRate,int balls) This method displays the number of balls remaining and the required run rate in the format specified in the sample output.
 

Create the class ODIMatch which extends the class Match .

Create the class T20Match which extends the class Match .

Create the class TestMatch which extends the class Match .

In all the 3 above classes , override the 2 methods --- calculateBalls () and calculateRunrate().

Create a driver class named Main which creates an instance of the above mentioned classes. Required run rate and remaining balls must be calculated seperately for all the derived classes (value must be round to 2 decimal place).

Required run rate is calculated as runs required/ remaining balls.

Input and Output Format :
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and the rest corresponds to output]

Sample Input and Output 1
Enter the Cricket Format
1.ODI
2.T20
3.Test
1
Enter the Current Score
256
Enter the Current Over
30
Enter the Target Score
400
Requirements:
Need 144 Runs in 120 balls
Required Run Rate - 7.20

Sample Input and Output 2
Enter the Cricket Format
1.ODI
2.T20
3.Test
2
Enter the Current Score
120
Enter the Current Over
15
Enter the Target Score
170
Requirements:
Need 50 Runs in 30 balls
Required Run Rate - 10.00

Sample Input and Output 3
Enter the Cricket Format
1.ODI
2.T20
3.Test
3
Enter the Current Score
200
Enter the Current Over
60
Enter the Target Score
450
Requirements:
Need 250 Runs in 180 balls
Required Run Rate - 8.33

Sample Input and Output 4
Enter the Cricket Format
1.ODI
2.T20
3.Test
4
Invalid Format type
 
  
