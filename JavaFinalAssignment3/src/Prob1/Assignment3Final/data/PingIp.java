package Prob1.Assignment3Final.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.omg.CORBA.portable.OutputStream;

public class PingIp {

//	static String ipAdd;
	public void median(float[] arr){
		 Arrays.sort(arr);
		if (arr.length % 2 == 0){System.out.println("Median time is "+(arr[(arr.length/2)]+arr[(arr.length/2)-1])/2.0);}
		else{System.out.println("Median time is "+arr[(int)(arr.length/2)]);}
		
	}
	
	public void ipInfo(String s, int num) throws IOException{
		String pattern = "time=(\\d+(.\\d+))";
	    float[] data = new float[num];
	    int i =0;
		String line;
		String command = "ping "+"-c"+num+ " " +s; 
//		 System.out.println(command);
		Runtime rt = Runtime.getRuntime();  
        Process pr = rt.exec(command);
        
        BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        while ((line = input.readLine()) != null) {
          System.out.println(line);
          Pattern r = Pattern.compile(pattern);
          Matcher m = r.matcher(line);
          if (m.find( )) {
//        	     System.out.println( m.group(1) );
        	     data[i] = Float.valueOf(m.group(1));
        	     i++;
        }
       } input.close();
        median(data);
	  }
	
	
	public static void main(String args[]) throws Exception {
	System.out.println("Enter the ip address to ping: ");
	Scanner scn = new Scanner(System.in);
	String IpL = scn.next();
	System.out.println("Enter number of time to ping: ");
	Scanner scn2 = new Scanner(System.in);
	int num = scn2.nextInt();
	
	PingIp ping = new PingIp();
	ping.ipInfo(IpL, num);
		
	}
}

/*
Enter the ip address to ping: 
8.8.8.8
Enter number of time to ping: 
7
ping -c7 8.8.8.8
PING 8.8.8.8 (8.8.8.8) 56(84) bytes of data.
64 bytes from 8.8.8.8: icmp_seq=1 ttl=51 time=64.0 ms
64 bytes from 8.8.8.8: icmp_seq=2 ttl=51 time=54.2 ms
64 bytes from 8.8.8.8: icmp_seq=3 ttl=51 time=56.0 ms
64 bytes from 8.8.8.8: icmp_seq=4 ttl=51 time=51.4 ms
64 bytes from 8.8.8.8: icmp_seq=5 ttl=51 time=58.1 ms
64 bytes from 8.8.8.8: icmp_seq=6 ttl=51 time=330 ms
64 bytes from 8.8.8.8: icmp_seq=7 ttl=51 time=59.9 ms

--- 8.8.8.8 ping statistics ---
7 packets transmitted, 7 received, 0% packet loss, time 6005ms
rtt min/avg/max/mdev = 51.465/96.371/330.624/95.707 ms
Median time is 58.1
*/

