package com.revature;

import com.azul.crs.client.service.ClientService;

import io.javalin.Javalin;

public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * Assignment: return the status code for a generic "client side error" in the http response
         * 
         * Note: Please refer to the "StatusCodes.MD" file for more assistance if needed.
         */
        app.get("/client-side-err", ctx -> {
            ctx.status(400);
        });
        return app;
    }
    
}