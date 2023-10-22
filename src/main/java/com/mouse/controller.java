package com.mouse;

import com.studiohartman.jamepad.*;

public class controller {
	ControllerManager controller;
	controller() {

	}
	public void tick(){
		ControllerManager controllers = new ControllerManager();
		controllers.initSDLGamepad();
		while(true) {
  			ControllerState currState = controllers.getState(0);

  			if(!currState.isConnected || currState.b) {
  			  break;
  			}
  			if(currState.a) {
  			  System.out.println("\"A\" on \"" + currState.controllerType + "\" is pressed");
  			}
		}
	}

	

	public ControllerManager getController(){
		return controller;
	}
	public void quitSDLGamepad() {
		if((controller) != null){
			controller.quitSDLGamepad();
		}
	}
}	
