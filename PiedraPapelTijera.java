 java.util.Scanner;
 
public class PiedraPapelTijera
{
   public static void main(String args[])
   {
      System.out.println("Juego piedra-papel-tijera");
      Scanner teclado = new Scanner(System.in);
 
      int seleccionCompu = (int)(Math.random() * 5) + 1;
      System.out.println("La computadora ya escogio...");
 
      System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera, 4=Lagarto, 5=Spock]: ");
      int seleccionUsuario = teclado.nextInt();
 
      System.out.print("La computadora habia escogido: ");
      switch ( seleccionCompu )
      {
         case 1:
            System.out.println("Piedra");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("Empate!"); break;
               case 2: System.out.println("Usted gana!"); break;
               case 3: System.out.println("La computadora gana!"); break;
               case 4: System.out.println("La computadora gana!"); break;
               case 5: System.out.println("Usted gana!"); break;
            }
            break;
 
         case 2:
            System.out.println("Papel");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("La computadora gana!"); break;
               case 2: System.out.println("Empate!"); break;
               case 3: System.out.println("Usted gana!"); break;
               case 4: System.out.println("Usted gana!"); break;
               case 5: System.out.println("La computadora gana!"); break;
            }
            break;
 
         case 3:
            System.out.println("Tijera");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("Usted gana!"); break;
               case 2: System.out.println("La computadora gana!"); break;
               case 3: System.out.println("Empate!"); break;
               case 4: System.out.println("La computadora gana!"); break;
               case 5: System.out.println("Usted gana!"); break;
            }
            break;
      }
   }
}
//primera edicion del documento

//segunda edicion del documento