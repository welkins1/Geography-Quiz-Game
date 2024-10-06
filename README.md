This is my second Java project that I've decided to upload on GitHub. It's a program that allows you to play a simple Geography quiz with varying difficulties.

This project took way longer than I thought, mainly because I wanted features in the program that I did not know how to implement.

This program relies heavily on array lists, which I have not yet learned within Java, and I'm sure the way I implemented them in the program was not
the most efficient or beautiful way. At the time, though, this was the easiest way I knew of to create Arrays containing the questions and answers to the quiz.

This is the first program I've made with another Java class that correlates with the main program to make it run. I had to 
explore this, and I still do not know what some of the lines of code do outside of the comments I added. The "this." keyword was confusing to learn about and I'm still not
exactly sure of its use other than to point the program in the right direction. I'm sure I'll learn more about it later on in my Java studies.

From what I can remember, there isn't a particular reason why I decided to make another source package outside the main program, I think I just wanted it all
to be cleaner, or I didn't know how to do it within the main coding space.

Something that I surprisingly couldn't figure out or didn't want to deal with at the time was making the correct answer display appear with uppercase lettering without
changing the answer formatting. If I changed the answer formatting to include uppercase letters, the user's response would have to match the specific formatting, and it
would make all instances of input.nextLine().toLowerCase() pointless and makes every user input answer incorrect. Perhaps this is something I will come back to and fix.

On the note of input.nextLine().toLowerCase();, I believe I determined that if there is a user input instance of input.nextLine(), every user input instance would have
to be input.nextLine. I don't know if that holds true in Java programming as a whole, but this is something that caused runtime errors if I did not adjust every user
input instance.

It was fun to figure out the Loading questions..... and Calculating score.... for loop. NetBeams did the work for me when it came to the for loops; I only had to figure
out the thread.sleep function and how to properly display the dots. The java.util.Collections import was also interesting to learn about, and it was relatively easy to
input.

Overall, I learned a lot in this program, and I'll continue to study what I learned.

P.S.

You can run this program by putting both .java files within the same folder/directory and running javac *.java within cmd/terminal. You can then run the program by typing
java GeographyQuizGame.java 
