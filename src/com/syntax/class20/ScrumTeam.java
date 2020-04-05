package com.syntax.class20;

public class ScrumTeam extends Employee{
	String ceremonies;
	void attendMeetings() {
		System.out.println("St  "+ceremonies);
	}
}
 class BusinessAnlyst extends ScrumTeam{
	void workWthRequirements() {
		System.out.println("Requirement Characteristik :clear,correct,consistent,"
				+ "verifiable,modifiable");
	}
}
 class Tester extends ScrumTeam{
	void test() {
		System.out.println("write test plan and cases,execute it log defects,retest defect");
	}}
 class Developer extends ScrumTeam {
	void coding() {
		System.out.println("they are testing code");
	}}
 class ProductOwner extends ScrumTeam{
	 void prioritizeBacklog() {
		 System.out.println("who can talk to clients and having technical discussions dev team");
		 System.out.println("Po prioritize product backlog");
	 }}
 class ScrumMaster extends ScrumTeam{
	void navigateTeam() {
		System.out.println();
	}}
	