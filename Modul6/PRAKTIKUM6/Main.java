package PRAKTIKUM6;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @SuppressWarnings("unchecked")
	@Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> tabel = new TableView<>();

        TableColumn<Mahasiswa, String> kolomNim = new TableColumn<>("NIM");
        kolomNim.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> kolomNama = new TableColumn<>("Nama");
        kolomNama.setCellValueFactory(new PropertyValueFactory<>("nama"));

        tabel.getColumns().addAll(kolomNim, kolomNama);

        ObservableList<Mahasiswa> dataMahasiswa = FXCollections.observableArrayList(
                new Mahasiswa(1, "2210817110008", "Aditya Oktaviari"),
                new Mahasiswa(2, "221081711", "Rehan"),
                new Mahasiswa(3, "221081711", "Pasha"),
                new Mahasiswa(4, "221081721", "Hafiz"),
                new Mahasiswa(5, "221081721", "Ikhsan"),
                new Mahasiswa(6, "221081721", "Kholid"),
                new Mahasiswa(7, "221081721", "Dhani"),
                new Mahasiswa(8, "221081731", "Aeron"),
                new Mahasiswa(9, "221081731", "Nizar"),
                new Mahasiswa(10, "221081731", "Alif")
        );

        tabel.setItems(dataMahasiswa);

        Scene scene = new Scene(tabel, 200, 300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
