package controllers;

import io.vertx.core.Vertx;

public class Main {
	public static void main(String[] args) {
		Vertx.vertx().createHttpServer().requestHandler(req -> req.response().end("ayyy lmao")).listen(8080);
	}
}
