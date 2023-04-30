package com.buffer;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

class DataImport {
//inserting data
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost/vozilopark";
	static final String user="root";
	static final String pass="DarkLord@05";
	public Connection con;
	DataImport(){
		try {
			System.out.println("Checking for driver");
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver ok");
			System.out.println("Connecting database");
			con=DriverManager.getConnection(DB_URL,user,pass);
			System.out.println("Connected");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}
		catch(SQLException se) {
			System.out.println("SQL Exception");
		}
	}
	
	public void insertdata(Connection xyz,Method abc,Heap bcd) throws SQLException {
		PreparedStatement pstmt=null;
		String query,query1;
		query="select * from parking";
		pstmt=xyz.prepareStatement(query);
		ResultSet rs1=pstmt.executeQuery(query);
		while(rs1.next()) {
		String no=rs1.getString("parkingno");
		int f=rs1.getInt("fill");
		Parking newnode=abc.search(no);
		if(f==1) {
			newnode.fill=true;
			abc.Put(no,newnode);
			query1="select * from vehicle where parkingno = '"+no+"'";
			PreparedStatement x=xyz.prepareStatement(query1);
			ResultSet rs2=x.executeQuery(query1);
			Vehicle newnode1=new Vehicle();
			while(rs2.next()) {
				newnode1.Vehicle_No=rs2.getString("Vehicleno");
				newnode1.Phone_No=rs2.getString("phoneno");
				newnode1.ParkingNo=rs2.getString("parkingno");
				LocalDate localDate = rs2.getDate("EntryDate").toLocalDate();
				newnode1.Date=localDate;
				CharSequence s1=rs2.getString("Entrytime");
				LocalTime localtime=LocalTime.parse(s1);
				newnode1.Entry=localtime;
				abc.entry(no, newnode1);
			}
		}
		else {
			bcd.insert(newnode);
			
			}
		}
		
		}
		
		public long delete(Connection xyz,Method abc,Heap bcd,String number) throws SQLException {
		System.out.println("Delete Executed");
		PreparedStatement pstmt=null;
		String query,query1;
		bcd.insert(abc.search(number));
		Vehicle car=abc.exit(number);
		car.exit();
		long a=car.payment();
		query="delete from vehicle where parkingno=?";
		pstmt=xyz.prepareStatement(query);
		pstmt.setString(1,number);
		pstmt.executeUpdate();
		query1="update parking set fill=0 where parkingno=?";
		pstmt=xyz.prepareStatement(query1);
		pstmt.setString(1,number);
		pstmt.executeUpdate();
		for(int i = 0; i < 48; i ++) {
			if(MainServlet.h.heap[i] != null)System.out.println(MainServlet.h.heap[i].parkingNo);
		}
		return a;
		}
		
		public String getnearest(Connection xyz,Method abc,Heap bcd,String vehno,String phnum) throws SQLException {
		
		//heap
		Parking allocted=bcd.heap[1];
		String s2=allocted.parkingNo;
		
		
		Vehicle cust=new Vehicle();
		cust.userdetails(allocted.parkingNo,vehno,phnum);
		abc.Put(allocted.parkingNo, allocted);
		abc.entry(allocted.parkingNo,cust);
		bcd.delete();
		
		PreparedStatement pstmt=null;
		String query;
		query="insert into vehicle values( '"+cust.Vehicle_No+"','"+cust.ParkingNo+"','"
		+cust.Phone_No+"','"+cust.Date.toString()+"','"+cust.Entry.toString()+"')";
		pstmt=xyz.prepareStatement(query);
		pstmt.executeUpdate();
		
		String query1="update parking set fill=1 where parkingno= '"+s2+"'";
		pstmt=xyz.prepareStatement(query1);
		pstmt.executeUpdate();
		
		return s2;
	}

}





