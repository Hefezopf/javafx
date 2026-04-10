module hellofx {
	requires transitive javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens de.hopfit to javafx.fxml;
	
	exports de.hopfit;
}