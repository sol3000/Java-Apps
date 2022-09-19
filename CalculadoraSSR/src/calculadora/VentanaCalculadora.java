/**
 *
 * @author Soledad Soto
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;



public class VentanaCalculadora extends JFrame
{
    // contenedor general y paneles donde colocaremos los botones 
    JPanel panel, panelNumeros, panelOperaciones;
    
    // display de introducción datos y resultados 
    JTextField pantalla;
    
    // guarda el resultado de la operacion anterior o el número tecleado 
    double resultado;
    
    // para guardar el operador introducido (+,-,*,/) a realizar 
    String operacion;
    
    // Indica si estamos iniciando o no una operación 
    boolean nuevaOperacion = true;
    
    // Array de botones 
    JButton btn [] = new JButton [17];
    
    // Constructor. Crea los botones y componentes de la calculadora   
    public VentanaCalculadora()  {
   
        //crea JFrame como contenedor
        
        super();												             	
        setSize(300, 400); // dimensiones de la ventana contenedora
        setTitle("Calculadora");    //título de la ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //cerrar la ventana
        
        
        panel = new JPanel();	// dibujar sobre el panel
        this.add(panel);
        
        //añadimos panel a la ventana principal
        panel.setLayout(null);
        panel.setLayout(new BorderLayout());
        
        pantalla = new JTextField("0");
        pantalla.setBorder(new EmptyBorder(5, 5, 5, 5));        
        pantalla.setFont(new Font("Arial", Font.BOLD, 25));
        pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
        pantalla.setEditable(false);	//no permite modificar el texto
        pantalla.setBackground(Color.WHITE);	//fondo del editor
        this.add("North", pantalla);	//posición de la pantalla arriba del panel
        
        //añadimos panel números
        panelNumeros = new JPanel();
        panelNumeros.setLayout(new GridLayout(4, 3));	// contiene 4 filas 3 columas de botones
        panelNumeros.setBorder(new EmptyBorder(5, 5, 5, 5));	//espacio libre del panel        					        
        panel.add("Center", panelNumeros); //posición del panel numérico centrado.	
        
        //añadimos el panel de operaciones
        panelOperaciones = new JPanel();
        panelOperaciones.setLayout(new GridLayout(6, 1)); // contiene 6 filas 1 columas de botones
        panelOperaciones.setBorder(new EmptyBorder(5, 5, 5, 5)); //espacio libre del panel 
        panel.add("East", panelOperaciones); //posición del panel operaciones derecha.   
        
        generarBotones();        
        eventos();
                     
    }
   
     private void generarBotones(){
        
        for (int i=btn.length-1; i>=0;i--){
        	btn [i] = new JButton (""+i);
                btn [i].setForeground(Color.BLUE);                                                
        }
	        
		        btn[0].setToolTipText("0"); 
		        btn[1].setToolTipText("1"); 
		        btn[2].setToolTipText("2"); 
		        btn[3].setToolTipText("3"); 
		        btn[4].setToolTipText("4"); 
		        btn[5].setToolTipText("5"); 
		        btn[6].setToolTipText("6"); 
		        btn[7].setToolTipText("7"); 
		        btn[8].setToolTipText("8"); 
		        btn[9].setToolTipText("9"); 
		        btn[10].setToolTipText("+"); 
		        btn[11].setToolTipText("-"); 
		        btn[12].setToolTipText("*"); 
		        btn[13].setToolTipText("/"); 
		        btn[14].setToolTipText("="); 
		        btn[15].setToolTipText("CE");
		        btn[16].setToolTipText(".");
		        
        
        for(int i=0;i<btn.length;i++){
        	
        	if(i>0 && i<=9){
        
        		panelNumeros.add(btn[i]); //los añade en el panel de numeros
        	
        	}else{
        		if(i==10){
        			btn[i].setText("+");
                                btn[i].setForeground(Color.RED);
        		}if(i==11){
        			btn[i].setText("-");
                                btn[i].setForeground(Color.RED);
        		}if(i==12){
        			btn[i].setText("*");
                                btn[i].setForeground(Color.RED);
        		}if(i==13){
        			btn[i].setText("/");
                                btn[i].setForeground(Color.RED);
        		}if(i==14){
        			btn[i].setText("=");
                                btn[i].setForeground(Color.RED);
        		}if(i==15){
        			btn[i].setText("CE");
                                btn[i].setForeground(Color.RED);
        		}if(i==16){
        			btn[i].setText(".");
                                btn[i].setForeground(Color.RED);
        		}
        		if(i!=16){
        		panelOperaciones.add(btn[i]);	//los añade en el panel de operaciones
        		}        		        
        	}
        }
        
        panelNumeros.add(btn[0]);                
        panelNumeros.add(btn[16]);
        
    }
    
    private void eventos(){
        
        //Eventos para introducir datos por teclado
        pantalla.addKeyListener(new KeyListener() 
		        {
		            
		            @Override
		            public void keyTyped(KeyEvent ke) {
		                       
		            }
		            @Override
		            public void keyPressed(KeyEvent ke) {
		                                        
		                if(String.valueOf(ke.getKeyChar()).equals("+") 
		                    || String.valueOf(ke.getKeyChar()).equals("-")
		                    || String.valueOf(ke.getKeyChar()).equals("/") 
		                    || String.valueOf(ke.getKeyChar()).equals("*") 
		                    || String.valueOf(ke.getKeyChar()).equals("=")
		                    || String.valueOf(ke.getKeyChar()).equals("\n")){                        
                                        System.out.println(String.valueOf(ke.getKeyChar()));
                                        operacionPulsado(String.valueOf(ke.getKeyChar()));                        
		                    
                                }else{                        
		                    numeroPulsado(String.valueOf(ke.getKeyChar()));    
		                    }		                    
		                    
		            }
		            @Override
		            public void keyReleased(KeyEvent ke) {
		                  
		            }
		        });	     	            
    
    //Eventos para introducir datos con el raton    
        for(int i=0;i<btn.length;i++){    
            
            if(i>=0 && i<10){
            
		btn[i].addMouseListener(new MouseAdapter() {
		    
		    @Override
		    public void mouseReleased(MouseEvent e) {
		            
		    	//btn se crea cada vez para implementar la escucha
		        JButton btn = (JButton) e.getSource();
		        
		            numeroPulsado(btn.getText());                             
		    }       
		}); 		        
            }else{
        		
                btn[i].addMouseListener(new MouseAdapter() 
    	        {
    	            @Override
    	            public void mouseReleased(MouseEvent e) 
    	            {   
                        //btn se crea cada vez para implementar la escucha
    	                JButton btn = (JButton) e.getSource();    	               
    	                operacionPulsado(btn.getText());                                                   
    	            }       
    	        });        	            	        	    
            }                
        }

    }
       
    //Gestiona las pulsaciones de teclas numéricas    
    private void numeroPulsado(String digito) {
            
        if (pantalla.getText().equals("0") || nuevaOperacion) 
        {
         pantalla.setText(digito);
         nuevaOperacion = false;
         pantalla.requestFocus();
        } else{
            
            switch (digito){    // digito es la tecla pulsada
                case "0": if (!nuevaOperacion) 
                          {
                          pantalla.setText(pantalla.getText() + digito);
                          }                
                          nuevaOperacion = false;
                break;
                case ".":                
                    pantalla.setText(pantalla.getText() + digito);;
                    nuevaOperacion = false;
                break;
                case "1":                
                    pantalla.setText(pantalla.getText() + digito);;
                    nuevaOperacion = false;
                break;
                case "2": 
                    pantalla.setText(pantalla.getText() + digito);
                    nuevaOperacion = false;
                break;
                case "3": 
                    pantalla.setText(pantalla.getText() + digito);
                    nuevaOperacion = false;
                break;
                case "4": 
                    pantalla.setText(pantalla.getText() + digito);
                    nuevaOperacion = false;
                break;
                case "5": 
                    pantalla.setText(pantalla.getText() + digito);
                    nuevaOperacion = false;
                break;
                case "6": 
                    pantalla.setText(pantalla.getText() + digito);
                    nuevaOperacion = false;
                break;
                case "7": 
                    pantalla.setText(pantalla.getText() + digito);
                    nuevaOperacion = false;
                break;
                case "8": 
                    pantalla.setText(pantalla.getText() + digito);
                    nuevaOperacion = false;
                break;
                case "9": 
                    pantalla.setText(pantalla.getText() + digito);
                    nuevaOperacion = false;
                break;          
            }
        }
        pantalla.requestFocus();
    }
   
    
    // Gestiona las pulsaciones de teclas de operación
    private void operacionPulsado(String tecla)  {
   
        System.out.println(tecla);
        if (tecla.equals("=") || tecla.equals("\n")) 
        {            
            calcularResultado();
        } else if (tecla.equals("CE")) 
        {
            resultado = 0;
            pantalla.setText("");
            nuevaOperacion = true;
        } else 
        {            
            operacion = tecla;
            
            if ((resultado > 0) && !nuevaOperacion) 
            {                
                calcularResultado();
                
            } else 
            {
                
                resultado = new Double(pantalla.getText());
            }
        }
        nuevaOperacion = true;
        pantalla.requestFocus();
    }
 
    // Calcula el resultado y lo muestra por pantalla
    private void calcularResultado() 
    {
        if (operacion.equals("+")) 
        {
            resultado += new Double(pantalla.getText());
        } else if (operacion.equals("-")) 
        {
            resultado -= new Double(pantalla.getText());
        } else if (operacion.equals("/")) 
        {
            resultado /= new Double(pantalla.getText());
        } else if (operacion.equals("*")) 
        {
            resultado *= new Double(pantalla.getText());
        }
 
        pantalla.setText("" + resultado);
        operacion = "";
        resultado=0;
        pantalla.requestFocus();

    }   
}