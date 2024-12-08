import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class InventoryController {
    @FXML
    private TableView<Album> tableView;
    @FXML
    private TableColumn<Album, String> nameColumn;
    @FXML
    private TableColumn<Album, String> artistColumn;
    @FXML
    private TableColumn<Album, Integer> totalColumn;
    @FXML
    private TableColumn<Album, Integer> availableColumn;
    @FXML
    private TextField albumNameField;
    @FXML
    private TextField artistField;
    @FXML
    private TextField totalField;
    @FXML
    private TextField availableField;

    private ObservableList<Album> albumList = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        nameColumn.setCellValueFactory(data -> data.getValue().albumNameProperty());
        artistColumn.setCellValueFactory(data -> data.getValue().artistProperty());
        totalColumn.setCellValueFactory(data -> data.getValue().totalProperty().asObject());
        availableColumn.setCellValueFactory(data -> data.getValue().availableProperty().asObject());

        tableView.setItems(albumList);
    }

    @FXML
    private void handleTambah() {
        try {
            String name = albumNameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());
            int available = Integer.parseInt(availableField.getText());

            Album album = new Album(name, artist, total, available, 0);
            albumList.add(album);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Album added successfully!");
            alert.show();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter valid data!");
            alert.show();
        }
    }

    @FXML
    private void handleHapus() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Album deleted successfully!");
            alert.show();
        }
    }

    @FXML
    private void handleUpdate() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            selectedAlbum.setAlbumName(albumNameField.getText());
            selectedAlbum.setArtist(artistField.getText());
            selectedAlbum.setTotal(Integer.parseInt(totalField.getText()));
            selectedAlbum.setAvailable(Integer.parseInt(availableField.getText()));

            tableView.refresh();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Album updated successfully!");
            alert.show();
        }
    }

    @FXML
    private void handleRent() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null && selectedAlbum.getAvailable() > 0) {
            selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
            selectedAlbum.setRented(selectedAlbum.getRented() + 1);

            tableView.refresh();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Album rented successfully!");
            alert.show();
        }
    }

    @FXML
    private void handleRowClick(MouseEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumNameField.setText(selectedAlbum.getAlbumName());
            artistField.setText(selectedAlbum.getArtist());
            totalField.setText(String.valueOf(selectedAlbum.getTotal()));
            availableField.setText(String.valueOf(selectedAlbum.getAvailable()));
        }
    }
}