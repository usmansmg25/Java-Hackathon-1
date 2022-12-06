package com.cricket.TestMatch;

import model.Match;

public class TestMatch extends Match{
	public TestMatch(int currentScore, float currentOver, int targetScore) {
		super(currentScore, currentOver, targetScore);
	}

	@Override
	public float calculateRunrate() {
		int requiredRuntoWin=getTargetScore()-getCurrentScore();
		
		float Ballremaining=(float) (90*6-getCurrentOver()*6);

		float Runrate=(requiredRuntoWin/Ballremaining)*6;
		return Runrate;
	}

	@Override
	public int calculateBalls() {
		int Ballremaining=(int) (90*6-getCurrentOver()*6);
		return Ballremaining;
	}

}
		

