import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;
public class hangman extends Application {
    private static String[] words = {&quot;terminator&quot;, &quot;banana&quot;, &quot;computer&quot;, &quot;cow&quot;, &quot;rain&quot;, &quot;water&quot; };
    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace(&quot;\0&quot;, &quot;*&quot;);
     int count ;
    private Label wordLabel = new Label(asterisk);
    private TextField inputField = new TextField();
    private  Line stand = new Line(150, 150, 150, 50);
   
     private  ScrollBar scroll = new ScrollBar();
   
    private HBox root = new HBox(10, wordLabel, inputField);
     //Scene scene = new Scene(root, 300, 200);
    Stage primaryStage = new Stage();
    public void start(Stage primaryStage) {
        inputField.setOnAction(e -&gt; hang(inputField.getText()));
 
       
        root.setAlignment(Pos.CENTER);
     
        root.getChildren().add(stand);
       Scene scene = new Scene(root, 300, 200);
       
        primaryStage.setScene(scene);
        primaryStage.setTitle(&quot;Hangman Game&quot;);
        primaryStage.show();
       
    }
    public void hang(String guess) {
        String newasterisk = &quot;&quot;;
        for (int i = 0; i &lt; word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != &#39;*&#39;) {
                newasterisk += word.charAt(i);
            } else {



                newasterisk += &quot;*&quot;;
            }
        }
        if (asterisk.equals(newasterisk)) {
            count++;
            hangmanImage();
        } else {
            asterisk = newasterisk;
            wordLabel.setText(asterisk);
        }
        if (asterisk.equals(word)) {
            inputField.setEditable(false);
            wordLabel.setText(&quot;Correct! You win! The word was &quot; + word);
        }
    }
    public void hangmanImage() {
       
     
        Label message = new Label(&quot;Wrong guess,\n try again\n&quot;);
        message.setLayoutX(100);
        message.setLayoutY(20);
        message.setLineSpacing(100);
        root.getChildren().add(message);
        Line stand = new Line(150, 350, 150, 50);
        root.getChildren().add(stand);
   
         if (count == 1) {
            Line roof = new Line(150, 50,250,50);
            root.getChildren().add(roof);
            Line pole = new Line(250, 50, 250, 100);
            root.getChildren().add(pole);
            Scene scene2 = new Scene(root, 300, 200);
             primaryStage.setScene(scene2);
         
              primaryStage.show();
       
       
        }
        if (count == 2) {
            Line roof = new Line(150, 50,250,50);
            root.getChildren().add(roof);

            Line pole = new Line(250, 50, 250, 100);
            Line rope = new Line(250, 100, 250, 120);
            root.getChildren().add(rope);
            Scene scene3 = new Scene(root, 300, 200);
             primaryStage.setScene(scene3);
         
              primaryStage.show();
        }
        if (count == 3) {
            Line roof = new Line(150, 50,250,50);
            root.getChildren().add(roof);
            Line pole = new Line(250, 50, 250, 100);
            Line rope = new Line(250, 100, 250, 120);
            root.getChildren().add(rope);
            Circle head = new Circle(250,140,20);
            root.getChildren().add(head);
            Scene scene4 = new Scene(root, 300, 200);
             primaryStage.setScene(scene4);
         
              primaryStage.show();
        }
        if (count == 4) {
             Line roof = new Line(150, 50,250,50);
            root.getChildren().add(roof);
            Line pole = new Line(250, 50, 250, 100);
            Line rope = new Line(250, 100, 250, 120);
            root.getChildren().add(rope);
            Circle head = new Circle(250,140,20);
            root.getChildren().add(head);
            Line body = new Line(250, 160, 250, 260);
            root.getChildren().add(body);
            Scene scene5 = new Scene(root, 300, 200);
             primaryStage.setScene(scene5);
         
              primaryStage.show();
        }
        if (count == 5) {
            Line roof = new Line(150, 50,250,50);
            root.getChildren().add(roof);
            Line pole = new Line(250, 50, 250, 100);
            Line rope = new Line(250, 100, 250, 120);
            root.getChildren().add(rope);
            Circle head = new Circle(250,140,20);


            root.getChildren().add(head);
            Line body = new Line(250, 160, 250, 260);
            root.getChildren().add(body);
            Line leftArm = new Line(250, 180, 220, 210);
            root.getChildren().add(leftArm);
            Line rightArm = new Line(250, 180, 280, 210);
            root.getChildren().add(rightArm);
            Scene scene6 = new Scene(root, 300, 200);
             primaryStage.setScene(scene6);
         
              primaryStage.show();
        }
        if (count == 6) {
            Line roof = new Line(150, 50,250,50);
            root.getChildren().add(roof);
            Line pole = new Line(250, 50, 250, 100);
            Line rope = new Line(250, 100, 250, 120);
            root.getChildren().add(rope);
            Circle head = new Circle(250,140,20);
            root.getChildren().add(head);
            Line body = new Line(250, 160, 250, 260);
            root.getChildren().add(body);
            Line leftArm = new Line(250, 180, 220, 210);
            root.getChildren().add(leftArm);
            Line rightArm = new Line(250, 180, 280, 210);
            root.getChildren().add(rightArm);
            Line leftLeg = new Line(250,260,220,290);
            root.getChildren().add(leftLeg);
            Line rightLeg = new Line(250,220,280,290);
            root.getChildren().add(rightLeg);
            Scene scene7 = new Scene(root, 300, 200);
             primaryStage.setScene(scene7);
         
              primaryStage.show();
        }
        if (count == 7) {
            message.setText(&quot;GAME OVER! The word was &quot; + word);
        }
    }    // code to display the hangman image, similar to the previous version
    public static void main(String[] args)
   {
           launch(args);


    }
    private static class primaryStage {
        public primaryStage() {
        }
    }
}