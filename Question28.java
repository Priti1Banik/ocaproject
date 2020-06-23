package com.capgemini.ocapracticequestion.corejava;

public class Question28 {
void readCard(int cardNo) throws Exception{
	System.out.println("Reading Card");
}
void checkCard(int cardNo) throws RuntimeException{
	System.out.println("Checking Card");
}
public static void main(String[] args) throws Exception {
	Question28 a = new Question28();
	int cardNo = 12344;
	a.readCard(cardNo);
	a.checkCard(cardNo);
}
}
