import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class App extends Application {
    @Override
    public void start(Stage primaryStage) {   
        MenuBar menuBar = new MenuBar(); 
        Menu menuFile = new Menu("ARCHIVO");
        Menu menuEdit = new Menu("EDITAR");
        Menu menuHelp = new Menu("AYUDA");
        MenuItem newItem = new MenuItem("NUEVO");
        MenuItem openItem = new MenuItem("ABRIR");
        MenuItem saveItem = new MenuItem("GUARDAR");
        MenuItem exitItem = new MenuItem("Salir");

        menuFile.getItems().addAll(newItem, openItem, saveItem, new SeparatorMenuItem(), exitItem);

        MenuItem cutItem = new MenuItem("CORTAR");
        MenuItem copyItem = new MenuItem("COPIAR");
        MenuItem pasteItem = new MenuItem("PEGAR");

        menuEdit.getItems().addAll(cutItem, copyItem, pasteItem);
        MenuItem aboutItem = new MenuItem("ACERCA DE LA APLICACION");

        menuHelp.getItems().add(aboutItem);
        menuBar.getMenus().addAll(menuFile, menuEdit, menuHelp);
        newItem.setOnAction(e -> System.out.println("NUEVO ARCHIVO CREADO"));
        openItem.setOnAction(e -> System.out.println("ARCHIVO ABIERTO"));
        saveItem.setOnAction(e -> System.out.println("ARCHIVO GUARDADO"));
        exitItem.setOnAction(e -> System.exit(0));
        cutItem.setOnAction(e -> System.out.println("TEXTO CORTADO"));
        copyItem.setOnAction(e -> System.out.println("TEXTO COPIADO"));
        pasteItem.setOnAction(e -> System.out.println("TEXTO PEGADO"));
        aboutItem.setOnAction(e -> System.out.println("Acerca de esta aplicación"));
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setTitle("SISTEMA DE MENU");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}