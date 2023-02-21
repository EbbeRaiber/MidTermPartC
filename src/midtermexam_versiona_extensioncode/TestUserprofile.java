package midtermexam_versiona_extensioncode;
import java.util.*;
/**     This class +++ insert class discription here +++
 *
 * @author Ebbe Raiber
 */
public class TestUserprofile {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        
        String userID = scanner.nextLine();
        
        System.out.print("Pick one of the Genres and enter the name Comedy, Drama, Action, Mystery :");
        
        String genre = scanner.nextLine();
        
        newUser.Userprofile();
        
        if(newUser != null){
            System.out.print("Your profile has been created");
        }
    }
}
