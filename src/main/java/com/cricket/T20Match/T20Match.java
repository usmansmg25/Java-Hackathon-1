package com.cricket.T20Match;

import model.Match;

public class T20Match extends Match{
	
	public T20Match(int currentScore, float currentOver, int targetScore) {
		super(currentScore, currentOver, targetScore);
	}

	@Override
	public float calculateRunrate() {
		int requiredRuntoWin=getTargetScore()-getCurrentScore();
		
		float Ballremaining=(float) (20*6-getCurrentOver()*6);

		float Runrate=(requiredRuntoWin/Ballremaining)*6;
		return Runrate;
	}

	@Override
	public int calculateBalls() {
		int Ballremaining=(int) (20*6-getCurrentOver()*6);
		return Ballremaining;
	}

}
