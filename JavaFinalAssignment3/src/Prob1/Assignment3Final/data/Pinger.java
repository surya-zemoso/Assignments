package Prob1.Assignment3Final.data;

import java.io.*;
import java.util.*;

public class Pinger
{

  public static void main(String args[]) 
  throws IOException
  {
    // create the ping command as a list of strings
    Pinger ping = new Pinger();
    List<String> commands = new ArrayList<String>();
    commands.add("ping");
    commands.add("-c");
    commands.add("5");
    commands.add("74.125.236.73");
    ping.doCommand(commands);
  }

  public void doCommand(List<String> command) 
  throws IOException
  {
    String s = null;

    ProcessBuilder pb = new ProcessBuilder(command);
    Process process = pb.start();

    BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
    BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

    // read the output from the command
    System.out.println("Here is the standard output of the command:\n");
    while ((s = stdInput.readLine()) != null)
    {
      System.out.println(s);
    }

    // read any errors from the attempted command
    System.out.println("Here is the standard error of the command (if any):\n");
    while ((s = stdError.readLine()) != null)
    {
      System.out.println(s);
    }
  }

}