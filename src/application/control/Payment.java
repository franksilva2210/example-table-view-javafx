package application.control;

import javafx.scene.control.TextField;

public class Payment {
	
	private String name;
	private Double valueReceived;
	private TextField txtValueReceived;
	
	public Payment() {
		this.txtValueReceived = new TextField();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValueReceived() {
		return valueReceived;
	}

	public void setValueReceived(Double valueReceived) {
		this.valueReceived = valueReceived;
	}

	public TextField getTxtValueReceived() {
		return txtValueReceived;
	}

	public void setTxtValueReceived(TextField txtValueReceived) {
		this.txtValueReceived = txtValueReceived;
	}
	
	public void extractValueReceived() {
		valueReceived = Double.valueOf(txtValueReceived.getText());
	}
	
}
