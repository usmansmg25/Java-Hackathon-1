package com.cricket.ODIMatch;

import model.Match;

public class ODIMatch extends Match{

	public ODIMatch(int currentScore, float currentOver, int targetScore) {
		super(currentScore, currentOver, targetScore);
	}


	@Override
	public float calculateRunrate() {
		int requiredRuntoWin=getTargetScore()-getCurrentScore();
		
		float Ballremaining=(float) (50*6-getCurrentOver()*6);

		float Runrate=(requiredRuntoWin/Ballremaining)*6;
		return Runrate;
	}

	
	@Override
	public int calculateBalls() {
		int Ballremaining=(int) (50*6-getCurrentOver()*6);
		return Ballremaining;
	}

}
