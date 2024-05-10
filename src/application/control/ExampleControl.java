package application.control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ExampleControl implements Initializable {
	
	@FXML
    private TableColumn<Payment, String> column1;
	
	@FXML
    private TableColumn<Payment, TextField> column2;

    @FXML
    private TableColumn<Payment, Double> column3;
	
    @FXML
    private TableView<Payment> table;
    
    private ObservableList<Payment> listPayment = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		table.setItems(listPayment);
		
		table.setOnKeyPressed((KeyEvent key) -> {
			if(key.getCode() == KeyCode.ENTER) {
				confirmedValueReceived();
			}
		});
		
		column1.setCellValueFactory(new PropertyValueFactory<Payment, String>("name"));
		column2.setCellValueFactory(new PropertyValueFactory<Payment, TextField>("txtValueReceived"));
		column3.setCellValueFactory(new PropertyValueFactory<Payment, Double>("valueReceived"));
		
		initPayments();
	}
    
	private void initPayments() {
		Payment payment = new Payment();
		payment.setName("Money");
		
		listPayment.add(payment);
	}
	
	private void confirmedValueReceived() {
		Payment payment = table.getSelectionModel().getSelectedItem();
		if(payment != null) {
			payment.extractValueReceived();
			table.refresh();
		}
	}
	
}
