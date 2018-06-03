package group9.healthband;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.net.DatagramSocket;

public class HomeActivity extends AppCompatActivity {

    int udpPort = 1025;
    DatagramSocket socket;
    boolean appInBackground = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final TextView temp = (TextView) findViewById(R.id.temp);
        final TextView statusfall = (TextView) findViewById(R.id.fallstatus);
        final Button refreshButton = (Button) findViewById(R.id.refresh);
        //final TextView temp = (TextView) findViewById(R.id.temp);
        //final TextView statusfall = (TextView) findViewById(R.id.fallstatus);
        //final Button refreshButton = (Button) findViewById((R.id.refresh);
        boolean appInBackground = false;
        int udpPort = 1025;
        DatagramSocket socket;
        /**
         (new Thread(new Runnable() {

        @Override
        public void run() {
        try{
        socket = new DatagramSocket(udpPort);
        while(true){
        if (appInBackground) continue;
        try{
        sendUdpData( Commands.GET_ALL_SENSORS_DATA, null);
        Thread.sleep(10000);
        } catch (Exception e){
        e.printStackTrace();
        }
        }
        } catch (Exception e){
        e.printStackTrace();
        }
        }
        })).start();
         }

         void sendUdpData( Commands cmd, byte[] params) {
         try {
         final DatagramPacket packet;
         int paramsLength = ( params != null ? params.length : 0);
         byte data[] = new byte[paramsLength + 1];
         byte command[] = new byte[1];
         command[0] = cmd.getValue();
         System.arraycopy( command, 0, data, 0, command.length);
         if ( params != null) System.arraycopy(params, 0, data, 1, params.length);
         packet = new DatagramPacket( data, data.length, getBroadcastAddress(), udpPort);
         socket.send( packet);
         } catch( IOException e){
         e.printStackTrace();
         }
         }
         */

        //(new Thread(new Runnable() {
        //@Override
        //public void run() {
        //try{
        //socket = new DatagramSocket(udpPort);
        //while(true){
        //if (appInBackground) continue;
        //try{
        //sendUdpData( Commands.GET_ALL_SENSORS_DATA, null);
        //Thread.sleep(10000);
        //} catch (Exception e){
        //e.printStackTrace();
        //}
        //}
        //} catch (Exception e){
        //e.printStackTrace();
        //}
        //}
        //})).start();
        //}
        //
        //void sendUdpData( Commands cmd, byte[] params) {
        //try {
        //final DatagramPacket packet;
        //int paramsLength = ( params != null ? params.length : 0);
        //byte data[] = new byte[paramsLength + 1];
        //byte command[] = new byte[1];
        //command[0] = cmd.getValue();
        //System.arraycopy( command, 0, data, 0, command.length);
        //if ( params != null) System.arraycopy(params, 0, data, 1, params.length);
        //packet = new DatagramPacket( data, data.length, getBroadcastAddress(), udpPort);
        //socket.send( packet);
        //} catch( IOException e){
        //e.printStackTrace();
        //}
        //}
        //
    }
}
