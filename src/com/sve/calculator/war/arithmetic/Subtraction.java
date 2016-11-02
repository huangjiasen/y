package com.sve.calculator.war.arithmetic;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/subtraction")
public class Subtraction {
	@OnMessage	
	public void onMessage(Session session,String msg)
	{
		try {
			msg = new arithmetic().Subtraction(msg);
			session.getBasicRemote().sendText(msg);//·¢ËÍÏûÏ¢
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
