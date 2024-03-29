// Server.java
// Set up a Server that will receive a connection from a client, send 
// a string to the client, and close the connection.
import java.io.*;
import java.net.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;
import javax.swing.*;
     
    public class Server extends JFrame {
       private JTextField enterField;
       private JTextArea displayArea;
       private ObjectOutputStream output;
       private ObjectInputStream input;
       private ServerSocket server;
       private Socket connection;  
       private int counter = 1, upperBound = 10, guessTime, luckyNum;
    
      // set up GUI
      public Server()
      {
         super( "Server" );
   
          Container container = getContentPane();
         // create enterField and register listener
          enterField = new JTextField();
          enterField.setEditable( false );
        enterField.addActionListener(
             new ActionListener() {
   
                // send message to client
                public void actionPerformed( ActionEvent event )
               {
				  System.out.println(event.getActionCommand());
                  sendData( event.getActionCommand() );
                  enterField.setText( "" );
               }
            }  
          ); 
   
         container.add( enterField, BorderLayout.NORTH );
    
         // create displayArea
         displayArea = new JTextArea();
         container.add( new JScrollPane( displayArea ), 
            BorderLayout.CENTER );
    
         randomNum();
         setSize( 300, 150 );
         setVisible( true );
   
       } // end Server constructor
    
       //Create Random Number 
       public void randomNum() {
         Random rand = new Random();
         luckyNum = rand.nextInt(upperBound) + 1;
         guessTime = 0; 
       }

       public void checkGuess(int guessNum){
         guessTime ++;
         if (guessNum > upperBound || guessNum < 1) {
            sendData("Please guess value between 1-10");
         }else if (guessNum < luckyNum) {
            sendData("Nice try, wrong guess, try a larger number");
         }else if (guessNum > luckyNum) {
            sendData("Nice try, wrong guess, try a smaller number");
         }else if (guessNum == luckyNum) {
            sendData("You have a nice guess\n\nTotal guess: " + guessTime +"\n\nStart a new game\n");
            randomNum();
         }
       }


       // set up and run server 
       public void runServer()
       {
          // set up server to receive connections; process connections
         try {
   
             // Step 1: Create a ServerSocket.
            server = new ServerSocket( 7654, 100 );

               try {

                   waitForConnection(); // Step 2: Wait for a connection.
                   //getStreams();        // Step 3: Get input & output streams.
                   //processConnection(); // Step 4: Process connection.
				   //end while
               }
    
                // process EOFException when client closes connection 
                catch ( EOFException eofException ) {
                   System.err.println( "Server terminated connection" );
                }
   
                finally {
                  //  closeConnection();   // Step 5: Close connection.
                  // ++counter;
               }

          } // end try
    
         // process problems with I/O
          catch ( IOException ioException ) {
             ioException.printStackTrace();
          }
    
       } // end method runServer
   
       // wait for connection to arrive, then display connection info
       private void waitForConnection() throws IOException
      {
          displayMessage( "Waiting for connection\n" );
		  

          connection = server.accept(); // allow server to accept connection 
		  new ClientHandler(connection).start();

          displayMessage( "Connection " + counter + " received from: \n" +
          connection.getInetAddress().getHostName() );
       }
    
     // get streams to send and receive data
     private void getStreams() throws IOException
     {
        // set up output stream for objects
       output = new ObjectOutputStream( connection.getOutputStream() ); 
       output.flush(); // flush output buffer to send header information
  
        // set up input stream for objects
        input = new ObjectInputStream( connection.getInputStream() );

        displayMessage( "\nGot I/O streams\n" );
     }
  
     // process connection with client
     private void processConnection() throws IOException
     {
        // send connection successful message to client
        String message = "Connection successful \n Guess a number between 1-10";
        sendData( message );
 
        // enable enterField so server user can send messages
        setTextFieldEditable( true );
  
        do { // process messages sent from client
 
           // read message and display it
           try {
              message = ( String ) input.readObject();
             displayMessage( "\n" + message );
             checkGuess(Integer.parseInt(message.substring(10)));
           }
  
           // catch problems reading from client
           catch ( ClassNotFoundException classNotFoundException ) {
              displayMessage( "\nUnknown object type received" );
         }

       } while ( !message.equals( "CLIENT>>> TERMINATE" ) );
  
     } // end method processConnection
  
     // close streams and socket
    private void closeConnection() 
     {
        displayMessage( "\nTerminating connection\n" );
       setTextFieldEditable( false ); // disable enterField
 
       try {
           output.close();    
           input.close();     
          connection.close();
        }
        catch( IOException ioException ) {
          ioException.printStackTrace();
        }
     }
  
     // send message to client
     private void sendData( String message )
    {
        // send object to client
        try {
           output.writeObject( "SERVER>>> " + message );
           output.flush();                              
           displayMessage( "\nSERVER>>> " + message );
        }
  
       // process problems sending object
        catch ( IOException ioException ) {
           displayArea.append( "\nError writing object" );
        }
     }
  
    // utility method called from other threads to manipulate 
     // displayArea in the event-dispatch thread
     private void displayMessage( final String messageToDisplay )
     {
        // display message from event-dispatch thread of execution
        SwingUtilities.invokeLater(
           new Runnable() {  // inner class to ensure GUI updates properly
  
              public void run() // updates displayArea
              {
                 displayArea.append( messageToDisplay );
                 displayArea.setCaretPosition( 
                 displayArea.getText().length() );
              }
  
           }  // end inner class
  
        ); // end call to SwingUtilities.invokeLater
     }
  
     // utility method called from other threads to manipulate 
     // enterField in the event-dispatch thread
     private void setTextFieldEditable( final boolean editable )
     {
        // display message from event-dispatch  thread of execution
        SwingUtilities.invokeLater(
           new Runnable() {  // inner class to ensure GUI updates properly
  
              public void run()  // sets enterField's editability
              {
                 enterField.setEditable( editable );
              }  
          }  // end inner class
  
        ); // end call to SwingUtilities.invokeLater
     }
  
     private class ClientHandler extends Thread
		{	ClientHandler(Socket client)
		{	this.client = client;
		}
		
		public void run()
		{
		
				try {
				
				      while (true) 
				     {
                     getStreams();        // Step 3: Get input & output streams.
                     processConnection(); // Step 4: Process connection.
					 }
               }
    
                // process EOFException when client closes connection 
                catch ( EOFException eofException ) {
                   System.err.println( "Server terminated connection" );
                }
				  catch ( IOException ioException ) {
                   ioException.printStackTrace();
                }
		
		
		         
		}
		
		private Socket client = null;

	}

  
  
     public static void main( String args[] )
     {
        Server application = new Server();
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.runServer();
    }
 
  }  // end class Server

