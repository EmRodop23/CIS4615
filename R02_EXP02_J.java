// Rule 02. Expressions (EXP)
// EXP02-J. Do Not Use the Object.equals() Method to Compare Two Arrays

int[] arr1 = new int[20]; // Initialized to 0
int[] arr2 = new int[20]; // Initialized to 0
System.out.println(arr1 == arr2); // Prints false 
