package dmacc.beans;

import java.util.Random;

public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;

	public Game() {
		super();
	}
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getComputerPlayer() {
		return computerPlayer;
	}

	public void setComputerPlayer(String computerPlayer) {
		this.computerPlayer = computerPlayer;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}	
	
	@Override
	public String toString() {
		return "Game [player1=" + player1 + ", computerPlayer=" + computerPlayer + ", winner=" + winner + "]";
	}


	
	public void setComputerPlayer() {
		String compChoice ="";
		Random rand = new Random();
		int num = rand.nextInt(3) + 1;
		switch(num) {
		case 1: 
			compChoice = "rock";
			break;
		case 2: 
			compChoice = "paper";
			break;
		case 3:
			compChoice = "scissors";
			break;
		}		
		
		this.setComputerPlayer(compChoice); 
	}
	
	
	public void determineWinner() {
		String winner = "Computer";
		if(player1.equals("rock") && (computerPlayer.equals("scissors") || computerPlayer.equals("lizard"))) {
			winner = "player";
		}else if(player1.equals("scissors") && (computerPlayer.equals("paper") || computerPlayer.equals("lizard"))) {
			winner = "player";
		}else if(player1.equals("paper") && (computerPlayer.equals("rock")|| computerPlayer.equals("spock"))) {
			winner = "player";
		}else if(player1.equals("lizard") && (computerPlayer.equals("paper") || computerPlayer.equals("spock"))) {
			winner = "player";
		}else if(player1.equals("spock") && (computerPlayer.equals("rock")|| computerPlayer.equals("scissors"))){
			winner = "player";
		}
		
		
		if(player1.equalsIgnoreCase(computerPlayer)) {
			winner = "tie";
		}
		this.setWinner(winner);
		
	}

}