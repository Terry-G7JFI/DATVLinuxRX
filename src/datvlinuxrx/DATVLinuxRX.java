/*
 * Copyright (C) 2020 Terry Steeper
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package datvlinuxrx;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;

/**
 *
 * @author terry
 */
public class DATVLinuxRX {
    
    private static String rawdata;
    private static String firstword;
    private static String lastword;
    
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) throws java.io.IOException 
    {
        RXGui ow = new RXGui();
        ow.setTitle("DATV Linux RX - G7JFI");
        ow.setVisible(true);
        
        DatagramSocket clientSocket = null;
        
        int read;
        int I;
        int Q;
        
        while (true)
        {            
            if(null == clientSocket)
            {
                try
                {
                    clientSocket = new DatagramSocket(10001);
                }catch(Exception e)
                {
                    System.out.print(e);
                    try
                    {
                        clientSocket = null;
                        System.out.println("Failed to open socket");
                        Thread.sleep(1000);
                    }catch(Exception f){}
                }
            }
            if(clientSocket != null)
            {
                byte[] buff = new byte[100];
                DatagramPacket packet = new DatagramPacket(buff, buff.length);
                
                while (true)
                {
                    clientSocket.receive(packet);
                    buff = packet.getData();
                    String rawdata = new String(packet.getData(),0,packet.getLength());
                    ArrayList<String> lines = new ArrayList<>();
                    rawdata.lines().forEach(s -> lines.add(s));

                    for(String thisline : lines)
                    {
                         firstword = thisline;
                         
                        // $n,m<cr>
                        // ditch leading $
                        if (thisline.length() > 0)
                        {
                            thisline=thisline.substring(1);
                        }
                        if (thisline.length() > 0)
                        {
                            // split on the comma...
                            int i = thisline.indexOf(',');
                            if(i != -1)
                            {
                                firstword = thisline.substring(0, i);
                                lastword  = thisline.substring(i + 1);           
                            }
                        }
                        switch(firstword)
                        {
                            case "1":
                            {
                                if(lastword.length() == 1)
                                {
                                    switch(lastword)
                                    {
                                        case "0": ow.setState("Initialising..");    break;
                                        case "1": ow.setState("Searching..");       break;
                                        case "2": ow.setState("Found Headers!");    break;
                                        case "3": ow.setState("DVB-S - LOCKED!");   break;
                                        case "4": ow.setState("DVB-S2 - LOCKED!");  break;
                                        default : ow.setState("Ehh "+ lastword);    break;
                                    }
                                }
                                break;
                            }
                            case "4":
                            {
                                //System.out.println("I pwr = "+lastword);
                                int v = Integer.valueOf(lastword);
                                if(v >=0 && v <= 255)
                                {
                                    ow.setSignalStrength(v);
                                }
                                break;
                            }
                            case "7":  // "I value
                            {
                                System.out.println("I " + lastword);
                                I = Integer.valueOf(lastword);
                                break;
                            }
                            case "8": // Q value, always follows I above
                            {
                                System.out.println("Q " + lastword);
                                Q = Integer.valueOf(lastword);
                                // Set IQ data to gui component..
                                I=0;
                                Q=0;
                                break;
                            }
                            case "10":
                            {
                                String value;
                                //System.out.println(lastword);
                                int v = Integer.valueOf(lastword);
                                float f = v / 100;
                                value = String.valueOf(f);
                                value += " %";
                                ow.setViterbi(value);
                                //System.out.println(lastword);
                            }
                            case "12":
                            {
                                String value;
                                //System.out.println(lastword);
                                int v = Integer.valueOf(lastword);
                                float f = v / 10;
                                value = String.valueOf(f);
                                value += " dB";
                                ow.setMER(value);
                                break;
                            }
                            case "13":
                            {
                                ow.setProvider(lastword);
                                break;
                            }
                            
                        }
                    }
                }
            }         
        }
    }
}
