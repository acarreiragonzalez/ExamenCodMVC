package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Superficies {

    private static Scanner sc;

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
       
        Modelo lalala=new Modelo();
       
//introducese na variable aux o método realizar operacion, xunto cos valores de num1, e num2
      float aux =realizarOperacion(lalala.getNum1(),lalala.getNum2()); 
        //O valor dese resultado introducese en set resultado para poder usalo na clase vista
       lalala.setResultado(aux);
       //co método imprimir na clase vista imprimimos este obxecto con todos os datos
       Vista.imprimir(lalala);
       
       
       

    }//Relizar operacion pide dous numeros como parámetros que se introducirán por escaner, e , despendendo do String introducido, medieante un if, calculará as diferentes áreas.
    //A variable resultado gardará este valor e retornarao.
     public static float realizarOperacion(float n1, float n2){
       
         //variable que garda o resultado
         float resultado=0;
         //variable que garda diferentes valores no if para identificar cada figura na clase Vista.
        float resposta=0;
  Modelo pa=new Modelo();
         
          String shapeType;
          Modelo lalala=new Modelo();
          sc = new Scanner(System.in);

        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        shapeType = sc.nextLine();
        System.out.println("You said: " + shapeType);

        if (shapeType.equals("square")) {
           
            
            float sideLength;
            resposta=1;

            System.out.println("what is the side length?");
            n1= sc.nextFloat();
        
            resultado = n1 * n1;
      
            

        }
        if (shapeType.equals("rectangle")) {
            //add area calculations for rectangle here
            
            
            resposta=2;

            System.out.println("what is the rectangles width?");
            n1 = sc.nextFloat();
           
            System.out.println("What is the rectangles height?");
            n2 = sc.nextFloat();
            
            resultado = n1 * n2;
            
           

        }
        if (shapeType.equals("triangle")) {
            //add area calculations for triangle here
            
           
resposta=3;
            System.out.println("What is the base length of the triangle?");
            n1 = sc.nextFloat();
            System.out.println("What is the height of the triangle?");
            n2 = sc.nextFloat();
            resultado = (float) (0.5 * n1 * n2);
            

        }
        if (shapeType.equals("circle")) {
            //add area calculations for a circle here
            
            
resposta=4;
            System.out.println("What is the radius of the circle?");
            n1 = sc.nextFloat();
            resultado = n1 * n1;
            resultado = (float) (3.14159265 * resultado);
            

        }
        pa.setResposta(resposta);
        
         return resultado;
         
         
        
        }
}
