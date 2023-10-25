package lecture4;

public class exe1 {

public static void main(String[] args) {

String computer = "Computer";
int length = computer.length();
char first = computer.charAt(0);
char last = computer.charAt (length - 1);
char middle = computer.charAt(length/2);

System.out.println("The word is " + length + " letters long.");
System.out.println("The first letter is " + first);
System.out.println("The last letter is " + last);
System.out.println("The middle letter is "+ middle);

boolean Com = computer.startsWith("Com");
System.out.println("The word starts with \"Com\": " + Com);

boolean Ion = computer.endsWith("ion");
System.out.println("The word ends with \"ion\": " + Ion);

String swappedWord = computer.replace('e', 'o');
System.out.println("Swapping 'e' with 'o': " + swappedWord);

String replacedWord = computer.replace("Comp", "Calcula");
System.out.println("Swapping Comp\" with \"Calcula\": " + replacedWord);

String newWord = computer.substring(0, 2);
newWord = newWord.replace('e', 'o');
System.out.println("Swap all 'e' letters with 'o': " + newWord);

replacedWord = replacedWord.replace("Compu", "Calcula");
System.out.println("Swap the \"Compu\" segment with \"Calcula\": " + replacedWord);
}
}
