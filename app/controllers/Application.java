package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

import javax.swing.text.AbstractDocument;

public class Application extends Controller {

    public static void index(){
        render();
    }
    public static void login(){
        render();
    }
    public static void trylogin(String login, String password){
        //return login+"::"+password;

        //views.html.Application.index.render(customer, orders);
        renderArgs.put("somename", "customer" );
        render();
    };

    public static void test(){
        Integer age = 22;
        renderArgs.put("age", 55 );
        render();
    }

}


/////                       https://www.playframework.com/documentation/1.2.4/templates

///// https://progi.pro/render-single-template-play-framework-7495835

////https://askdev.ru/q/poluchit-stroku-tela-zaprosa-otpravlennuyu-v-post-request-v-play-framework-java-340221/

////https://examples.javacodegeeks.com/enterprise-java/play-framework-path-query-and-route-default-params-example/