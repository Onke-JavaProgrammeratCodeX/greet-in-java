package net.greet;
import java.util.List;

public class Help
{



                private String[] help = {

                "\t\t \tWelcome to the help description page" ,
                "\t\t \t overview of possible commands" , "\t\t \t ------------------------------\n",
                "1. greet : this command greets a user : the following are syntax description examples",
                "   *> greet onke , this greets a user in English { default }",
                "   greet onke Xhosa , this greets a user in xhosa e.t.c",
                "   this App has three languages , Xhosa , Zulu , English",
                "2. greeted :  display a list of all users that has been greeted and how many time each user has been greeted",
                "3. greeted followed by a username returns how many times that username have been greeted ",
                "4. counter returns a count of how many unique users has been greeted",
                "5. clear deletes of all users greeted and then resets the greet counter to 0",
                "6. clear followed by a username delete the greet counter for the specified user and decrement the greet counter by 1",
                "7. exit exits the application ",
                "8. help shows a user an overview of all possible commands"

        }; // end of array

        public Help() // constructor
        {
             helpDescription();
        }

        public void helpDescription()
        {
            for(String details : help)
            System.out.println(details);
        }

}
