import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
public class osusumeQ extends Application{
	public static void main(String[]args) {
		launch(args);
	}
	int queNum;
	public void start(Stage myStage) {
		myStage.setTitle("おすすめQ");
		FlowPane rootNode=new FlowPane(10,10);
		rootNode.setAlignment(Pos.TOP_LEFT);
		Scene myScene=new Scene(rootNode,400,300);
		myStage.setScene(myScene);
		Label l1=new Label("あなたにお勧めの本を紹介します!!");
		Label l2=new Label();
		Label img=new Label();
		queNum=1;
		l2.setText(queText());
		Button btnY=new Button("Yes");
		Button btnN=new Button("No");
		rootNode.getChildren().addAll(l1,l2,btnY,btnN);
		btnY.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				queNum=queNum*2+1;
				l2.setText(queText());
				if(queNum>7) {
					rootNode.getChildren().remove(btnY);
					rootNode.getChildren().remove(btnN);
					img.setText(imglist());
					rootNode.getChildren().add(img);
				}
			}
		});
		btnN.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				queNum=queNum*2;
				l2.setText(queText());
				if(queNum>7) {
					rootNode.getChildren().remove(btnY);
					rootNode.getChildren().remove(btnN);
					img.setText(imglist());
					rootNode.getChildren().add(img);
				}
			}
		});
		myStage.show();
	}
	public String queText() {
		switch(queNum) {
		case 1:
			return "Q"+queNum+" Yes or No";
		case 2:
			return "Q"+queNum+" Yes or No";
		case 3:
			return "Q"+queNum+" Yes or No";
		case 4:
			return "Q"+queNum+" Yes or No";
		case 5:
			return "Q"+queNum+" Yes or No";
		case 6:
			return "Q"+queNum+" Yes or No";
		case 7:
			return "Q"+queNum+" Yes or No";
		case 8:
			return "Q"+queNum+" Yes or No";
		case 9:
			return "Q"+queNum+" Yes or No";
		case 10:
			return "Q"+queNum+" Yes or No";
		case 11:
			return "Q"+queNum+" Yes or No";
		case 12:
			return "Q"+queNum+" Yes or No";
		case 13:
			return "Q"+queNum+" Yes or No";
		case 14:
			return "Q"+queNum+" Yes or No";
		case 15:
			return "Q"+queNum+" Yes or No";
		}
		return null;
	}
	public String imglist() {
		switch(queNum) {
		case 8:
			return "img"+queNum;
		case 9:
			return "img"+queNum;
		case 10:
			return "img"+queNum;
		case 11:
			return "img"+queNum;
		case 12:
			return "img"+queNum;
		case 13:
			return "img"+queNum;
		case 14:
			return "img"+queNum;
		case 15:
			return "img"+queNum;
		}
		return null;
	}
}
