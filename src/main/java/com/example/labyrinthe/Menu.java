package com.example.labyrinthe;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class Menu extends AnchorPane{
    public Menu() {
        super();
        this.setBackground(new Background(new BackgroundImage(new Image("file:Images/Fond_Menu.jpg"),
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(100,100,
                        true, true,true, true))));
    }


    public Menu(Node... arg0) {
        super();
    }
}
