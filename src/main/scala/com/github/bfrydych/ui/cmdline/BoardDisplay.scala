package com.github.bfrydych.ui.cmdline

import com.github.bfrydych.core.Board
import com.github.bfrydych.core.Address

class BoardDisplay(board:Board) {
	def display() {
	  board.eachField(displayField)
	}
	
	def displayField(address:Address, int:Int) {
	  print(int);
	  if (address.column == board.size) {
	    println();
	  }
	}
}