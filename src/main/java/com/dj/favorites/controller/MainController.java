package com.dj.favorites.controller;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class MainController
{
    @FXML
    private WebView webView;

    public void init()
    {
        webView.getEngine().load("https://www.baidu.com/");
    }
}
