package sched;

	import java.io.File;
	import java.util.Scanner;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class schedule
		{

			public static void IntroForGradeAndScheduleChange()
				{

					Scanner userInput = new Scanner(System.in);
					System.out.println(" Hello, would you like to (1) change Grades or (2) Change Schedule?");

					boolean studentList = true;
					while (studentList)
						{
							int catagory = userInput.nextInt();
							if (catagory == 1)
								{

									changeGrades();
									studentList = false;
								} else if (catagory == 2)
								{
									switchClasses();
									studentList = false;
								}

							else
								{
									System.out.println("Please pick either 1 or 2.");

								}
						}

				}

			public static void changeGrades()
				{
					Scanner userInput = new Scanner(System.in);

					System.out.println("Okay, here are all of the students: ");

					Runner.printRoster();

					
					
					System.out.println("Please enter the first name of a student to change their grades.");
					
					String firstName = userInput.next();

					System.out.println("Please enter the last name of the student.");
					
					String lastName = userInput.next();
					
					String fullName = firstName + " " + lastName; 
					

					for (Student s : Runner.roster)
						{
							if((s.getFirstName() + " " + s.getLastName()).equals(fullName))
								{ 
									System.out.println("Here is the student: " + s.getFirstName() + " " + s.getLastName() + " " + s.getFirstClass() + " " + s.getFirstClassGrade() + " " + s.getSecondClass() + " " + s.getSecondClassGrade() + " " + s.getThirdClass() + " " + s.getThirdClassGrade() + " " + 0.0);
									
									System.out.println("Which class would you like to change the grade in?\n1) " + s.getFirstClass() + " " + s.getFirstClassGrade()  + "\n2) " + s.getSecondClass() + " " + s.getSecondClassGrade()  + "\n3) " + s.getThirdClass() + " " + s.getThirdClassGrade());
									
									int chosenClass = userInput.nextInt(); 
									
									if(chosenClass == 1) 
										{ 
											System.out.println("You are changing the grade in " + s.getFirstClass());
											
											System.out.println("What would you like the new grade to be?");
											
											String chosenGrade = userInput.next(); 
											
											s.setFirstClassGrade(chosenGrade);
											
											System.out.println("Okay, the grade has been changed");
											
										}
									
									else if(chosenClass == 2)
										{ 
											System.out.println("You are changing the grade in " + s.getSecondClass());
											
											System.out.println("What would you like the new grade to be?");
											
											String chosenGrade2 = userInput.next(); 
											
											s.setSecondClassGrade(chosenGrade2);
											
											System.out.println("Okay, the grade has been changed");
											
										}
									
									else if(chosenClass == 3)
										{ 
											System.out.println("You are changing the grade in " + s.getThirdClass());
											
											System.out.println("What would you like the new grade to be?");
											
											String chosenGrade3 = userInput.next(); 
											
											s.setThirdClassGrade(chosenGrade3);
											
											System.out.println("Okay, the grade has been changed");
											
										}
									
									System.out.println("Here is the updated roster: "); 
									Runner.printRoster();
								
									
									
									
									
													
									
								}
						}
					
					
					
					
					
					
					

				}

	//Clancy: line 70
			public static void switchClasses()
				{


				Scanner userInput = new Scanner(System.in);

				System.out.println("Okay, here are all of the students: ");

				Runner.printRoster();

				String[] classes = new String[3];
				
				System.out.println("Please enter the first name of a student to change their grades.");
				
				String firstName = userInput.next();

				System.out.println("Please enter the last name of the student.");
				
				String lastName = userInput.next();
				
				String fullName = firstName + " " + lastName; 
				

				for (Student s : Runner.roster)
					{
						if((s.getFirstName() + " " + s.getLastName()).equals(fullName))
							{ 
								System.out.println("Here is the student: " + s.getFirstName() + " " + s.getLastName() + " " + s.getFirstClass() + " " + s.getFirstClassGrade() + " " + s.getSecondClass() + " " + s.getSecondClassGrade() + " " + s.getThirdClass() + " " + s.getThirdClassGrade() + " " + 0.0);
								
								System.out.println("Which class would you like to switch?\n1) " + s.getFirstClass() + " " + s.getFirstClassGrade()  + "\n2) " + s.getSecondClass() + " " + s.getSecondClassGrade()  + "\n3) " + s.getThirdClass() + " " + s.getThirdClassGrade());
								System.out.println("Which second class would you like to switch?\n1) " + s.getFirstClass() + " " + s.getFirstClassGrade()  + "\n2) " + s.getSecondClass() + " " + s.getSecondClassGrade()  + "\n3) " + s.getThirdClass() + " " + s.getThirdClassGrade());
								int chosenClass = userInput.nextInt(); 
								
								if(chosenClass == 1) 
									{ 
									
									}
								
								else if(chosenClass == 2)
									{ 
									
									}
								
								else if(chosenClass == 3)
									{ 
							
									}
								
								System.out.println("Here is the updated roster: "); 
								Runner.printRoster();
				}

		
		}
}
		
}

